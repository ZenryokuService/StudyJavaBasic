package ysg.teacher.tkm.sukiri1.lesson7;

import java.util.Scanner;

import ysg.teacher.tkm.sukiri1.lesson7.player.Hero;

public class TextRpgMain_Sample {
	/** 標準入力 */
	private static Scanner scan;
	/* 登場人物 */
	/** 勇者 */
	private Hero hero;

	/**
	 * RPGゲームのメイン処理
	 */
	public static void executeRpg() {
		TextRpgMain_Sample main = new TextRpgMain_Sample();
		// ゲームの初期化
		main.init();
		// 入力～画面更新までの無限ループ
		while(true) {
			System.out.println("*** 終了するときは「escape」と入力してください ***");
			// 入力を受け付ける
			String input = scan.nextLine();
			// "escape"を入力すると
			if ("escape".equals(input)) {
				System.out.println("*** ゲームを終了します ***");
				break;
			}
			// データを更新する
			main.updateData(input);
			// 画面を更新する
			main.render();
		}
	}

	/**
	 * ゲームの初期化処理を行う
	 */
	public void init() {
		scan = new Scanner(System.in);
		hero = new Hero("name1", 30);

		System.out.println("勇者" + hero.getName() + "   HP: " + hero.getHp());
	}

	/**
	 * ゲームのデータを更新する。
	 * プレーヤーのコマンド実行を行いその結果を反映する。
	 */
	public void updateData(String input) {
		hero.exeCommand(input);
	}

	/**
	 * ゲームの画面を更新する(コンソールの表示を更新する)
	 */
	public void render() {
		System.out.println();
		System.out.println("勇者: " + hero.getName() + "   HP: " + hero.getHp());
	}
}