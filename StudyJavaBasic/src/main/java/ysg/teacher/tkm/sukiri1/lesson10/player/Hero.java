package ysg.teacher.tkm.sukiri1.lesson10.player;

import ysg.teacher.tkm.sukiri1.lesson10.monster.Matango;

/**
 * デフォルトの勇者クラス
 *
 * @author 作成者の名前
 */
public class Hero {
	/** 名前 */
//	private String name = "ミナト";
	protected String name = "ミナト";
	/** HP */
	private int hp = 100;

	/** コンストラクタ */
	public Hero() {
		System.out.println("Hero!");
	}
	/** 攻撃 */
	public void attack(Matango matango) {
		System.out.println(name + "の攻撃");
		matango.setHp(matango.getHp() - 5);
		System.out.println("5ポイントのダメージを与えた");
	}

	public final int hissatu() {
		return 100;
	}

	/** 逃げる */
	public void run() {
		System.out.println(name + "は逃げ出した");
	}
}
