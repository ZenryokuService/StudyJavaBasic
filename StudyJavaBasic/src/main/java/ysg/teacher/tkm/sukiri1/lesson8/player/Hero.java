package ysg.teacher.tkm.sukiri1.lesson8.player;

/**
 * フィールド変数のアクセス就職しが不適当
 * @author 作成者の名前
 */
public class Hero {
	public String name;
	public int hp;

	/** 追加 */
	public int level = 10;
	/** 定数 */
	public final int LEVEL = 10;

	/** 【追加】デフォルト・コンストラクタ */
	public Hero() {
	}

	/** 【追加】コンストラクタのオーバーロード */
	public Hero(String name) {
		this.name = name;
	}

	/** 【追加】コンストラクタのオーバーロード */
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	/** たたかう */
	public void attack() {};

	/** ねる */
	public void sleep() {
		// コード8-7
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した");
	}

	/** 座る */
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った");
		System.out.println("HPが" +sec + "ポイント回復した");

	}

	/** 転ぶ */
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ");
	}

	/** 逃げる */
	public void run() {
		System.out.println(this.name + "は逃げ出した");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは、" + this.hp + "でした");
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

	/**
	 * @return level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level セットする level
	 */
	public void setLevel(int level) {
		this.level = level;
	}


}
