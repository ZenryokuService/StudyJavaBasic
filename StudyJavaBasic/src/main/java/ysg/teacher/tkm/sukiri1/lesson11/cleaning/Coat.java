package ysg.teacher.tkm.sukiri1.lesson11.cleaning;

public class Coat extends Wears {

	public Coat() {
		super("コート");
		byte b = 0b1111111;
		setCleanRate(b);
	}

	@Override
	public int getDifficalty() {
		return COAT;
	}

}
