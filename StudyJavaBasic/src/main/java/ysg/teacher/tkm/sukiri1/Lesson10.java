package ysg.teacher.tkm.sukiri1;

import ysg.teacher.tkm.sukiri1.lesson10.player.Hero;
import ysg.teacher.tkm.sukiri1.lesson10.player.SuperHero;

public class Lesson10 {

	public static void main(String[] args) {
		code10_4();
	}

	public static void code10_4() {
		Hero hero = new Hero();
		hero.run();

		SuperHero superHero = new SuperHero();
		superHero.run();
	}
}
