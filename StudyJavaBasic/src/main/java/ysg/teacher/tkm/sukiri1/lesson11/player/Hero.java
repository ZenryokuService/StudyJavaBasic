package ysg.teacher.tkm.sukiri1.lesson11.player;

import ysg.teacher.tkm.sukiri1.lesson11.monster.Matango;

/**
 * コード11-9
 * @author 作成者の名前
 */
public class Hero extends Character {

	public Hero(String name) {
		super(name);
	}

	public Hero(String name, int hp) {
		super(name, hp);
	}

	/**
	 * コード11-7で抽象メソッドに変更したので、オーバーライド
	 */
	@Override
	public void attack(Matango matango) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(name + "の攻撃");
		matango.setHp(matango.getHp() - 5);
		System.out.println(matango.getName() + "に5ポイントのダメージ");
	}

}
