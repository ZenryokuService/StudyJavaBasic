package ysg.teacher.tkm.sukiri1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Lesson5Test {
	private static Lesson5 target;

	@BeforeAll
	public static void init() {
		target = new Lesson5();
	}

	@Test
	public static void code5_1Test() {
		target.code5_1();
	}
}
