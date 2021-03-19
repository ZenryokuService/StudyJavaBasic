package ysg.josys.name;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * クライアントアプリ、サーバーソケットへデータを送信する。
 *
 * @author 作成者の名前
 * @see NaturalBornServlet
 */
public class ClientMain {
	/** 自身のインスタンス */
	private static ClientMain main;
	/** クライアントソケット */
	private Socket sock = null;
	/** 送信用のクラス */
	private PrintWriter send;
	/** 受信用のクラス */
	private BufferedReader response;

	/** 改行コード */
	private static final char SEP = (char) 10;

	public ClientMain() {
		try {
			sock = new Socket("localhost", NaturalBornServlet.PORT_NO);
		} catch (IOException e) {
			System.out.println("*** ソケットで例外が発生しました。 ***");
		}
	}

	/**
	 * デストラクタ
	 */
	@Override
	public void finalize() {
		try {
			sock.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sock = null;
		}
	}

	/**
	 * 標準入力からサーバーソケットへデータを送信する。
	 *
	 * @return 終了時のメッセージ
	 */
	public String execute() {
		try (Scanner scan = new Scanner(System.in)) {
			while(true) {
				System.out.println("*** クライアントソケット: 入力 ***");
				String input = scan.nextLine();

				// リクエストの送信
				sendRequest(input);

				if ("bye".equals(input)) {
					System.out.println("*** クライアントアプリを終了します。***");
					break;
				}
				// レスポンスを受信する
				System.out.println("クライアント: " + getResponse());
			}
		}

		return "クライアントを終了しました。";
	}

	private void sendRequest(String in) {
		try {
			//System.out.println("*** クライアントソケット: リクエスト送信" + in + " ***");
			send = new PrintWriter(sock.getOutputStream());

			send.write(in + SEP);
			send.flush();
//			send.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * サーバーからのレスポンスを受ける。
	 * @throws IOException
	 */
	private String getResponse() {
		StringBuilder build = new StringBuilder();
		try {
			// System.out.println("*** クライアントソケット: レスポンス受信 ***");
			if (response == null) {
				response = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			}
			while (true) {
				int read = response.read();
				if (read == 13 || read == 10) {
					break;
				}
				char ch = (char) read;
				build.append(ch);
			}
			//response.close();
		} catch (IOException e) {
			e.printStackTrace();
			build.append(" Errors... ");
		}
		// System.out.println("*** クライアントソケット: 完了：レスポンス受信 ***");
		return build.toString();
	}

	public static void main(String[] args) {
		ClientMain main = new ClientMain();
		String mes = main.execute();
		System.out.println(mes);
	}
 }
