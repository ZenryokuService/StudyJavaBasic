package ysg.teacher.tkm.sukiri1.lesson7;

import java.util.Scanner;

import ysg.teacher.tkm.sukiri1.lesson7.monster.Matango;
import ysg.teacher.tkm.sukiri1.lesson7.monster.Monster;
import ysg.teacher.tkm.sukiri1.lesson7.player.Hero;

public class TextRpgMain {
	/** 標準入力 */
	private static Scanner scan;
	/* 登場人物 */
	/** 勇者 */
	private Hero hero;
	/** マタンゴ */
	private Matango matango;

	/**
	 * RPGゲームのメイン処理
	 */
	public static void executeRpg() {
		TextRpgMain main = new TextRpgMain();
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
	 * RPGゲームのメイン処理
	 */
	public static void executeRpg2To3() {
		TextRpgMain main = new TextRpgMain();
		// ゲームの初期化
		main.init();
		// 入力～画面更新までの無限ループ
		while(true) {
			//System.out.println("*** 終了するときは「escape」と入力してください ***");
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
	 * RPGゲームのメイン処理
	 * Ver0.4
	 */
	public static void executeRpg4() {
		TextRpgMain main = new TextRpgMain();
		// ゲームの初期化
		main.init6();
		// 入力～画面更新までの無限ループ
		while(true) {
			//System.out.println("*** 終了するときは「escape」と入力してください ***");
			// 入力を受け付ける
			String input = scan.nextLine();
			// "escape"を入力すると
			if ("escape".equals(input)) {
				main.print7();
				System.out.println("*** ゲームを終了します ***");
				break;
			}
			// データを更新する
			main.updateData7(input);
			// 画面を更新する
			main.render();
		}
	}

	/**
	 * RPGゲームのメイン処理
	 * Ver0.8
	 */
	public static void executeRpg8() {
		TextRpgMain main = new TextRpgMain();
		// ゲームの初期化
		main.init6();
		// 入力～画面更新までの無限ループ
		while(true) {
			//System.out.println("*** 終了するときは「escape」と入力してください ***");
			// 入力を受け付ける
			String input = scan.nextLine();
			// "escape"を入力すると
			if ("escape".equals(input)) {
				printFinish(main);
				break;
			}
			// データを更新する
			if (main.updateData8(input)) {
				printFinish(main);
				break;
			}
			// 画面を更新する
			main.render();
		}
	}

	private static void printFinish(TextRpgMain main) {
		main.print7();
		System.out.println("*** ゲームを終了します ***");
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
	 * ゲームの初期化処理を行う
	 * Ver0.6
	 */
	public void init6() {
		scan = new Scanner(System.in);
		hero = new Hero("name1", 30);
		matango = new Matango();


		System.out.println("勇者" + hero.getName() + "   HP: " + hero.getHp());
		System.out.println(matango.getMonsterType() + "があらわれた！");
		System.out.println(matango.getMonsterType() + "   "  + "HP: " + matango.getHp());
	}

	/**
	 * ゲームのデータを更新する。
	 * プレーヤーのコマンド実行を行いその結果を反映する。
	 */
	public void updateData(String input) {
		hero.exeCommand(input);
	}

	/**
	 * ゲームのデータを更新する。
	 * プレーヤーのコマンド実行を行いその結果を反映する。
	 * Ver0.2
	 */
	public void updateData2(String input) {
		hero.exeCommand2(input);
	}

	/**
	 * ゲームのデータを更新する。
	 * プレーヤーのコマンド実行を行いその結果を反映する。
	 * Ver0.7
	 */
	public void updateData7(String input) {
		hero.exeCommand7(input, (Monster) matango);
	}

	/**
	 * ゲームのデータを更新する。
	 * プレーヤーのコマンド実行を行いその結果を反映する。
	 * Ver0.8
	 * @return 終了したかどうか： true: バトル終了 false: バトル継続
	 */
	public boolean updateData8(String input) {
		hero.exeCommand7(input, (Monster) matango);

		if (matango.isUnableToFight()) {
			return true;
		}
		return false;
	}

	/**
	 * ゲームの画面を更新する(コンソールの表示を更新する)
	 */
	public void render() {
		System.out.println();
		System.out.println("勇者: " + hero.getName() + "   HP: " + hero.getHp());
	}

	/**
	 * ステータスを表示する
	 */
	public void print() {
		System.out.println("勇者" + hero.getName() + "   HP: " + hero.getHp());
	}

	/**
	 * ステータスを表示する
	 * Ver0.7
	 */
	public void print7() {
		System.out.println("勇者" + hero.getName() + "   HP: " + hero.getHp());
		System.out.println(matango.getMonsterType() + "(" + matango.getName() + ")   HP: " + matango.getHp());
	}

}