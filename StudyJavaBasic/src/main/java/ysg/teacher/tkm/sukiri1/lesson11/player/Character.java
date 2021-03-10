package ysg.teacher.tkm.sukiri1.lesson11.player;

import ysg.teacher.tkm.sukiri1.lesson11.monster.Matango;

/**
 * java.lang.Characterクラスと同じ名前なのでイマイチ
 * コード11-2では、空実装にしたが、コード11-7で抽象クラスに変更する
 *
 * @author 作成者の名前
 */
public abstract class Character {
	public String name;
	public int hp;

	public Character(String name) {
		this.name = name;
		this.hp = 100;
	}

	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	/** にげる */
	public void run() {
		System.out.println(name + "は逃げ出した");
	}

	/** 抽象メソッド */
	public abstract void attack(Matango matango);
//	/** code11-2 空実装をおこなう */
//	public void attack(Matango matango) {
////		System.out.println(name + "の攻撃");
////		matango -= 0;
////		System.out.printl("敵に？？のダメージを与えた");
//	}

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
