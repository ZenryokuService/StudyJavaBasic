package ysg.teacher.tkm.sukiri1.lesson8.monster;

/**
 * マタンゴクラス
 * @author 作成者の名前
 */
public class Matango {
	public int hp;
	final int LEVEL = 10;
	char suffix;

	/** コンストラクタ */
	public Matango() {
		hp = 50;
		suffix = 0;
	}

	/** コンストラクタ */
	public Matango(int hp, char suffix) {
		this.hp = hp;
		this.suffix = suffix;
	}

	public void run() {
		System.out.println("マタンゴ" + this.suffix + "は逃げ出した");
	}
}
