package ysg.teacher.tkm.app.db;

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
}
