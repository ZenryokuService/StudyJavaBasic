package ysg.teacher.tkm.mains;

import java.util.Scanner;

import ysg.teacher.tkm.frw.CommandIF;
import ysg.teacher.tkm.rpg.story.RpgStory;

/**
 * すっきりJavaの学習として、テキストRPGを作成する。
 *
 * @author 作成者の名前
 */
public class TextRpg implements CommandIF {
	/** 標準入力 */
	private Scanner scan;
	/** ストーリークラス */
	private RpgStory story;

	public TextRpg() {
		scan = new Scanner(System.in);
		story = new RpgStory();
	}

	/** テキストROG実行処理 */
	@Override
	public void execute() {
		// テキストORGを開始する
		story.firstScene();
	}

}
