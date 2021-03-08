package ysg.teacher.tkm.sukiri1.lesson6;

import java.util.ArrayList;
import java.util.List;

import ysg.teacher.tkm.sukiri1.lesson6.data.SeisekiData;
import ysg.teacher.tkm.sukiri1.lesson6.util.CalcLogic;

/**
 * 成績判定プログラム。
 * 1. 外部から参照する必要のないメソッドは「private」にする。
 *
 * @author 作成者の名前
 * @see ysg.teavher.tkm.sukiri1.Lesson6;
 *
 */
public class SeisekiHanteiProgram {
	/** 成績データリスト */
	private List<SeisekiData> dataList;
	/** 成績一覧 */
	private int[][] scores;

	/**
	 * コンストラクタ。
	 * 成績判定プログラムの初期化を行う
	 */
	public SeisekiHanteiProgram() {
		init(10);

	}

	private void init() {
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

	private void init(int firstScore) {
		this.init();
		for (int i= 0; i < scores.length; i++) {
			this.setValueTo1jigen(scores[i]);
		}

		for (int i= 0; i < scores.length; i++) {
			this.setValueTo1jigen(scores[i], firstScore * (i + 1));
		}
	}

	/**
	 * 成績判定プログラムメイン処理(Ver1.1)。
	 * ミッション：Lession5のプログラムをオブジェクト指向に直す、
	 */
	public void execute1() {
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
	 * 1次元配列にデータを設定する
	 */
	private void setValueTo1jigen(int[] arr) {
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

	}

	/**
	 * 1次元配列にデータを設定する
	 */
	private void setValueTo1jigen(int[] arr, int val) {
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
	private int getAvgValue(int gokei, int length) {
		double avg = gokei / length;
		// int型にキャストすると小数点以下が切り捨てされる
		return (int) avg;
	}

	/**
	 * 成績判定プログラムメイン処理(Ver1.2)。
	 * ミッション：配列ではなくDataクラスのリストを使用する形で修正
	 */
	public void execute2() {
		// 初期化したscores配列をdataListに格納する
		this.loadData();

		// 拡張for文
		for (SeisekiData data : dataList) {
			// 各科目の点数表示
			System.out.print(data.toString());
			// 合計点の表示
			int gokei = data.gokeiScore();
			System.out.print("合計点: " + gokei);

			System.out.print(" / ");

			// テストを先に実行してしまう。
			int avg = (int) CalcLogic.avg(gokei, 5);
			System.out.println("平均点: " + avg + SeisekiData.SEPARATOR);
		}
	}

	/**
	 * コンストラクタで初期化した配列をリストに格納する。
	 */
	private void loadData() {
		// フィールド変数dataListに配列のscoresを格納する
		dataList = new ArrayList<SeisekiData>();
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				SeisekiData data = this.convertData(scores[i]);
				dataList.add(data);
			}
		}
	}

	/**
	 * int型の配列からSeisekiデータクラスへ変換する
	 *
	 * @param data 成績の入っている配列
	 * @return SeisekiData 	成績を格納したクラス
	 */
	private SeisekiData convertData(int[] data) {
//		SeisekiData been = new SeisekiData(data);
//		return been;
		return new SeisekiData(data);
	}


}
