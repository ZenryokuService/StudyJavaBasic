package ysg.teacher.tkm.sukiri1.lesson7.monster;

public class Matango_Sample {
	/** 名前 */
	private String name;
	/** HP */
	private int hp;

	public Matango_Sample() {
		name = "マタンゴ";
		hp = 10;
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
		// 本来はフィールド変数を移動する。。。
		this.hp = hp;
	}


}
