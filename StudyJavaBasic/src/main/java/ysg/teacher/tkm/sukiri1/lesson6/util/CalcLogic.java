package ysg.teacher.tkm.sukiri1.lesson6.util;

import java.math.BigDecimal;

/**
 *
 * @author 作成者の名前
 * @see ysg.teacher.tkm.sukiri1.Lesson6;
 */
public class CalcLogic {

	/**
	 * 平均値を算出する。
	 * ただし、小数点以下を切り捨てする形になる。
	 *
	 * @param gokei 対象の合計値
	 * @param length 対象の分母になる値
	 * @return gokei / lengthの計算結果
	 */
	public static int avg(int gokei, int length) {
		double avg = gokei / length;
		return (int) avg;
	}

	/**
	 * 平均値を算出する。
	 * 誤差が発生する問題を、桁数指定で四捨五入する形で解決した形で計算する。
	 *
	 * @param gokei 対象の合計値
	 * @param length 対象の分母になる値
	 * @param keta 指定した桁数以下を四捨五入する
	 * @return gokei / lengthの計算結果
	 */
	public static double avg(int gokei, int length, int keta) {
		BigDecimal bigGokei = new BigDecimal(gokei);
		BigDecimal bigLength = new BigDecimal(length);

		BigDecimal ans = bigGokei.divide(bigLength);
		// 小数点第何位まで計算するか指定、それ以降は四捨五入
		ans.setScale(keta);
		return ans.doubleValue();
	}
}
