package ysg.teacher.tkm.sukiri1.lesson9;

public class Hero {
	public String name;
	public int hp;
	public Sword sword;

	public Hero() {
		name = "ミナト";
		hp = 100;
		// 装備なし
		sword = null;
	}

	/** 権を装備する勇者 */
	public Hero(String name, Sword sword) {
		name = "ミナト";
		hp = 100;
		// 装備なし
		this.sword = sword;
	}

	public void attack() {
		System.out.println(name + "は攻撃した");
		System.out.println("敵に5のダメージ");
	}

	/////// GetterとSetter ///////////////////
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

	/**
	 * @return sword
	 */
	public Sword getSword() {
		return sword;
	}

	/**
	 * @param sword セットする sword
	 */
	public void setSword(Sword sword) {
		this.sword = sword;
	}

}
