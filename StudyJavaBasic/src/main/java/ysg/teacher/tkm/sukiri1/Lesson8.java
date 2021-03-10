package ysg.teacher.tkm.sukiri1;

import ysg.teacher.tkm.sukiri1.lesson8.monster.Matango;
import ysg.teacher.tkm.sukiri1.lesson8.player.Hero;

/**
 * 8章、コード8-1、メインメソッド作成
 *
 * @author teacher
 */
public class Lesson8 {
	public static void main(String[] args) {
		code8_16();
	}

	public static void code8_1() {
		// 勇者よ、この世界に生まれよ
		// お化けキノコよ、この世界に生まれよ
		// 勇者四よたたかえ
		// お化けキノコよ、逃げろ
	}

	public static void code8_12() {
		// 勇者生成
		Hero hero = new Hero();
		// フィールドに初期値をセット
		hero.name = "ミナト";
		hero.hp = 100;
		System.out.println("勇者" + hero.name + "を生み出しました");
	}

	public static void code8_14() {
		String yusha_name = "ミナト";
		int yusha_hp = 100;

		int matango1_hp = 50;
		int matangl1_level = 10;

		int matango2_hp = 48;
		int matangl2_level = 10;

		System.out.println(yusha_name + "5秒座った");
		yusha_hp += 5;
		System.out.println("HPが5ポイント回復した");

	}

	/**
	 * まともなオブジェクト指向で書くときはこのように書く
	 */
	public static void code8_16() {
		Hero hero = new Hero("ミナト", 100);
		Matango matango = new Matango(50, 'A');
		Matango matango2 = new Matango(50, 'B');

		// 冒険の始まり
		hero.slip();
		matango.run();
		matango2.run();
		// 勇者も逃げる
		hero.run();
	}
}
