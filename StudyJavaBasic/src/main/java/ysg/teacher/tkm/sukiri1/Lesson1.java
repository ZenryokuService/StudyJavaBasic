package ysg.teacher.tkm.sukiri1;

/** [JavaDocコメント]
 *
 * @author 作成者の名前
 */
public class Lesson1 {
	/** [JavaDocコメント]
	 * 1. まずは写経する
	 * 2. 動かす
	 * 3. 内容を理解する
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// [コメント]
		code14();
	}

	public static void code0_1() {
		// 標準出力に"Hello World"を出力する
		System.out.println("Hello World");
	}

	public static void code0_2() {
		// Code01を書き換えてみる
		System.out.println("すがわら");
	}

	/**
	 * ダブルクォーテーションが抜けるとエラーになる
	 */
	public static void code0_3() {
		// 湊君が作ったプログラム(エラー)
		//System.out.println("湊くんかっこいい！最高);
	}

	/**
	 * 好きな文字列を表示してみよう
	 */
	public static void code0_4() {
		System.out.println("すがわら");
		System.out.println("31歳です");
		System.out.println("お酒が好きです");
	}

	/**
	 * コンソール出力のことを「標準出力」と呼びます。
	 * 文字列の出力と計算結果の出力
	 */
	public static void code0_5() {
		System.out.println("すがわら");
		System.out.println("31歳です");
		System.out.println("お酒が好きです");
		System.out.println("31 + 31の計算をします");
		System.out.println(31 + 31);
	}

	public static void code0_6() {
		System.out.println("すがわら");
		System.out.println("31歳です");
		System.out.println("お酒が好きです");
		System.out.println("31 + 31の計算をします");

		// 変数の宣言
		int x;
		// 変数への代入
		x = 6;
		System.out.println(x * x * 3.14);
	}

	public static void code1_1() {
		System.out.println("RPG:スッキリもう征伐");
		System.out.println("Ver.0.1 by 湊");
		System.out.println("＜ただいま鋭意学習・制作中＞");
		System.out.println("プログラムを終了します");
	}

	/**
	 * 演算子「=」は右の値を左の変数に代入する。
	 */
	public static void code1_2() {
		// 変数の宣言
		int age;
		// 変数への代入
		age = 30;
		System.out.println(age);
	}

	/**
	 * 下のようなコードはほぼ使わないけど、変数は値を再代入できる。
	 * そして、文字列の後に「+」演算子で文字連結をすることができる。
	 */
	public static void code1_3() {
		// 整数型(int型)の変数を20で初期化する
		int age = 20;
		System.out.println("私の年齢は" + age);
		age = 31;
		System.out.println("・・・いや本当の年齢は" + age);
	}

	/**
	 * "XXX"の後に、「+」を付けると文字連結になる
	 */
	public static void code1_4() {
		double pi = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie + pi);

		System.out.println("パイの半径を2倍にします");
		pi = 10;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie + pi);
	}

	/**
	 * code14をコピペで作成する。finalは定数の宣言(変更不可)
	 */
	public static void code1_5() {
		final double pi = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie + pi);

		System.out.println("パイの半径を2倍にします");
		pie = 10;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie + pi);
	}

	/**
	 * 演算子「+」足し算～四則計算
	 */
	public static void code2_1() {
		int a;
		int b;
		a = 20;
		b = a + 5;
		System.out.println(a);
		System.out.println(b);

		// 引き算と掛け算もやる
		int c = a - 3;
		int d = a * 2;
		System.out.println(c);
		System.out.println(d);

		// 割り算もやる
		int warizan = a / 4;
		System.out.println(warizan);

		double shosu = a / 4;
		System.out.println(shosu);
	}

	/**
	 * ダブルクォーテーションを標準出力に表示してみる
	 */
	public static void code2_2() {
//		System.out.println("I love double quotation(")!");
	}

	/**
	 * ダブルクォーテーションを標準出力に表示してみる
	 */
	public static void code2_3() {
		System.out.println("I love double quotation(\")!");
	}

}
