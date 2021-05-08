package ysg.teacher.tkm.sukiri1.lesson8.mains;

import ysg.teacher.tkm.frw.CommandIF;
import ysg.teacher.tkm.sukiri1.lesson10.monster.Matango;
import ysg.teacher.tkm.sukiri1.lesson10.player.Hero;
import ysg.teacher.tkm.sukiri1.lesson10.player.SuperHero;

public class Lesson10Impl implements CommandIF {

	@Override
	public void execute() {
		Hero hero = new Hero();
		hero.run();

		SuperHero superHero = new SuperHero();
		// コード10-11:作成したクラスを実行する
		superHero.attack(new Matango());
		superHero.run();
	}

}
