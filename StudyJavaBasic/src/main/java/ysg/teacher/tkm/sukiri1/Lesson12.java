package ysg.teacher.tkm.sukiri1;

import ysg.teacher.tkm.sukiri1.lesson11.monster.Matango;
import ysg.teacher.tkm.sukiri1.lesson12.player.Wizard;

public class Lesson12 {

	public static void main(String[] args) {

	}

	public static void code12_3() {
		Wizard wizard = new Wizard("アカサ");
		Matango matango = new Matango("マタンゴ");
		wizard.attack(matango);
		wizard.fireball(matango);
	}
}
