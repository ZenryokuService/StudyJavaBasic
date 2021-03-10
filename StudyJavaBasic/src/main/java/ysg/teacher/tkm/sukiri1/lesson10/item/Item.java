package ysg.teacher.tkm.sukiri1.lesson10.item;

/**
 * アイテムクラス
 * @author 作成者の名前
 *
 */
public class Item {
	public String name;
	public int price;

	public Item(String name) {
		this.name = name;
		this.price = 0;
	}

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
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


}
