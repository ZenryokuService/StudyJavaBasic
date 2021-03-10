package ysg.teacher.tkm.sukiri1.lesson10.player;

import ysg.teacher.tkm.sukiri1.lesson10.item.Item;
import ysg.teacher.tkm.sukiri1.lesson10.item.Weapon;
import ysg.teacher.tkm.sukiri1.lesson10.monster.Matango;

/**
 * SuperHeroクラスは継承不能にする
 *
 * @author 作成者の名前
 */
public final class SuperHero extends Hero {
	/** 飛んでいる状態 */
	private boolean flying;
	/** 武器 */
	private Weapon wepon;
	/** アイテム */
	private Item item;

	/** コンストラクタ */
	public SuperHero() {
		System.out.println("SuperHero!");
		// コード10-11に実装がないので。。。
		wepon = new Weapon("ななしの剣");
		item = new Item("やくそう", 30);
	}
	/** 飛翔する */
	public void fly() {
		this.flying = true;
		System.out.println(name + "は飛び上がった");
	}

	/** 着地する */
	public void land() {
		this.flying = false;
		System.out.println(name + "は着地した");
	}

	/**
	 * @return flying
	 */
	public boolean isFlying() {
		return flying;
	}

	/**
	 * @param flying セットする flying
	 */
	public void setFlying(boolean flying) {
		this.flying = flying;
	}


	@Override
	public void run() {
		System.out.println(name + "は撤退した");
	}

	@Override
	public void attack(Matango matango) {
		System.out.println("は" + wepon.getName() + "を装備した");
		System.out.println(name + "の攻撃");
		matango.setHp(matango.getHp() - 5);
		System.out.println("5ポイントのダメージを与えた");

		if (this.flying) {
			System.out.println(name + "の攻撃");
			//matango.setHp(matango.getHp() - 5);
			// 親クラスのメソッドを呼び出す(コード10-9)
			super.attack(matango);
			System.out.println("5ポイントのダメージを与えた");
		}
	}
}
