package ysg.teacher.tkm.sukiri1.lesson11.cleaning;

/**
 * キレイ度を5ビットで表す
 * @author 作成者の名前
 */
public class Shirt extends Wears {

	public Shirt() {
		super("シャツ");
		byte b = 0b11111;
		setCleanRate(b);
	}


	@Override
	public int getDifficalty() {
		return SHIRT;
	}

}
