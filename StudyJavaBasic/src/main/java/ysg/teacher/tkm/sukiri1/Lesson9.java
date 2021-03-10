package ysg.teacher.tkm.sukiri1;

import ysg.teacher.tkm.sukiri1.lesson8.player.Hero;
import ysg.teacher.tkm.sukiri1.lesson9.Sword;
import ysg.teacher.tkm.sukiri1.lesson9.Wizard;

public class Lesson9 {
	public static void main(String[] args) {
		code9_2();
	}

	public static void code9_1() {
		// Lesson8の勇者クラス
		Hero hero = new Hero();
		hero.setHp(100);
	}

	public static void code9_2() {
		// Lesson8の勇者クラス
		Hero hero = new Hero();
		hero.hp = 100;

		Hero hero2;
		hero2 = hero;
		System.out.println("HP: " + hero2.hp);

		hero2.hp = 200;
		System.out.println("HeroのHP: " + hero.hp);
		System.out.println("Hero2のHP: " + hero2.hp);

	}

	public static void code9_4() {
		Sword sword = new Sword();
		sword.setName("炎の剣");
		sword.setDamage(20);

		// クラス名が重複するのでパッケージ名から実装する(完全クラス名)
		ysg.teacher.tkm.sukiri1.lesson9.Hero hero = new ysg.teacher.tkm.sukiri1.lesson9.Hero();
		hero.setSword(sword);

		System.out.println("現在の武器は" + hero.getSword().getName() + "です");
	}

	public static void code9_6() {
		ysg.teacher.tkm.sukiri1.lesson9.Hero hero = new ysg.teacher.tkm.sukiri1.lesson9.Hero("ミナト", null);
		ysg.teacher.tkm.sukiri1.lesson9.Hero hero2 = new ysg.teacher.tkm.sukiri1.lesson9.Hero("アカサ", null);

		Wizard wizard = new Wizard();
		// 処理は同じだが、オブジェクト指向的には下のほうの書き方をする
		wizard.name = "菅原";
		wizard.setName("すがわら");

		wizard.heal(hero);
		wizard.heal(hero2);
		wizard.heal(hero2);

		System.out.println(hero.getName() + "  HP: " + hero.getHp());
		System.out.println(hero2.getName() + "  HP: " + hero2.getHp());
	}
}
