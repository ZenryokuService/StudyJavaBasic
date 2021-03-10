package ysg.josys.name;

import java.util.Random;
import java.util.Scanner;

public class JankenPon {
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

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("じゃんけん。。。");
		String input = scan.nextLine();

		int userTe = Integer.parseInt(input);
		janken(input, "ユーザー： ");

		int cpu = new Random().nextInt(2);
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

	public static int hantei(int user, int cpu) {

		if (user == cpu) {
			return AIKO;
		}


		if ((user + 1) % 3 == cpu) {
			return YOU_WIN;
		}

		if ((user + 2) % 3 == cpu) {
			return YOU_LOSE;
		}
		return ERROR;
	}

	public static String janken(String input, String player) {
		System.out.print(player);
		return janken(input);
	}

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
