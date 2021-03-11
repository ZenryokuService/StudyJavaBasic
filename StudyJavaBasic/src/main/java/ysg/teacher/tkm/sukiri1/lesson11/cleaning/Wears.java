package ysg.teacher.tkm.sukiri1.lesson11.cleaning;

/** 衣類など */
public abstract class Wears {
	/** タオルのビット数 */
	protected static final int TOWL = 3;
	/** シャツのビット数 */
	protected static final int SHIRT = 5;
	/** コートのビット数 */
	protected static final int COAT = 8;

	private String name;
	private int price;
	/**
	 * 1ビット目：チェックポイント１(1: クリーニング不足, 0: クリーニング済み)
	 * 2ビット目：チェックポイント２(1: クリーニング不足, 0: クリーニング済み)
	 * 3ビット目：チェックポイント３(1: クリーニング不足, 0: クリーニング済み)
	 * 4ビット目：チェックポイント４(1: クリーニング不足, 0: クリーニング済み)
	 * 5ビット目：チェックポイント５(1: クリーニング不足, 0: クリーニング済み)
	 * 6ビット目：チェックポイント６(1: クリーニング不足, 0: クリーニング済み)
	 * 7ビット目：チェックポイント７(1: クリーニング不足, 0: クリーニング済み)
	 * 8ビット目：チェックポイント８(1: クリーニング不足, 0: クリーニング済み)
	 */
	private byte cleanRate;

	public Wears() {
		name = "シャツ";
		price = 10;
		// すべてのチェックポイントがクリーニング不足の状態で初期化する
		cleanRate = getCleanRate();
	}

	public Wears(String name) {
		this.name = name;
		price = 10;
		// すべてのチェックポイントがクリーニング不足の状態で初期化する
		cleanRate =getCleanRate();
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
	 * タオル：3ビット＝0-6
	 * シャツ：5ビット＝0-31
	 * コート：8ビット＝0-127
	 * @return
	 */
	public byte getCleanRate() {
		return cleanRate;
	}

	/**
	 * @param cleanRate セットする cleanRate
	 */
	public void setCleanRate(byte cleanRate) {
		this.cleanRate = cleanRate;
	}

	/**
	 * この品物のキレイ度を％で返却する
	 */
	public String printKitanaido() throws Exception {
		System.out.println("キナタナイ度測定：" + name);
		// byteをint型に自動キャストしている
		int cleanPer = getCleanRate();
		String bitsStr = Integer.toBinaryString(cleanPer);

		char[] bits = bitsStr.toCharArray();

		int zeroCount = 0;
		int oneCount = 0;
		for (int i = 0; i < bits.length; i++) {
			if ('0' == bits[i]) {
				zeroCount++;
			} else if ('1' == bits[i]) {
				oneCount++;
			} else {
				throw new Exception("想定外の値です: " + bits[i]);
			}
		}
		int answer = (oneCount / getDifficalty()) * 100;
//		System.out.println("   oneCount: " + oneCount + "    " + name + " : " + answer);
		return String.valueOf(answer);
	}

	/**
	 *
	 * @return タオル・シャツ・コート = 3 : 5 : 8
	 */
	protected abstract int getDifficalty();
}
