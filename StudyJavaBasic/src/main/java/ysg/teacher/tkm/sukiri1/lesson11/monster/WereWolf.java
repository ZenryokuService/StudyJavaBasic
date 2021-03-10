package ysg.teacher.tkm.sukiri1.lesson11.monster;

import ysg.teacher.tkm.sukiri1.lesson11.player.Hero;

public class WereWolf extends WalkingMonster {

	public WereWolf(String name) {
		super(name);
	}
	@Override
	public void attack(Hero hero) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(name + "の攻撃");
		hero.setHp(hero.getHp() -5);
		System.out.println(hero.getName() + "は5のダメージを受けた");
	}
}
