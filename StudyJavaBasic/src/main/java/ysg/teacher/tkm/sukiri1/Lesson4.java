package ysg.teacher.tkm.sukiri1;

public class Lesson4 {
	public static void main(String[] args) {
		code4_11_opt1();
	}

	/**
	 * 成績解析プログラム
	 * @param args
	 */
	public static void seisekiKaiseki(String[] args) {
	}

	public static void code4_5() {
		int[] scores = new int[5];
		scores[0] = 10;
		scores[1] = 20;
		scores[2] = 30;
		scores[3] = 40;
		scores[4] = 50;

		System.out.println("scores[0]" + scores[0]);
		code4_5_opt(scores);
	}

	/**
	 * 引数に配列の添え字(番号)を渡して表示する。
	 * ・[0]の値のみ
	 * ・引数あり、返り値なしのメソッド
	 *
	 * @param scores
	 */
	public static void code4_5_opt(int[] scores) {
		System.out.println("scores[0]: " + scores[0]);
	}

	/**
	 * 引数に配列の添え字(番号)を渡して表示する。
	 * ・第二引数で出力する値を変更できる。
	 * ・引数あり、返り値なしのメソッド
	 *
	 * @param scores
	 * @param number
	 */
	public static void code4_5_opt(int[] scores, int number) {
		System.out.println("scores[" + number + "]: " + scores[number]);
	}

	public static void code4_6() {
		int x;
		int y = 1;
		//System.out.println(x);
		System.out.println(y);
	}

	/**
	 * プリミティブ型変数は、初期化しないとエラーになり(C言語はどの値が入るかわからない)
	 * 参照型変数はエラーにならない。 -> 暗黙的に初期化されるため
	 */
	public static void code4_7() {
		int[] scores = new int[5];
		// 配列の場合は「0」で初期化されるので、エラーにならない
		System.out.println(scores[0]);

		String[] strs = new String[5];
		// String型の配列の場合は「null」で初期化されるので、エラーにならない
		System.out.println(strs[0]);
	}

	/**
	 * 実行時エラーが出ます。どこでエラーになるでしょうか？
	 */
	public static void code4_8() {
		int[] scores = {20, 30, 40, 50, 80};
		// 合計値
		int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4] + scores[5];

		// 平均値
		int avg = sum / scores.length;

		System.out.println("合計：" + sum);
		System.out.println("平均：" + avg);
	}

	/**
	 * 例外のハンドル方法
	 */
	public static void code4_8_opt() {
		try {
			code4_8();
		} catch(Exception e) {
			System.out.println("例外をキャッチしました。"+ e.getMessage());
			e.printStackTrace();
		}
	}

	public static void code4_10() {
		int[] scores = {20, 30, 40, 50, 80};
		// 合計値
		int sum = 0;
		for (int i= 0; i < scores.length; i++) {
			sum += scores[i];
			System.out.println(scores[i]);
		}

		// 平均値
		int avg = sum / scores.length;

		System.out.println("合計：" + sum);
		System.out.println("平均：" + avg);
	}

	/**
	 * 50点以上の科目を並べる
	 */
	public static void code4_11() {
		int[] scores = {20, 30, 40, 50, 80};
		// 合計値
		int sum = 0;
		int count = 0;
		for (int i= 0; i < scores.length; i++) {
			if (scores[i] >= 50) {
				sum += scores[i];
				count++;
			}
		}

		System.out.println("50点以上の科目は、" + count + "科目です。");
		// 平均値
		int avg = sum / scores.length;

		System.out.println("合計：" + sum);
		System.out.println("平均：" + avg);
	}

	/**
	 * 値渡しと、参照渡し、インスタンスが使用するメモリ領域の開放
	 */
	public static void code4_11_opt1() {
		int[] scores = {20, 30, 40, 50, 80};
//		code4_11_setValue(scores);
		// 合計値
		int sum = 0;
		int count = 0;
		for (int i= 0; i < scores.length; i++) {
			code4_11_setValue(scores, scores[i]);
			System.out.println("得点：" + scores[i]);

			if (scores[i] >= 50) {
				sum += scores[i];
				count++;
			}
		}

		System.out.println("50点以上の科目は、" + count + "科目です。");
		// 平均値
		int avg = sum / scores.length;

		System.out.println("合計：" + sum);
		System.out.println("平均：" + avg);

		// メモリ開放
		scores = null;
		sum = 0;
		count = 0;
		avg = 0;
	}

	/**
	 * 配列の中身を書き換える。
	 *
	 * @param scores
	 */
	public static void code4_11_setValue(int[] scores) {
		scores[0] = 40;
		scores[1] = 40;
		scores[2] = 40;
		scores[3] = 40;
		scores[4] = 40;
	}

	/**
	 * 配列の中身を書き換える。
	 *
	 * @param scores
	 */
	public static void code4_11_setValue(int[] scores, int value) {
		if (value <= 20) {
			scores[0] = 50;
		}
	}

	/**
	 * 二次元配列
	 * 問題１：5教科分の成績を表示する：国=XX, 数=XX, 英=XX, 社=XX, 理=XX
	 * 問題２：1班(3名)分のデータを出力する
	 * ＜出力イメージ＞
	 * A君 >> 国=XX, 数=XX, 英=XX, 社=XX, 理=XX
	 * Bさん >> 国=XX, 数=XX, 英=XX, 社=XX, 理=XX
	 */
	public static void code4_18() {
		int[][] scores = new int[2][5];
		scores[0][0] = 10;
		scores[0][1] = 20;
		scores[0][2] = 30;
		scores[0][3] = 40;
		scores[0][4] = 50;

		scores[1][0] = 13;
		scores[1][1] = 22;
		scores[1][2] = 31;
		scores[1][3] = 44;
		scores[1][4] = 55;

		scores[2][0] = 100;
		scores[2][1] = 90;
		scores[2][2] = 80;
		scores[2][3] = 70;
		scores[2][4] = 60;

		for (int first = 0; first < scores.length; first++) {
			for (int second = 0; second < scores[first].length; second++) {
				System.out.println(scores[first][second]);
			}
		}
	}
}
