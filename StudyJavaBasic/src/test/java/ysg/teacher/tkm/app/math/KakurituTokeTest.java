package ysg.teacher.tkm.app.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class KakurituTokeTest {

	private static KakurituToke main;

	@BeforeAll
	public static void init() {
		main = new KakurituToke();
	}

	@Test
	public void testKaijo1() {
		assertEquals(6, main.kaijo(3));
		assertEquals(24, main.kaijo(4));
		assertEquals(120, main.kaijo(5));
		assertEquals(60, main.junretu(5, 3));
		assertEquals(60, main.kumiawase(10, 2));
	}
}
