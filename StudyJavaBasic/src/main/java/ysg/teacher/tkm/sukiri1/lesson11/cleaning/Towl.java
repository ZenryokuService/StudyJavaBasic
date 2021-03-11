package ysg.teacher.tkm.sukiri1.lesson11.cleaning;

/**
 * タオルのキレイ度は３ビット表現にする。
 * @author 作成者の名前
 */
public class Towl extends Wears {

	public Towl() {
		super("タオル");
		byte b = 0b111;
		setCleanRate(b);
	}


	@Override
	public int getDifficalty() {
		return TOWL;
	}
}
