package ysg.teacher.tkm.sukiri1.lesson11.cleaning;

/**
 * 本店のクリーニングs-ビス実装クラス
 * タオルが得意。
 *
 * @author 作成者の名前
 */
public class Honten implements CleaningService {

	public static final String NAME = "本店";

	@Override
	public Shirt washShirt(Shirt shirt) {
		System.out.println("*** " + NAME + " シャツ クリーニング ***");
		byte b = 0b00011;
		shirt.setCleanRate(b);
		return null;
	}

	@Override
	public Towl washTowl(Towl towl) {
		System.out.println("*** " + NAME + " タオル クリーニング ***");
		byte b = 0b000;
		towl.setCleanRate(b);
		return towl;
	}

	@Override
	public Coat washCoat(Coat coat) {
		System.out.println("*** " + NAME + " コート クリーニング ***");
		byte b = 0b0001111;
		coat.setCleanRate(b);
		return null;
	}

}
