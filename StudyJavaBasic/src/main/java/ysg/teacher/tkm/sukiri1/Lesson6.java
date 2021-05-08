package ysg.teacher.tkm.sukiri1;

import java.util.Scanner;

import ysg.teacher.tkm.sukiri1.lesson6.util.CalcLogic;
import ysg.teacher.tkm.sukiri1.lesson6.util.PrintUtil;

/**
 * 複数クラスを使用して、成績判定プログラムを作成する。
 * メインメソッドを実行するクラス。
 * 【Lession5で作成したプログラムをオブジェクト指向で作成しなおす】
 *
 * @author 作成者の名前
 * @see ysg.teavher.tkm.sukiri1.lesson6.*;
 */
public class Lesson6 {
	/** メインメソッド */
	public static void main(String[] args) {
		// 標準入力を受け付ける
		Scanner scan = new Scanner(System.in);

		System.out.print("整数を入力してください。: ");
		String left = scan.next();
		String right = scan.next();

		int leftNum = Integer.parseInt(left);
		int rightNum = Integer.parseInt(right);

		// 整数型の変数totalをメソッドtasuの返り値で初期化
		int total = CalcLogic.tasu(leftNum, rightNum);
		int avg = CalcLogic.avg(total, 2);

		//上記の変数を足すと「total」引くと「delta」のように標準出力へ出力(表示)
		PrintUtil.printOut(total, avg);
	}
}
