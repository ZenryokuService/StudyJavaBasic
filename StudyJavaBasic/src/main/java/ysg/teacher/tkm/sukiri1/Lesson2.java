package ysg.teacher.tkm.sukiri1;

import java.util.Scanner;

/**
 * コマンドプロンプロではなくEclipseにて実装する。
 * 演算子の理解と練習を行う
 * 【パッケージング】
 * ysg.student.名前(略語可).sukiri1.lesson2: 授業、予習で書き写すコード
 *
 *【メソッドの実装】
 *・メインメソッドを一つ作り、各写経するコードを「codeX_X」のようにメソッドを作り、写経する
 *・「教科書の『コード2-1』」であれば「code2_1」になる
 *
 *
 * @author 作成者の名前
 */
public class Lesson2 {

	public static void main(String[] args) {

	}

	public static void code2_4() {
		int a = 100;
		// 後ろにインクリメント
		System.out.println(a++);
		// 前にインクリメント
		System.out.println(++a);
		// 後ろにインクリメント
		System.out.println(a++);
	}

	public static void code2_6() {
		//int shosu = 3.2;
		// キャストすればOK
		int shosu = (int) 3.2;
		System.out.println(shosu);
	}

	/**
	 * java.lang.Mathクラス
	 * java.langパッケージのクラスはインポートしなくてよい
	 */
	public static void code2_12() {
		int a = 5;
		int b = 3;
		// MathクラスがJavaAPIに定義されている
		int m = java.lang.Math.max(a, b);
		System.out.println("比較実験：" + a + "と" + b + "とで大きい方は・・・" + m);
	}


	/**
	 * java.lang.Integerクラス
	 * java.langパッケージのクラスはインポートしなくてよい
	 */
	public static void code2_13() {
		String age = "31";
		// IntegerクラスがJavaAPIに定義されている
		int n = Integer.parseInt(age);
		System.out.println("あなたは来年、" + (n + 1) + "歳になりますね。");
	}

	/**
	 * 	 * java.util.Randomクラス
	 */
	public static void code2_14() {
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん、" + r + "歳ですね？");
	}

	/**
	 * 	java.util.Randomクラス
	 */
	public static void code2_15() {
		Scanner scan = new java.util.Scanner(System.in);
		System.out.print("あなたの年齢を入力してください。　");
		int age = scan.nextInt();

		System.out.print("あなたの名前を入力してください。　");
		String name = scan.next();
		scan.close();

		System.out.println("ようこそ、" + age + "歳の" + name + "さん");
	}

}
