package ysg.josys.name;

import java.util.Random;
import java.util.Scanner;

public class JankenPon {
	/// フィールド変数の変数 ////
	private static final String GU = "0";
	private static final String CHI = "1";
	private static final String PA = "2";

	private static final int Gu = 0;
	private static final int Choki = 1;
	private static final int Pa = 2;

	private static final int AIKO = 0;
	private static final int YOU_WIN = 1;
	private static final int YOU_LOSE = 2;

	private static final int ERROR = 3;

	/** メインメソッド */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);


		while (true) {
			System.out.println("じゃんけん。。。");
			String input = scan.nextLine();

			if ("bye".equals(input)) {
				break;
			}

			if (input.matches("[0-2]") == false) {
				System.out.println("0～2を入力してください。");
				continue;
			}
			int userTe = Integer.parseInt(input);
			janken(input, "ユーザー： ");

			int cpu = new Random().nextInt(3);
			janken(String.valueOf(cpu), "CPU: ");

			System.out.println("ポン！");

			switch(hantei(userTe, cpu)) {
			case AIKO:
				System.out.println("DRAW");
				break;
			case YOU_WIN:
				System.out.println("YOU WIN");
				break;
			case YOU_LOSE:
				System.out.println("LOSE");
				break;
			default:
				System.out.println("ERROR");
				break;
			}
		}
	}

	/**
	 *
	 * @param user ユーザーの入力した手(0-2)
	 * @param cpu CPUの入力した手(0-2)
	 * @return 勝利フラグ or あいこフラグ or 惨敗フラグ or エラーフラグ
	 */
	public static int hantei(int user, int cpu) {

		if (user == cpu) {
			return AIKO;
		}


		if ((user + 1) % 3 == cpu) {
			System.out.println("(user + 1) % 3 = " + (user + 1) % 3 + " / CPU: " + cpu);
			return YOU_WIN;
		}

		if ((user + 2) % 3 == cpu) {
			System.out.println("(user + 2) % 3 = " + (user + 2) % 3 + " / CPU: " + cpu);
			return YOU_LOSE;
		}
		return ERROR;
	}

	/**
	 * プレーヤーの手を表示して
	 * 対応する手の名前(文字列)を返却する。
	 *
	 * @param input 入力値
	 * @param player 表示する文字列
	 * @return 入力された値の手(日本語)
	 */
	public static String janken(String input, String player) {
		System.out.print(player);
		return janken(input);
	}

	/**
	 * 入力値の手を日本語に変換して返却する
	 *
	 * @param input 入力値
	 * @return	入力値に対応する日本語
	 */
	public static String janken(String input) {
		String result = null;
		if (GU.equals(input)) {
			result = "グー: ";
			System.out.println(result);
		} else if (CHI.equals(input)) {
			result = "チョキ";
			System.out.println(result);
		} else if (PA.equals(input)) {
			result = "パー";
			System.out.println(result);
		} else {
			System.out.println("想定外です。");
		}
		return result;
	}
}
