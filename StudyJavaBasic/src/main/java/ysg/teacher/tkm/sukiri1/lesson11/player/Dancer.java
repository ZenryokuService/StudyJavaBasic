package ysg.teacher.tkm.sukiri1.lesson11.player;

import ysg.teacher.tkm.sukiri1.lesson11.monster.Matango;

public class Dancer extends Character {

	public Dancer(String name) {
		super(name, 100);
	}

	public Dancer(String name, int hp) {
		super(name, hp);
	}

	@Override
	public void attack(Matango matango) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(name + "の攻撃");
		matango.setHp(matango.getHp() - 5);
		System.out.println(matango.getName() + "に5ポイントのダメージ");
	}

	public void dance() {
		System.out.println(name + "は、情熱的に踊った");
	}
}
