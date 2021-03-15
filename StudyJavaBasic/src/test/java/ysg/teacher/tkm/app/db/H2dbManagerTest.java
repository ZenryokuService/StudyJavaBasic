package ysg.teacher.tkm.app.db;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

public class H2dbManagerTest {
	private static H2dbManager target;

	@BeforeClass
	public static void init() {
		target = H2dbManager.getInstance();
	}

	@Test
	public void test01() {
		System.out.println("テスト");
	}

	@Test
	public void testSql01() {
		target.executeQuery("select * from test;");
	}

	@Test
	public void testCreateTable01() {
		String sql = "create table if not exists items ("
				+ "id bigint not null auto_increment, "
				+ "cetegory_id varchar(20) not null, "
				+ "item_name varchar(20) not null, "
				+ "money int not null, "
				+ "effect_id varchar(20) not null, "
				+ "effect_value int not null, "
				+ "weight int not null, "
				+ "number_of_times int not null);";
		assertTrue(target.execute(sql));
	}

	@Test
	public void testExecuteQuery01() {
		target.executeQuery("show Tables;");
	}

	//@Test
	public void testCsv() {
		System.out.println("*** Testing ***");
		Path file = Paths.get("src/main/resources/Items.csv");
		try {
			target.importCsv(file);
		} catch (IOException e) {
			e.printStackTrace();
			fail();
		} catch (SQLException e) {
			e.printStackTrace();
			fail();
		}
	}

}
