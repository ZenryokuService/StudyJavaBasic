/**
 * Copyright (c) 2019-present ProconServerRPG JavaFX Library All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name ProconServerRPG JavaFX Library nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 */
package ysg.teacher.tkm.rpg.util;

import java.util.Date;
import java.util.Scanner;

/**
 * 
 * @author 作成者の名前
 */
public class RpgUtils {
	/** 名前の作成 */
	public static String createName(Scanner scan) {
		String name = null;
		while (true) {
			name = scan.nextLine();
			if (name.length() < 4 || name.length() < 7) {
				System.out.println("文字数は, ４文字以上、７文字以内にしてください。");
				continue;
			}
			break;
		}
		return name;
	}

	/** 性別の作成 */
	public static int createSex(Scanner scan) {
		int sex = 0;
		while (true) {
			System.out.println("1: 男 2: 女 のいずれかを入力してください。");
			String input = scan.nextLine();
			if ("1".equals(input) == false || "2".equals(input) == false) {
				sex = Integer.parseInt(input);
				break;
			} else {
				System.out.println("\"1\"か\"2\"を入力してください。");
			}
		}
		return sex;
	}

	/** 年齢の作成 */
	public static int createAge(Scanner scan) {
		int age = 0;
		while (true) {
			System.out.println("0-120までの数字を入力してください。");
			String input = scan.nextLine();
			if (input.matches("[0-9]{0,3}")) {
				age = Integer.parseInt(input);
				break;
			} else {
				System.out.println("0-120までの数字を入力してください。");
			}
		}
		return age;
	}

	/** 誕生日 */
	public static Date createBirthDay(Scanner scan) {
		Date birthDay = null;

		return birthDay;
	}
}
