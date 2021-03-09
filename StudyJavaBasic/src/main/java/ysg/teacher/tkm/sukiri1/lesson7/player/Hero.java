package ysg.teacher.tkm.sukiri1.lesson7.player;

import ysg.teacher.tkm.sukiri1.lesson7.monster.Monster;

public class Hero {
	/** 名前 */
	private String name;
	/** HP */
	private int hp;

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
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


	public void exeCommand(String input) {
		switch (input) {
		case "battle": // たたかう
			this.battle();
			break;
		case "sleep": // ねる
			this.sleep();
			break;
		case "roll": // ころぶ
			this.roll();
			break;
		case "sit": // すわる
			this.sit();
			break;
		case "escape": // にげる
			this.escape();
			break;
		default: // 想定外の入力
			System.out.println("想定外の入力です。なにもしません。。。");
		}
	}

	public void exeCommand2(String input) {
		switch (input) {
		case "battle": // たたかう
			this.battle();
			break;
		case "sleep": // ねる
			this.sleep();
			break;
		case "roll": // ころぶ
			this.roll();
			break;
		case "sit": // すわる
			this.sit();
			break;
		default: // 想定外の入力
			System.out.println("想定外の入力です。なにもしません。。。");
		}
	}

	public void exeCommand7(String input, Monster monster) {
		switch (input) {
		case "battle": // たたかう
			this.battle(monster);
			break;
		case "sleep": // ねる
			this.sleep2();
			break;
		case "roll": // ころぶ
			this.roll();
			break;
		case "sit": // すわる
			this.sit();
			break;
		default: // 想定外の入力
			System.out.println("想定外の入力です。なにもしません。。。");
		}
	}

	public void battle() {
		System.out.println(this.name + "の攻撃！");
	}

	public void battle(Monster monster) {
		System.out.println(this.name + "の攻撃！");
		monster.setHp(monster.getHp() - 10);
		System.out.println(monster.getMonsterType() + "に10のダメージ");

		System.out.println(monster.getMonsterType() + "の攻撃！");
		setHp(getHp() - 10);
		System.out.println(name + "に10のダメージ");
	}

	public void sleep() {
		System.out.println(this.name + "は寝た zzz...HP回復");
	}

	public void sleep2() {
		System.out.println(this.name + "は寝た zzz...HP回復");
		this.hp = this.hp + 10;
	}

	public void sleep(Monster monster) {
		System.out.println(this.name + "は寝た zzz...HP回復");
		this.hp = this.hp + 10;
	}

	public void roll() {
		System.out.println(this.name + "は転がった...");
	}

	public void roll2() {
		System.out.println(this.name + "は転がった...５のダメージ");
		this.hp = this.hp - 5;
	}

	public void roll(Monster monster) {
		System.out.println(this.name + "は転がった...５のダメージ");
		this.hp = this.hp - 5;
	}

	public void sit() {
		System.out.println(this.name + "は座った...HP回復");
	}

	public void sit2() {
		System.out.println(this.name + "は座った...HP回復");
		this.hp = this.hp + 3;
	}

	public void sit(Monster monster) {
		System.out.println(this.name + "は座った...HP回復");
		this.hp = this.hp + 3;
	}

	public void escape() {
		System.out.println(this.name + "はにげだした！");
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(name + "は逃げ切れなかった...");
	}

	public void escape2() {
		System.out.println(this.name + "はにげだした！");
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(name + "は逃げ切れなかった...１０のダメージ");
		this.hp -= 10;
	}

}
