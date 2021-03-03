package ysg.teacher.tkm.sukiri1;

public class Lesson3 {
	public static void main(String[] args) {

	}

	/**
	 * if-elseを説明する。
	 */
	public static void code3_3() {
		boolean isTenki = true;
		if (isTenki) System.out.println("Test1");

		//こんな書き方はしない。けどビルドエラーはでない
		if (isTenki) {
			System.out.println("Test2");
		} else System.out.println("Test3");
	}

	/**
	 * if文を使ってみる
	 */
	public static void code3_4() {
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt();

		if (fortune == 1) {
			System.out.println("大吉");
		} else if (fortune == 2) {
			System.out.println("中吉");
		} else if (fortune == 3) {
			System.out.println("吉");
		} else {
			System.out.println("凶");
		}
	}

	/**
	 * switch文を使ってみる
	 */
	public static void code3_5() {
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt();
		switch(fortune) {
		case 1:
			System.out.println("大吉");
			break;
		case 2:
			System.out.println("中吉");
			break;
		case 3:
			System.out.println("吉");
			break;
		default:
			System.out.println("凶");
		}
	}

	/**
	 * breakを書かないと。。。
	 */
	public static void code3_6() {
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt();

		switch(fortune) {
		case 1:
			System.out.println("大吉");
		case 2:
			System.out.println("中吉");
		case 3:
			System.out.println("吉");
		default:
			System.out.println("凶");
		}
	}

	/**
	 * while文の書き方、do-whileの書き方
	 */
	public static void code3_6opt() {
		int temp = 27;
		while (temp > 25) {
			temp--;
			System.out.println("温度を1度下げました。");
		}

		do {
			temp++;
			System.out.println("温度を1度上げました。");
		} while(temp < 27);
	}

	/**
	 * for文の書き方.
	 * 九九を出力するプログラムを作成する問題を出す。
	 */
	public static void code3_7() {
		for (int temp = 27; temp > 25; temp --) {
			System.out.println("温度を1度上げました。");
		}

		for (int temp = 25; temp < 27; temp++) {
			System.out.println("温度を1度上げました。");
		}
	}

	/**
	 * 三項演算子
	 */
	public static void code3_7opt() {
		for (int i = 0; i < 10; i++) {
			int amari = i % 2;
			String result = amari == 0 ? "偶数です" : "奇数です";
			System.out.println(i + "は、" + result);
		}
	}
}
