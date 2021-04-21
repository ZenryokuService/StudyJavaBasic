package ysg.josys.name.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import ysg.josys.name.NaturalBornServlet;

/**
 * NaturalBornServletから起動するクラス。
 * HTTPリクエストを受けたときはこのクラスのrun()が起動する
 *
 * @author 作成者の名前
 * @see NaturalBornServlet
 */
public class HttpSocketServlet implements Runnable {
	private static final boolean DEBUG = true;

	private Socket socket;
	/** リクエストの読み込み */
	private BufferedReader request;
	/** レスポンス */
	private PrintWriter response;

	/** コンストラクタ
	 * @throws IOException */
	public HttpSocketServlet(Socket socket) throws IOException {
		System.out.println("<<<<< Execute HttpSocketServlet >>>>>");
		this.socket= socket;
		this.request  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		this.response = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
	}

	@Override
	public void run() {
		final String SEP = System.lineSeparator();
		String reqStr = null;
		try {
			reqStr = readRequest(request);
			System.out.println("IN; " + reqStr);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		String responseTxt = getHttpResponse("<html><body>Hello World!</body></html>");
		// レスポンスを返す
		response.write(responseTxt + SEP);
		response.flush();

		while(true) {
			break;
		}

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
//		System.out.println("**** read() : " + in.read());
//		System.out.println("**** ready() : " + in.ready());
//		System.out.println("**** readLine() : " + in.readLine());

        // CRとCRLFの場合で入力が終了している時がある
        while((read = in.read()) > 0) {
            // 空の場合
            if (read == 10 || read == 13) {
            	System.out.println("*** read break ***");
            	break;
            }
            char ch = (char) read;
            inputTxt.append(ch);
        }
        if (DEBUG) System.out.println("*** サーバーソケット: 完了：readRequest(): " + inputTxt + " ***");
        return inputTxt.toString();
	}

	private String getHttpResponse(String param) {
		StringBuilder response = new StringBuilder();
		final String SEP = System.lineSeparator();

//		response.append("200 OK" + SEP);
//		response.append("Access-Control-Allow-Origin: *" + SEP);
//		response.append("Connection: Keep-Alive" + SEP);
//		response.append("Content-Encoding: gzip" + SEP);
//		response.append("Content-Type: text/html; charset=utf-8" + SEP);
//		response.append("Date: Mon, 18 Jul 2016 16:06:00 GMT" + SEP);
//		response.append("Etag: \"c561c68d0ba92bbeb8b0f612a9199f722e3a621a\"" + SEP);
//		response.append("Keep-Alive: timeout=5, max=997" + SEP);
//		response.append("Last-Modified: Mon, 18 Jul 2016 02:36:04 GMT" + SEP);
//		response.append("Server: NaturalBorn" + SEP);
//		response.append("Set-Cookie: mykey=myvalue; expires=Mon, 17-Jul-2017 16:06:00 GMT; Max-Age=31449600; Path=/; secure" + SEP);
//		response.append("Transfer-Encoding: chunked" + SEP);
//		response.append("Vary: Cookie, Accept-Encoding" + SEP);
//		response.append("X-Backend-Server: developer2.webapp.scl3.mozilla.com" + SEP);
//		response.append("X-Cache-Info: not cacheable; meta data too large" + SEP);
//		response.append("X-kuma-revision: 1085259" + SEP);
//		response.append("x-frame-options: DENY" + SEP);
//		response.append(SEP);
		response.append(param);

		return response.toString();
	}

}
