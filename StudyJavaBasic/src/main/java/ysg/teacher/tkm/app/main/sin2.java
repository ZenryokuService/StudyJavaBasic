package ysg.teacher.tkm.app.main;

import java.util.Arrays;
import java.util.Scanner;

public class sin2 {
	public static void main(String[] args) {
		System.out.println("10進数を他の進数に変換します");
		// 2進数のmax System.out.println("maxは4095(2^11)です");
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("変換する進数を入力してください。");
			System.out.println("1:終了 2:2進数 3:3進数");
			int hen = scan.nextInt();

			if (hen == 1) {
				System.out.println("プログラムを終了します。");
				break;
			}

			System.out.println("変換したい10進数の数字を入力してください。");
			int start = scan.nextInt();

			if (hen == 2) {
				two2(start);
			} else if (hen == 3) {
				three(start);
			}
		}
	}

	public static void two2(int value) {
		// エラーの時は処理終了
		if (value >= 4096) {
			return;
		}

		// 入力値の平方根を求め、必要なビット数を算出
		double root2 = Math.ceil(Math.log(value)) - 1;
		// 1. 何乗したのか求める
		double ans = Math.log(value) / Math.log(2);

		int loopCount = (int) Math.ceil(ans) + 1;
System.out.println("root: " + loopCount);
//		if (value >= 2048) {
//			loopCount =  12;
//		} else  if (value >= 1024) {
//			loopCount =  11;
//		} else if (value >= 512) {
//			loopCount =  10;
//		} else if (value >= 256) {
//			loopCount =  9;
//		} else if (value >= 128) {
//			loopCount =  8;
//		} else if (value >= 64) {
//			loopCount =  7;
//		} else if (value >= 32) {
//			loopCount =  6;
//		} else if (value >= 16) {
//			loopCount =  5;
//		} else if (value >= 8) {
//			loopCount =  4;
//		} else if (value >= 4) {
//			loopCount =  3;
//		} else if (value >= 2) {
//			loopCount =  2;
//		} else  {
//			loopCount = 1;
//		}

		// 使用する変数の用意
		int tmpJos = value;
		int part1 = 0;
		String[] str = new String[loopCount];
		// 繰り返し
		for (int i = 0; i < loopCount; i++) {
			part1 = tmpJos % 2; //剰余取得
			tmpJos  = tmpJos / 2; // 商を取得
			// おしりから文字列を追加
			str[loopCount - (i + 1)] = String.valueOf(part1);
		}
		// 出力するための文字列を作成
		StringBuilder build = new StringBuilder();
		// ラムダ式
		Arrays.asList(str).listIterator().forEachRemaining(bit -> build.append(bit));

		char[] ch = build.toString().toCharArray();

		int cut = 0;
		// 初めの1が出てきたらtrueになる
		boolean isFirstOne = false;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != '0') {
				isFirstOne = true;
			}
			if (isFirstOne) {
				cut++;
			}
		}
		System.out.println("isFirst: " + isFirstOne);
		System.out.println("cut: " + cut);
		// 1が存在しない場合はisFirstOne == falseになる。
		String printNum = isFirstOne ? build.substring(build.length() - cut, build.length()) : build.toString();
		System.out.println("2進数 ＝ " + printNum);
	}

	// 2進数
	public static void two(int x) {
		if (x >= 4096) {
			System.out.println("error");
		} else if (x >= 2048) {
			int part1 = x % 2; //剰余取得
			int jos1 = x / 2; // 商を取得

			int part2 = jos1 % 2;
			int jos2 = jos1 / 2;

			int part3 = jos2 % 2;
			int jos3 = jos2 / 2;

			int part4 = jos3 % 2;
			int jos4 = jos3 / 2;

			int part5 = jos4 % 2;
			int jos5 = jos4 / 2;

			int part6 = jos5 % 2;
			int jos6 = jos5 / 2;

			int part7 = jos6 % 2;
			int jos7 = jos6 / 2;

			int part8 = jos7 % 2;
			int jos8 = jos7 / 2;

			int part9 = jos8 % 2;
			int jos9 = jos8 / 2;

			int part10 = jos9 % 2;
			int jos10 = jos9 / 2;

			int part11 = jos10 % 2;
			int jos11 = jos10 / 2;

			int part12 = jos11 % 2;
			int jos12 = jos11 / 2;

			String num1 = String.valueOf(part1);
			String num2 = String.valueOf(part2);
			String num3 = String.valueOf(part3);
			String num4 = String.valueOf(part4);
			String num5 = String.valueOf(part5);
			String num6 = String.valueOf(part6);
			String num7 = String.valueOf(part7);
			String num8 = String.valueOf(part8);
			String num9 = String.valueOf(part9);
			String num10 = String.valueOf(part10);
			String num11 = String.valueOf(part11);
			String num12 = String.valueOf(part12);

			int[] num = {};

			System.out.println(num12 + num11 + num10 + num11 +
					num10 + num9 + num8 + num7 + num6 + num5 + num4 + num3 + num2 + num1);


		} else if (x >= 1024) {
			int part1 = x % 2; //剰余取得
			int jos1 = x / 2; // 商を取得

			int part2 = jos1 % 2;
			int jos2 = jos1 / 2;

			int part3 = jos2 % 2;
			int jos3 = jos2 / 2;

			int part4 = jos3 % 2;
			int jos4 = jos3 / 2;

			int part5 = jos4 % 2;
			int jos5 = jos4 / 2;

			int part6 = jos5 % 2;
			int jos6 = jos5 / 2;

			int part7 = jos6 % 2;
			int jos7 = jos6 / 2;

			int part8 = jos7 % 2;
			int jos8 = jos7 / 2;

			int part9 = jos8 % 2;
			int jos9 = jos8 / 2;

			int part10 = jos9 % 2;
			int jos10 = jos9 / 2;

			int part11 = jos10 % 2;
			int jos11 = jos10 / 2;


			String num1 = String.valueOf(part1);
			String num2 = String.valueOf(part2);
			String num3 = String.valueOf(part3);
			String num4 = String.valueOf(part4);
			String num5 = String.valueOf(part5);
			String num6 = String.valueOf(part6);
			String num7 = String.valueOf(part7);
			String num8 = String.valueOf(part8);
			String num9 = String.valueOf(part9);
			String num10 = String.valueOf(part10);
			String num11 = String.valueOf(part11);

			System.out.println(num11 + num10 + num11 +
					num10 + num9 + num8 + num7 + num6 + num5 + num4 + num3 + num2 + num1);

		} else if (x >= 512) {
			int part1 = x % 2; //剰余取得
			int jos1 = x / 2; // 商を取得

			int part2 = jos1 % 2;
			int jos2 = jos1 / 2;

			int part3 = jos2 % 2;
			int jos3 = jos2 / 2;

			int part4 = jos3 % 2;
			int jos4 = jos3 / 2;

			int part5 = jos4 % 2;
			int jos5 = jos4 / 2;

			int part6 = jos5 % 2;
			int jos6 = jos5 / 2;

			int part7 = jos6 % 2;
			int jos7 = jos6 / 2;

			int part8 = jos7 % 2;
			int jos8 = jos7 / 2;

			int part9 = jos8 % 2;
			int jos9 = jos8 / 2;

			int part10 = jos9 % 2;
			int jos10 = jos9 / 2;


			String num1 = String.valueOf(part1);
			String num2 = String.valueOf(part2);
			String num3 = String.valueOf(part3);
			String num4 = String.valueOf(part4);
			String num5 = String.valueOf(part5);
			String num6 = String.valueOf(part6);
			String num7 = String.valueOf(part7);
			String num8 = String.valueOf(part8);
			String num9 = String.valueOf(part9);
			String num10 = String.valueOf(part10);

			System.out.println(num10 + num9 + num8 + num7 + num6 + num5 + num4 + num3 + num2 + num1);

		} else if (x >= 256) {
			int part1 = x % 2; //剰余取得
			int jos1 = x / 2; // 商を取得

			int part2 = jos1 % 2;
			int jos2 = jos1 / 2;

			int part3 = jos2 % 2;
			int jos3 = jos2 / 2;

			int part4 = jos3 % 2;
			int jos4 = jos3 / 2;

			int part5 = jos4 % 2;
			int jos5 = jos4 / 2;

			int part6 = jos5 % 2;
			int jos6 = jos5 / 2;

			int part7 = jos6 % 2;
			int jos7 = jos6 / 2;

			int part8 = jos7 % 2;
			int jos8 = jos7 / 2;

			int part9 = jos8 % 2;
			int jos9 = jos8 / 2;


			String num1 = String.valueOf(part1);
			String num2 = String.valueOf(part2);
			String num3 = String.valueOf(part3);
			String num4 = String.valueOf(part4);
			String num5 = String.valueOf(part5);
			String num6 = String.valueOf(part6);
			String num7 = String.valueOf(part7);
			String num8 = String.valueOf(part8);
			String num9 = String.valueOf(part9);

			System.out.println(num9 + num8 + num7 + num6 + num5 + num4 + num3 + num2 + num1);

		} else if (x >= 128) {
			int part1 = x % 2; //剰余取得
			int jos1 = x / 2; // 商を取得

			int part2 = jos1 % 2;
			int jos2 = jos1 / 2;

			int part3 = jos2 % 2;
			int jos3 = jos2 / 2;

			int part4 = jos3 % 2;
			int jos4 = jos3 / 2;

			int part5 = jos4 % 2;
			int jos5 = jos4 / 2;

			int part6 = jos5 % 2;
			int jos6 = jos5 / 2;

			int part7 = jos6 % 2;
			int jos7 = jos6 / 2;

			int part8 = jos7 % 2;
			int jos8 = jos7 / 2;


			String num1 = String.valueOf(part1);
			String num2 = String.valueOf(part2);
			String num3 = String.valueOf(part3);
			String num4 = String.valueOf(part4);
			String num5 = String.valueOf(part5);
			String num6 = String.valueOf(part6);
			String num7 = String.valueOf(part7);
			String num8 = String.valueOf(part8);

			System.out.println(num8 + num7 + num6 + num5 + num4 + num3 + num2 + num1);

		} else if (x >= 64) {
			int part1 = x % 2; //剰余取得
			int jos1 = x / 2; // 商を取得

			int part2 = jos1 % 2;
			int jos2 = jos1 / 2;

			int part3 = jos2 % 2;
			int jos3 = jos2 / 2;

			int part4 = jos3 % 2;
			int jos4 = jos3 / 2;

			int part5 = jos4 % 2;
			int jos5 = jos4 / 2;

			int part6 = jos5 % 2;
			int jos6 = jos5 / 2;

			int part7 = jos6 % 2;
			int jos7 = jos6 / 2;


			String num1 = String.valueOf(part1);
			String num2 = String.valueOf(part2);
			String num3 = String.valueOf(part3);
			String num4 = String.valueOf(part4);
			String num5 = String.valueOf(part5);
			String num6 = String.valueOf(part6);
			String num7 = String.valueOf(part7);

			System.out.println(num7 + num6 + num5 + num4 + num3 + num2 + num1);
		} else if (x >= 32) {
			int part1 = x % 2; //剰余取得
			int jos1 = x / 2; // 商を取得

			int part2 = jos1 % 2;
			int jos2 = jos1 / 2;

			int part3 = jos2 % 2;
			int jos3 = jos2 / 2;

			int part4 = jos3 % 2;
			int jos4 = jos3 / 2;

			int part5 = jos4 % 2;
			int jos5 = jos4 / 2;

			int part6 = jos5 % 2;
			int jos6 = jos5 / 2;


			String num1 = String.valueOf(part1);
			String num2 = String.valueOf(part2);
			String num3 = String.valueOf(part3);
			String num4 = String.valueOf(part4);
			String num5 = String.valueOf(part5);
			String num6 = String.valueOf(part6);

			System.out.println(num6 + num5 + num4 + num3 + num2 + num1);
		} else if (x >= 16) {
			int part1 = x % 2; //剰余取得
			int jos1 = x / 2; // 商を取得

			int part2 = jos1 % 2;
			int jos2 = jos1 / 2;

			int part3 = jos2 % 2;
			int jos3 = jos2 / 2;

			int part4 = jos3 % 2;
			int jos4 = jos3 / 2;

			int part5 = jos4 % 2;
			int jos5 = jos4 / 2;


			String num1 = String.valueOf(part1);
			String num2 = String.valueOf(part2);
			String num3 = String.valueOf(part3);
			String num4 = String.valueOf(part4);
			String num5 = String.valueOf(part5);

			System.out.println(num5 + num4 + num3 + num2 + num1);
		}
	}


	// 3進数
	public static void three(int x) {
		int num1 = 0;
		int part1 = x % 3;
		int jos1 = x / 3;

		switch (part1) {
			case 0:
				num1 = 0;
			case 1:
				num1 = 1;
			case 2:
				num1 = 2;
		}

//		if (part1 == 0) {
//			num1 = 0;
//		} else if (part1 == 1) {
//			num1 = 1;
//		} else if (part1 == 2) {
//			num1 = 2;
//		}


		int num2 = 0;
		int part2 = jos1 % 3;
		int jos2 = jos1 / 3;

		if (part2 == 0) {
			num2 = 0;
		} else if (part2 == 1) {
			num2 = 1;
		} else if (part2 == 2) {
			num2 = 2;
		}


		int num3 = 0;
		int part3 = jos2 % 3;
		int jos3 = jos2 / 3;

		if (part3 == 0) {
			num3 = 0;
		} else if (part3 == 1) {
			num3 = 1;
		} else if (part3 == 2) {
			num3 = 2;
		}


		int num4 = 0;
		int part4 = jos3 % 3;
		int jos4 = jos3 / 3;

		if (part4 == 0) {
			num4 = 0;
		} else if (part4 == 1) {
			num4 = 1;
		} else if (part4 == 2) {
			num4 = 2;
		}


		int num5 = 0;
		int part5 = jos4 % 3;
		int jos5 = jos4 / 3;

		if (part5 == 0) {
			num5 = 0;
		} else if (part5 == 1) {
			num5 = 1;
		} else if (part5 == 2) {
			num5 = 2;
		}


		int num6 = 0;
		int part6 = jos5 % 3;
		int jos6 = jos5 / 3;

		if (part6 == 0) {
			num6 = 0;
		} else if (part6 == 1) {
			num6 = 1;
		} else if (part6 == 2) {
			num6 = 2;
		}


		int num7 = 0;
		int part7 = jos6 % 3;
		int jos7 = jos6 / 3;

		if (part7 == 0) {
			num7 = 0;
		} else if (part7 == 1) {
			num7 = 1;
		} else if (part7 == 2) {
			num7 = 2;
		}


		int num8 = 0;
		int part8 = jos7 % 3;
		int jos8 = jos7 / 3;

		if (part8 == 0) {
			num8 = 0;
		} else if (part8 == 1) {
			num8 = 1;
		} else if (part8 == 2) {
			num8 = 2;
		}


		int num9 = 0;
		int part9 = jos8 % 3;
		int jos9 = jos8 / 3;

		if (part9 == 0) {
			num9 = 0;
		} else if (part9 == 1) {
			num9 = 1;
		} else if (part9 == 2) {
			num9 = 2;
		}


		int num10 = 0;
		int part10 = jos9 % 3;
		int jos10 = jos9 / 3;

		if (part10 == 0) {
			num10 = 0;
		} else if (part10 == 1) {
			num10 = 1;
		} else if (part10 == 2) {
			num10 = 2;
		}


		int num11 = 0;
		int part11 = jos10 % 3;
		int jos11 = jos10 / 3;

		if (part11 == 0) {
			num11 = 0;
		} else if (part11 == 1) {
			num11 = 1;
		} else if (part11 == 2) {
			num11 = 2;
		}


		int num12 = 0;
		int part12 = jos11 % 3;
		int jos12 = jos11 / 3;

		if (part12 == 0) {
			num12 = 0;
		} else if (part12 == 1) {
			num12 = 1;
		} else if (part12 == 2) {
			num12 = 2;
		}


		String num1ex = String.valueOf(part1);
		String num2ex = String.valueOf(part2);
		String num3ex = String.valueOf(part3);
		String num4ex = String.valueOf(part4);
		String num5ex = String.valueOf(part5);
		String num6ex = String.valueOf(part6);
		String num7ex = String.valueOf(part7);
		String num8ex = String.valueOf(part8);
		String num9ex = String.valueOf(part9);
		String num10ex = String.valueOf(part10);
		String num11ex = String.valueOf(part11);
		String num12ex = String.valueOf(part12);
		System.out.println(num12ex + num11ex + num10ex +
				num9ex + num8ex + num7ex + num6ex + num5ex + num4ex + num3ex + num2ex + num1ex);
	}


	public static void four(int x) {
		int num1 = 0;
		int part1 = x % 4;
		int jos1 = x / 4;
		if (part1 == 0) {
			num1 = 0;
		} else if (part1 == 1) {
			num1 = 1;
		} else if (part1 == 2) {
			num1 = 2;
		}
	}

}
