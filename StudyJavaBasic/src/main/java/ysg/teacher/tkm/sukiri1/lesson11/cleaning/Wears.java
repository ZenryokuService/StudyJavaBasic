package ysg.teacher.tkm.sukiri1.lesson11.cleaning;

/** 衣類など */
public class Wears {
	private String name;
	private int price;
	private byte[] cleanRate;

	public Wears() {
		name = "シャツ";
		price = 10;
		cleanRate = new byte[]{0b0001, 0b0010, 0b0100, 0b1000};
	}

	public Wears(String name) {
		this.name = name;
		price = 10;
		cleanRate = new byte[]{0b0001, 0b0010, 0b0100, 0b1000};
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
	 * @return price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price セットする price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return cleanRate
	 */
	public byte[] getCleanRate() {
		return cleanRate;
	}

	/**
	 * @param cleanRate セットする cleanRate
	 */
	public void setCleanRate(byte[] cleanRate) {
		this.cleanRate = cleanRate;
	}


}
