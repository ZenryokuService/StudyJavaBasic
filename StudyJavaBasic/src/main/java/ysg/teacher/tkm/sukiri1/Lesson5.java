package ysg.teacher.tkm.sukiri1;

/**
 * クラスの作成とメンバメソッドの実行
 * 今まで作成していたメソッドはstaticメソッドであり
 * メンバメソッドとは違うことを確認する。
 *
 * @author 作成者の名前
 *
 */
public class Lesson5 {
	/** 成績一覧 */
	private int[][] scores;

	public static void main(String[] args) {
		Lesson5 main = new Lesson5(10);
		main.code4_18();
	}

	/**
	 * JavaDocコメント、引数の文字列を標準出力へ出力する。
	 *
	 * @param message 表示するメッセージ
	 */
	public static void myStaticMethod(String message) {
		System.out.println(message);
	}

	public Lesson5() {
		System.out.println("*** 引数なしのコンストラクタ ***");
		scores = new int[3][5];
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

	}

	public Lesson5(int firstScore) {
		// 引数なしのコンストラクタを起動する
		this();
		this.code4_18();
		System.out.println("*** 引数１つのコンストラクタ(値渡し) ***");
		for (int i= 0; i < scores.length; i++) {
			this.setValueTo1jigen(scores[i]);
		}
		this.code4_18();

		System.out.println("*** 参照渡し ***");
		for (int i= 0; i < scores.length; i++) {
			this.setValueTo1jigen(scores[i], firstScore * (i + 1));
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
	public void code4_18() {
		/* 変数sumの宣言はどこにあるべきか？ */
		//int sum = 0;
		for (int first = 0; first < scores.length; first++) {
			int sum = 0;
			int length = 0;
			for (int second = 0; second < scores[first].length; second++) {
				int value = scores[first][second];
				length = scores[first].length;
				System.out.print(value + " ");
				sum += value;
			}
//			System.out.println("合計点: " + sum);
//			System.out.println("平均点: " + sum / length);
			System.out.println("合計点: " + sum);
			System.out.println("平均点: " + getAvgValue(sum, length));

		}
	}

	/**
	 * 引数にあるint型の2次元配列を表示する
	 * @param newScores int型の2に次元配列
	 */
	public void code4_18(int[][] newScores) {

		for (int first = 0; first < newScores.length; first++) {
			for (int second = 0; second < newScores[first].length; second++) {
				System.out.print(newScores[first][second] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * 1次元配列にデータを設定する
	 */
	public void setValueTo1jigen(int[] arr) {
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

	}

	/**
	 * 1次元配列にデータを設定する
	 */
	public void setValueTo1jigen(int[] arr, int val) {
		arr[0] = val;
		arr[1] = val * 2;
		arr[2] = val * 3;
		arr[3] = val * 4;
		arr[4] = val * 5;

	}

	/**
	 * 平均点を算出して返却する
	 * @param gokei 合計点
	 * @param length 科目数(配列の長さ)
	 * @return 平均点
	 */
	public int getAvgValue(int gokei, int length) {
		double avg = gokei / length;
		// int型にキャストすると小数点以下が切り捨てされる
		return (int) avg;
	}
}
