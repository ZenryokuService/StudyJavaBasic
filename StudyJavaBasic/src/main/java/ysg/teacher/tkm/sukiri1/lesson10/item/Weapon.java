package ysg.teacher.tkm.sukiri1.lesson10.item;

/**
 * 武器クラス
 * @author 作成者の名前
 *
 */
public class Weapon extends Item {

	/**
	 * 親クラスには、デフォルトコンストラクタが定義されていないので
	 * super()が呼び出せずエラーになる。
	 */
	public Weapon() {
		super("武器");
	}

	public Weapon(String name) {
		super(name, 0);
	}

	public Weapon(String name, int price) {
		super(name, price);
	}
}
