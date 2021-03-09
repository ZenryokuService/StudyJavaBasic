package ysg.teacher.tkm.sukiri1.lesson7.player;

public class Hero_Sample {
	/** 名前 */
	private String name;
	/** HP */
	private int hp;

	public Hero_Sample(String name, int hp) {
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

	public void battle() {
		System.out.println(this.name + "の攻撃！");
	}

	public void sleep() {
		System.out.println(this.name + "は寝た zzz...HP回復");
	}

	public void roll() {
		System.out.println(this.name + "は転がった...");
	}

	public void sit() {
		System.out.println(this.name + "は座った...HP回復");
	}

	public void escape() {
		System.out.println(this.name + "はにげだした！");
	}
}
