package ysg.teacher.tkm.sukiri1.lesson12.player;

import ysg.teacher.tkm.sukiri1.lesson11.monster.Matango;
import ysg.teacher.tkm.sukiri1.lesson11.player.Character;

public class Wizard extends Character {

	private int mp;

	public Wizard(String name) {
		super(name);
		hp = 40;
		mp = 50;
	}

	public Wizard(String name, int hp) {
		this(name);
		hp = 40;
	}

	@Override
	public void attack(Matango matango) {
		System.out.println(name + "の攻撃");
		matango.hp -= 3;
		System.out.println("敵に3ポイントのダメージ");
	}

	public void fireball(Matango matango) {
		System.out.println(name + "は、火を放った");
		matango.setHp(matango.getHp() - 20);
		System.out.println("敵に20ポイントのダメージ");
		mp -= 5;
	}

	/**
	 * @return mp
	 */
	public int getMp() {
		return mp;
	}

	/**
	 * @param mp セットする mp
	 */
	public void setMp(int mp) {
		this.mp = mp;
	}


}
