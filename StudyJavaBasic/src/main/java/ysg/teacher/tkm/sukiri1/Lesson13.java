package ysg.teacher.tkm.sukiri1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Lesson13 {

	public static void main(String[] args) {
		try {
			Class.forName("org.h2.Driver");
			Connection con = DriverManager.getConnection("jdbc:h2:C:/Users/teacher/Documents/dabases/test");
			Statement stmt = con.createStatement();
			con.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
