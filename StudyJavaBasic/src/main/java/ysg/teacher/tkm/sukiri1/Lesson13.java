package ysg.teacher.tkm.sukiri1;

/**
 * 【参照クラス】
 * Hero, Dancer, Character: lesson11.player
 * Wizard: lesson12.player
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Lesson13 {

	public static void main(String[] args) {
	}

	public static void dbConnect() {
		try {
			Class.forName("org.h2.Driver");
			Connection con = DriverManager.getConnection("jdbc:h2:C:/Users/teacher/Documents/dabases/test");
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("select * from test;");
			result.next();
			String id = result.getString(1);
			String name = result.getString(2);
			System.out.println(id + " : " + name);
			con.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}


}
