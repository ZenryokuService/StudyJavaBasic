package ysg.teacher.tkm.sukiri1.lesson11.monster;

import ysg.teacher.tkm.sukiri1.lesson11.player.Hero;

public abstract class Monster {
	/** HP */
	protected int hp;
	/** MP */
	protected int mp;
	/** 名前 */
	protected String name;
	/** AとかBなど */
	protected char suffix;

	public Monster(String name) {
		this.name = name;
		this.hp = 30;
		this.mp = 20;
	}

	public Monster(String name, int hp) {
		this.name = name;
		this.hp = hp;
		this.mp = 20;
	}

	public Monster(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	/** 攻撃 */
	public abstract void attack(Hero hero);

	/** にげる */
	public abstract void run();

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
	 * @return suffix
	 */
	public char getSuffix() {
		return suffix;
	}

	/**
	 * @param suffix セットする suffix
	 */
	public void setSuffix(char suffix) {
		this.suffix = suffix;
	}


}
