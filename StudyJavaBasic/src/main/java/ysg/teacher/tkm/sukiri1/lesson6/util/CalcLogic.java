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

	public static double avg(int left, int right, boolean isTrue) {
		// 左側の数値
		BigDecimal bigLeft = new BigDecimal(left);
		// 右側の数値
		BigDecimal bigRight = new BigDecimal(right);

		// left + right
		BigDecimal ansTasu = bigLeft.add(bigRight);
		BigDecimal ansHiku = bigLeft.subtract(bigRight);
		BigDecimal ansKake = bigLeft.multiply(bigRight);
		BigDecimal ansWari = bigLeft.divide(bigRight);
		// 小数点第2位まで計算する指定、それ以降は四捨五入
		ansTasu.setScale(2);

		return ansTasu.doubleValue();
	}
	/**
	 * static メソッド＝メインメソッドから直接呼び出せる。
	 * @param a 整数型の引数
	 * @param b 整数型の引数
	 * @return a + bの値を返却する
	 */
	public static int tasu(int a, int b) {
		return a + b;
	}

	/**
	 * tasu()のオーバーロード。
	 * 整数型の配列を合算する。
	 * @param testResult 整数型の配列
	 * @return 合計値
	 */
	public static int tasu(int[] testResult) {
		int total = 0;

		for (int i = 0; i < testResult.length; i++) {
			total += testResult[i];
		}
		return total;
	}

	/**
	 * static メソッド＝メインメソッドから直接呼び出せる。
	 * @param a 整数型の引数
	 * @param b 整数型の引数
	 * @return a - bの値を返却する
	 */
	public static int hiku(int a, int b) {
		return a - b;
	}


}
