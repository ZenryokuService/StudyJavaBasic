package ysg.teacher.tkm.sukiri1;

import ysg.teacher.tkm.sukiri1.lesson11.monster.DeathBat;
import ysg.teacher.tkm.sukiri1.lesson11.monster.Goblin;
import ysg.teacher.tkm.sukiri1.lesson11.monster.Matango;
import ysg.teacher.tkm.sukiri1.lesson11.monster.WereWolf;
import ysg.teacher.tkm.sukiri1.lesson11.player.Dancer;
import ysg.teacher.tkm.sukiri1.lesson11.player.Hero;

public class Lesson11 {
	public static void main(String[] args) {
	}

	/**
	 * モンスターの継承関係を書いた図があってもコードがないので。。。
	 */
	public static void code11_opt() {
		// 動かすコードが書いていないので。。。
		Matango matango = new Matango("マタンゴ");
		Hero hero = new Hero("ミナト");
		hero.attack(matango);

		Dancer dancer = new Dancer("サミー");
		dancer.attack(matango);

		Goblin goblin = new Goblin("ゴブリン");
		goblin.attack(hero);

		WereWolf wolf = new WereWolf("ウェアラブル");
		wolf.attack(hero);

		DeathBat bat = new DeathBat("バット", 40, 30);

		System.out.println(hero.getName() + ": HP " + hero.getHp());
		System.out.println(dancer.getName() + ": HP " + dancer.getHp());
		System.out.println(matango.getName() + ": HP " + matango.getHp());
		System.out.println(goblin.getName() + ": HP " + goblin.getHp());
		System.out.println(wolf.getName() + ": HP " + wolf.getHp());
		System.out.println(bat.getName() + ": HP " + bat.getHp());
	}
}
