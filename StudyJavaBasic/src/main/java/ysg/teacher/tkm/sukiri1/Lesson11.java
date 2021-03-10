package ysg.teacher.tkm.sukiri1;

import ysg.teacher.tkm.sukiri1.lesson11.monster.Matango;
import ysg.teacher.tkm.sukiri1.lesson11.player.Dancer;
import ysg.teacher.tkm.sukiri1.lesson11.player.Hero;

public class Lesson11 {
	public static void main(String[] args) {
		// 動かすコードが書いていないので。。。
		Matango matango = new Matango("マタンゴ");
		Hero hero = new Hero("ミナト");
		hero.attack(matango);

		Dancer dancer = new Dancer("サミー");
		dancer.attack(matango);

		System.out.println(hero.getName() + ": HP " + hero.getHp());
		System.out.println(dancer.getName() + ": HP " + dancer.getHp());
		System.out.println(matango.getName() + ": HP " + matango.getHp());
	}
}
