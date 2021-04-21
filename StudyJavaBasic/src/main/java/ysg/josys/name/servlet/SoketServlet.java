package ysg.josys.name.servlet;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SoketServlet implements Runnable {
	private static final boolean DEBUG = true;
	/** ソケット */
	private Socket socket;
	/** リクエストの読み込み */
	private InputStreamReader request;
	/** レスポンス */
	private PrintWriter response;

	/** コンストラクタ
	 * @throws IOException */
	public SoketServlet(Socket socket) throws IOException {
		System.out.println("<<<<< Execute SoketServlet >>>>>");
		this.socket = socket;
		this.request  = new InputStreamReader(socket.getInputStream());
		this.response = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
	}

	@Override
	public void run() {
    	if (DEBUG) System.out.println("*** run in Socket Servlet ***");
		StringBuilder inputTxt = new StringBuilder();
		int read = 0;
		while (true) {
			try {
		        // CRとCRLFの場合で入力が終了している時がある
				boolean isEnd = request.ready();
		        while(isEnd == false && (read = request.read()) <= 0) {
	            	System.out.println(read);
		            // 空の場合
		            if (request.ready() && (read == 10 || read == 13)) {
		            	System.out.println("*** read break ***");
		            	break;
		            }
		            char ch = (char) read;
		            inputTxt.append(ch);
		        }
            	System.out.println("*** get input ***");
		        String in = inputTxt.toString();
		        if (isBye(in)) {
		        	System.out.println("*** SocketServer終了 ***");
		        	break;
		        }
				response.write(in.equals("") ? "初回データ" : in.toString());
				response.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 入力が"bye"の時はTRUEを返す。
	 * @param inputTxt
	 * @return true: 入力値が"bye" false: それ以外
	 */
	private boolean isBye(String inputTxt) {
		if (inputTxt != null && inputTxt.startsWith("bye")) {
			System.out.println("*** サーバーを終了します。 ***");
			return true;
		}
		return false;
	}


}
