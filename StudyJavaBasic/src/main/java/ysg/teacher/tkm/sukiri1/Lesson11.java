package ysg.teacher.tkm.sukiri1;

import ysg.teacher.tkm.sukiri1.lesson11.cleaning.CleaningService;
import ysg.teacher.tkm.sukiri1.lesson11.cleaning.Coat;
import ysg.teacher.tkm.sukiri1.lesson11.cleaning.Honten;
import ysg.teacher.tkm.sukiri1.lesson11.cleaning.Shirt;
import ysg.teacher.tkm.sukiri1.lesson11.cleaning.Towl;
import ysg.teacher.tkm.sukiri1.lesson11.cleaning.Wears;
import ysg.teacher.tkm.sukiri1.lesson11.monster.DeathBat;
import ysg.teacher.tkm.sukiri1.lesson11.monster.Goblin;
import ysg.teacher.tkm.sukiri1.lesson11.monster.Matango;
import ysg.teacher.tkm.sukiri1.lesson11.monster.WereWolf;
import ysg.teacher.tkm.sukiri1.lesson11.player.Dancer;
import ysg.teacher.tkm.sukiri1.lesson11.player.Hero;

public class Lesson11 {
	public static void main(String[] args) {
		code11_15_opt();
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

	public static void exeCleaning(CleaningService service, Wears wear) throws Exception {
		System.out.println(wear.getName() + "のキタナイ度：" + wear.printKitanaido());
		// 参照渡し
		if (wear instanceof Towl) {
			service.washTowl((Towl) wear);
		} else if (wear instanceof Shirt) {
			service.washShirt((Shirt) wear);
		} else if (wear instanceof Coat) {
			service.washCoat((Coat) wear);
		} else {
			throw new Exception("想定外のクラスです。" + wear.getClass().getSimpleName());
		}

		// クリーニング後
		System.out.println(wear.getName() + "のキタナイ度：" + wear.printKitanaido());
	}

	public static void code11_15_opt() {
		Honten honten = new Honten();
		Towl towl = new Towl();

		// タオルをクリーニング
		try {
			exeCleaning(honten, towl);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Shirt shirt = new Shirt();
		// シャツをクリーニング
		try {
			exeCleaning(honten, shirt);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Coat coat = new Coat();
		// コートをクリーニング
		try {
			exeCleaning(honten, coat);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
