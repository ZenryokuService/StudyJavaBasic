package ysg.teacher.tkm.sukiri1.lesson6.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * CalcLogicクラスのテストクラス
 * @author 作成者の名前
 *
 */
public class CalcLogicTest {

	@Test
	public void testAvg01() {
		int[] scores = {1,2,3,4,5};
		assertEquals(10, CalcLogic.avg(30, 3));
		assertEquals(6, CalcLogic.avg(30, 5));
		assertEquals(3, CalcLogic.avg(30, 10));
		assertEquals(1, CalcLogic.avg(30, 30));
		assertEquals(7.5, CalcLogic.avg(30, 4, 2));
		assertEquals(7.75, CalcLogic.avg(31, 4, 3));

	}
}
