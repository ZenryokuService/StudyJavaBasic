package ysg.teacher.tkm.sukiri1;

import java.util.Scanner;

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
		int m = Math.max(a, b);
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
