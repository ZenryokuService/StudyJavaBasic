package ysg.teacher.tkm.sukiri1.lesson7.monster;

public class Monster {
	/** モンスタータイプ(種類) */
	protected String monsterType;
	/** 仲間になる可能性がある */
	protected boolean canBePlayer;
	/** 名前 */
	protected String name;
	/** HP */
	protected int hp;

	/**
	 * @return monsterType
	 */
	public String getMonsterType() {
		return monsterType;
	}
	/**
	 * @param monsterType セットする monsterType
	 */
	public void setMonsterType(String monsterType) {
		this.monsterType = monsterType;
	}
	/**
	 * @return canBePlayer
	 */
	public boolean isCanBePlayer() {
		return canBePlayer;
	}
	/**
	 * @param canBePlayer セットする canBePlayer
	 */
	public void setCanBePlayer(boolean canBePlayer) {
		this.canBePlayer = canBePlayer;
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
	 * HPが０以下の場合はTRUE
	 * @return 戦闘不能ならばTRUE
	 */
	public boolean isUnableToFight() {
		return hp >= 0;
	}
}
