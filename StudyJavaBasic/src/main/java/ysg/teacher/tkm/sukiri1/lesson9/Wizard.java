package ysg.teacher.tkm.sukiri1.lesson9;

public class Wizard {
	public String name;
	public int hp;

	public void heal(Hero hero) {
		hero.setHp(hero.getHp() + 10);
		System.out.println(hero.getName() + "のHPを10ポイント回復した");
	}

	//// GetterとSetter ////

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
