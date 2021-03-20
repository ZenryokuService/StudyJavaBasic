package ysg.teacher.tkm.sukiri2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JspLlesson1 extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("txtext/html; charset=UTF-8");
		PrintWriter write = res.getWriter();
		write.println("<html><body>Hello World</body></html>");
	}
}
