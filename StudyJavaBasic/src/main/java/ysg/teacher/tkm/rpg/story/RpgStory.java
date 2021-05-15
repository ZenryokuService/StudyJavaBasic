package ysg.teacher.tkm.rpg.story;

/**
 * テキストROGのストーリー部分を実行する
 * 1. 勇者作成のシーン
 *
 * 作成者の名前
 */
public class RpgStory {

	/** 改行コード */
	private static final String SEP = System.lineSeparator();

	public RpgStory() {
	}

	/**
	 * ゲーム開始時。初めの文章表示を行う。
	 */
	public void firstScene() {
		System.out.println("****************************");
		System.out.println("** TextRPG is Starting ... *");
		System.out.println("****************************" + SEP);

		System.out.println("よく来てくれた！　まずは、名前を教えてくれないか？");
	}
}
