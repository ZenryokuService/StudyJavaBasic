package ysg.teacher.tkm.app.main;

import java.util.Scanner;

public class BooleanTest {
	/**
	 * IF文の論理式をマスターするためのアプリケーション
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("０～");
		Scanner scan = new Scanner(System.in);

		// 終了するときは初めに0を入力
		while(true) {
			System.out.println("1つ目の数を入力してください");
			int left = scan.nextInt();

			System.out.println("2つ目の数を入力してください");
			int right = scan.nextInt();

			if (left == right) {
				System.out.println(left + " == " + right);
			}
			if (left != right) {
				System.out.println(left + " != " + right);
			}
			if (left < right) {
				System.out.println(left + " < " + right);
			}
			if (left > right) {
				System.out.println(left + " > " + right);
			}
			if (left <= right) {
				System.out.println(left + " <= " + right);
			}
			if (left >= right) {
				System.out.println(left + " >= " + right);
			}

			if (left == 0) {
				System.out.println("プログラムを終了します。");
				break;
			}
		}
	}
}
