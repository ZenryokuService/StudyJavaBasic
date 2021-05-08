package ysg.teacher.tkm.sukiri1.lesson6.util;

public class PrintUtil {
	/**
	 * 標準出力へ出力していた処理をメソッドにした。
	 * 「足すと total / 引くと delta」のように標準出力へ出力する
	 * @param total 整数型の変数
	 * @param delta 整数型の変数
	 */
	public static void printOut(int total, int delta) {
		System.out.println("足すと" + total + " / 引くと" + delta);
	}

	/**
	 * 上の日本語部分も引数で指定できるようにした。
	 *
	 * @param tasuto totalの説明文言
	 * @param total 整数型の変数
	 * @param hikuto hikuの説明文言
	 * @param delta 整数型の変数
	 */
	public static void printOut(String tasuto, int total,String hikuto, int delta) {
		System.out.println( tasuto + total + hikuto + delta);
	}
}
