package ysg.teacher.tkm.sukiri1.lesson8.mains;

import ysg.teacher.tkm.frw.CommandIF;
import ysg.teacher.tkm.sukiri1.lesson8.monster.Matango;
import ysg.teacher.tkm.sukiri1.lesson8.player.Hero;

public class Lesson8Impl implements CommandIF {

	@Override
	public void execute() {
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
