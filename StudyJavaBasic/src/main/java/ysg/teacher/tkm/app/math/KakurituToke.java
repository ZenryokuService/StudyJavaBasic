package ysg.teacher.tkm.app.math;

public class KakurituToke {
	/**
	 * yoso個の要素からchoice個の要素を選択するときのパターン数
	 * @param yoso 全体の要素数
	 * @param choice 選択する要素数
	 * @return 起こりうるパターンの数
	 */
	public int junretu(int yoso, int choice) {
		// 分母
		int bunbo = kaijo(yoso - choice);
		// 分子
		int bunshi = kaijo(yoso);

		return bunshi / bunbo;
	}

	public int kaijo(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
