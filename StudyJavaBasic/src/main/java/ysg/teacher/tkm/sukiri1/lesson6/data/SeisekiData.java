package ysg.teacher.tkm.sukiri1.lesson6.data;

/**
 * 成績を格納するデータクラス。
 *
 * @author 作成者の名前
 * @see ysg.teacher.tkm.sukiri1.Lesson6;
 */
public class SeisekiData {
	/** 改行文字を取得する */
	public static final String SEPARATOR = System.lineSeparator();
	/** 国語の点数 */
	private int japanese;
	/** 英語の点数 */
	private int english;
	/** 数学の点数 */
	private int math;
	/** 社会の点数 */
	private int socialStudies;
	/** 理科の点数 */
	private int science;

	/**
	 * 配列を各フィールドに設定する。
	 *
	 * @param scores int型の配列(0:国語、1:数学、2:英語、3:社会、4:理科)
	 */
	public SeisekiData(int[] scores) {
		this.setJapanese(scores[0]);
		this.setMath(scores[1]);
		this.setEnglish(scores[2]);
		this.setSocialStudies(scores[3]);
		this.setScience(scores[4]);
	}

	/**
	 * 国数英社理の合計点を返却する
	 * @return 合計点
	 */
	public int gokeiScore() {
		int sum = 0;
		sum += getJapanese();
		sum += getMath();
		sum += getEnglish();
		sum += getSocialStudies();
		sum += getScience();
		return sum;
	}

	/**
	 * @return japanese
	 */
	public int getJapanese() {
		return japanese;
	}
	/**
	 * @param japanese セットする japanese
	 */
	public void setJapanese(int japanese) {
		this.japanese = japanese;
	}
	/**
	 * @return english
	 */
	public int getEnglish() {
		return english;
	}
	/**
	 * @param english セットする english
	 */
	public void setEnglish(int english) {
		this.english = english;
	}
	/**
	 * @return math
	 */
	public int getMath() {
		return math;
	}
	/**
	 * @param math セットする math
	 */
	public void setMath(int math) {
		this.math = math;
	}
	/**
	 * @return socialStudies
	 */
	public int getSocialStudies() {
		return socialStudies;
	}
	/**
	 * @param socialStudies セットする socialStudies
	 */
	public void setSocialStudies(int socialStudies) {
		this.socialStudies = socialStudies;
	}
	/**
	 * @return science
	 */
	public int getScience() {
		return science;
	}
	/**
	 * @param science セットする science
	 */
	public void setScience(int science) {
		this.science = science;
	}

	@Override
	public String toString() {
		StringBuilder build = new StringBuilder();
		build.append("国語: ").append(this.japanese).append(SEPARATOR);
		build.append("数学: ").append(this.math).append(SEPARATOR);
		build.append("英語: ").append(this.english).append(SEPARATOR);
		build.append("社会: ").append(this.socialStudies).append(SEPARATOR);
		build.append("理科: ").append(this.science).append(SEPARATOR);

		return build.toString();
	}
}
