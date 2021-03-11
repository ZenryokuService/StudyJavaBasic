package ysg.teacher.tkm.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * インストールしたH2DBの管理クラス(DAO)
 *
 * @author 作成者の名前
 *
 */
public class H2dbManager {
	/** このクラスのインスタンス */
	private static H2dbManager instance;
	/** DBコネクション */
	private Connection con;

	/**
	 * コンストラクタ、H2DBのコネクションを取得する。
	 */
	private H2dbManager() {
		try {

			con = DriverManager.getConnection("jdbc:h2:D:\\Apps\\H2\\database");
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("select * from TEST;");
			result.next();
			String id = result.getString(1);
			String name = result.getString(2);
			System.out.println("ID: " + id + "Name: " + name);
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	public static H2dbManager getInstance() {
		if (instance == null) {
			instance = new H2dbManager();
		}
		return instance;
	}


}
