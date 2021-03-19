package ysg.josys.name;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 低レベルSocketサーバー。
 * サーバーとクライアントの関係を理解するためのサンプルコード。
 * 単体アプリとする
 * @author 作成者の名前
 */
public class NaturalBornServlet {
	private static final boolean DEBUG = true;
	/** 受け付けるおポート番号 */
	public static final int PORT_NO = 8081;
	/** 自分自身のインスタンス */
	private static NaturalBornServlet main;

	/** リクエスト */
	private BufferedReader request;
	/** レスポンス */
	private PrintWriter response;

	/** サーバーソケット */
	private ServerSocket server;
	/** 改行コード */
	private final char SEP = (char) 10;

	/**
	 * 外部からの起動を禁止する。プライベートコンストラクタ。
	 */
	private NaturalBornServlet() {
		try {
			server = new ServerSocket(PORT_NO);
		} catch (IOException e) {
			System.out.println("*** サーバーソケットの起動に失敗しました。 ***");
			e.printStackTrace();
			System.exit(-1);
		}
	}

	/**
	 * デストラクタ。
	 * サーバーソケットのクローズ、メモリの開放を行う。
	 */
	public void finalize() {
		try {
			server.close();
		} catch (IOException e) {
			System.out.println("*** サーバーソケットの終了に失敗しました。 ***");
			e.printStackTrace();
		} finally {
			server = null;
			main = null;
			System.exit(-1);
		}
	}

	/**
	 * 起動した、サーバーソケットで待機を行う。
	 */
	private void execute() throws IOException {
		System.out.println("*** サーバーソケット起動 ***");
		Socket sock = server.accept();
		// リクエスト
		request = new BufferedReader(new InputStreamReader(sock.getInputStream()));
		// レスポンス
		response = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));
		// リクエストの読み込み
		while(true) {
			String inputTxt = readRequest(request);
			if (inputTxt.contains("HTTP/1.1")) {
				System.out.println(readRequest(request, true));
				inputTxt = getHttpResponse(inputTxt);
				break;
			} else {
				if (isBye(inputTxt)) {
					break;
				}
			}
			if (DEBUG) System.out.println("*** サーバーソケット: リクエスト受信 " + inputTxt + "***");

			// レスポンスを返す
			response.write(inputTxt + SEP);
			response.flush();
			System.out.println("*** サーバーソケット: レスポンス送信 " + inputTxt + "***");
			inputTxt = null;
//			request = null;
//			response = null;
		}
	}

	private boolean isBye(String inputTxt) {
		if (inputTxt != null && inputTxt.startsWith("bye")) {
			System.out.println("*** サーバーを終了します。 ***");
			return true;
		}
		return false;
	}

	private String getHttpResponse(String req) {
		StringBuilder response = new StringBuilder();

		response.append("200 OK" + SEP);
		response.append("Access-Control-Allow-Origin: *" + SEP);
		response.append("Connection: Keep-Alive" + SEP);
		response.append("Content-Encoding: gzip" + SEP);
		response.append("Content-Type: text/html; charset=utf-8" + SEP);
		response.append("Date: Mon, 18 Jul 2016 16:06:00 GMT" + SEP);
		response.append("Etag: \"c561c68d0ba92bbeb8b0f612a9199f722e3a621a\"" + SEP);
		response.append("Keep-Alive: timeout=5, max=997" + SEP);
		response.append("Last-Modified: Mon, 18 Jul 2016 02:36:04 GMT" + SEP);
		response.append("Server: NaturalBorn" + SEP);
		response.append("Set-Cookie: mykey=myvalue; expires=Mon, 17-Jul-2017 16:06:00 GMT; Max-Age=31449600; Path=/; secure" + SEP);
		response.append("Transfer-Encoding: chunked" + SEP);
		response.append("Vary: Cookie, Accept-Encoding" + SEP);
		response.append("X-Backend-Server: developer2.webapp.scl3.mozilla.com" + SEP);
		response.append("X-Cache-Info: not cacheable; meta data too large" + SEP);
		response.append("X-kuma-revision: 1085259" + SEP);
		response.append("x-frame-options: DENY" + SEP);

		return response.toString();
	}

	/**
	 * 受信した、メッセージを読み込む。
	 *
	 * @param in Socketより取得した入力ストリーム
	 * @return
	 * @throws IOException
	 */
	private String readRequest(BufferedReader in) throws IOException {
		if (DEBUG) System.out.println("*** サーバーソケット: readRequest() ***");
		int read = 0;
		StringBuilder inputTxt = new StringBuilder();
        // CRとCRLFの場合で入力が終了している時がある
        while((read = in.read()) != -1) {
            // 空の場合
            if (read == 10 || read == 13) {
            	break;
            }
            char ch = (char) read;
            inputTxt.append(ch);
        }
        if (DEBUG) System.out.println("*** サーバーソケット: 完了：readRequest(): " + inputTxt + " ***");
        return inputTxt.toString();
	}

	/**
	 * 受信した、Httpメッセージを読み込む。
	 *
	 * @param in Socketより取得した入力ストリーム
	 * @return
	 * @throws IOException
	 */
	private String readRequest(BufferedReader in, boolean isHttp) throws IOException {
		if (DEBUG) System.out.println("*** サーバーソケット: readRequest(true) ***");
		int line = 0;
		int count = 0;

		StringBuilder inputTxt = new StringBuilder();
        // CRとCRLFの場合で入力が終了している時がある
        while((line = in.read()) != -1) {
            inputTxt.append((char)line);
            if (count >= 1024) {
            	break;
            }
            count++;
        }

        if (DEBUG) System.out.println("*** サーバーソケット: 完了：readRequest(true): " + inputTxt.toString() + " ***");
        return inputTxt.toString();
	}

	/**
	 * メインメソッド、ここから始まる。
	 * @param args
	 */
	public static void main(String[] args) {
		main = new NaturalBornServlet();

		try {
			main.execute();
		} catch (IOException e) {
			System.out.println("*** 例外が発生しました。 " + e.getMessage() + "***");
			e.printStackTrace();
		}

	}
}
