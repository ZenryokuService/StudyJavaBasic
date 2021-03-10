package ysg.teacher.tkm.sukiri1.lesson11.monster;

import ysg.teacher.tkm.sukiri1.lesson11.player.Character;

public class Matango extends Character {

	public Matango(String name) {
		super(name);
	}

	public void attack(Matango matango) {
		System.out.println("マタンゴの攻撃");
		this.hp -= 5;
		System.out.println("マタンゴに5ポイントのダメージ");
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return hp
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * @param hp セットする hp
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}
}
