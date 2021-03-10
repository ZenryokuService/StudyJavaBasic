package ysg.teacher.tkm.sukiri1.lesson10.player;

import ysg.teacher.tkm.sukiri1.lesson10.monster.Matango;

/**
 * SuperHeroクラスは継承できないので
 * Heroクラスを継承したモンスタークラス、finalクラスは継承できないサンプル
 *
 * @author 作成者の名前
 */
public class HeroMonster extends Hero /* SuperHeroは継承できない */{
	/** モンスター状態 */
	private boolean isMonster;
	/** 攻撃力 */
	private int power;

	public void attack(Matango matango) {
		if(isMonster) {
			matango.setHp(matango.getHp() - 5 * 2);
		} else {
			matango.setHp(matango.getHp() - 5);
		}
	}

	/**
	 * final就職氏がついていても、オーバーロードはできるようだ。
	 * @param name
	 * @return
	 */
	public int hissatu(String name) {
		return 300;
	}
}
