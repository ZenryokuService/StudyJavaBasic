package ysg.teacher.tkm.poket;

public class AccessSample {
	/** フィールド変数: 同じクラスからのみアクセス可能 */
	private int privateFileld;

	/**
	 * フィールド変数:
	 * ・同じクラス、
	 * ・同じパッケージ、
	 * 上記のみアクセス可能
	 */
	int packagedField;

	/**
	 * フィールド変数:
	 * ・同じクラス、
	 * ・同じパッケージ、
	 * ・継承関係のあるクラス
	 * 上記のみアクセス可能
	 */
	protected int protectedFileld;

	/**
	 * フィールド変数:
	 * どこからでもアクセス可能
	 */
	public String publicField;

	/**
	 * staticがついているので、メインメソッドから呼び出すことができる。
	 */
	private static double staticField;

	/////// メソッドの書き方 /////////
	/* アクセス修飾子 返り値 メソッド名(引数1, 引数2 ...) {
	     「{}」のなかに処理を書く
	   }
	 */
	// 【返り値】返すデータ型を指定する
	// void: 何も返さない
	// int : int型を返す
	// String: String型を返す
	//【アクセス修飾子は4種類】
	// 1. private
	// 2. 何も書かない
	// 3. protected
	// 4. public
	// 1から順にアクセス範囲が一番小さく
	// 4がアクセス範囲が一番大きい
	///////////////////////////////////

	/**
	 * このクラスの中でのみ使える、※アクセス範囲が狭い
	 * 授業で使っている通常のメソッド
	 */
	private static void privateMethod() {
		System.out.println("アクセスできる範囲が違う、いつも使っているメソッド");
		// 何も返さない
	}

	static void packagedMethod() {
		System.out.println("アクセスできる範囲がパッケージ内のみの、いつも使っているメソッド");
		// 何も返さない
	}
	/**
	 * ・同じクラス、
	 * ・同じパッケージ、
	 * ・継承関係のあるクラス
	 * 上記のみアクセスできる
	 * 授業で使っている通常のメソッド
	 */
	protected static int protectedMethod() {
		System.out.println("アクセスできる範囲が違う、いつも使っているメソッド");
		return 1; // 整数型(int型)を返す
	}

	/**
	 * 授業で使っている通常のメソッド
	 * どこからでもアクセスできる
	 */
	public static String publicMethod() {
		System.out.println("アクセスできる範囲が違う、いつも使っているメソッド");
		return "文字列"; // 文字列型(String型)を返す
	}

	/** メインメソッド */
	public static void main(String[] args) {
		/*
		 * メインメソッドでは、メソッドを呼び出して処理を行う。
		 */
		// プライベート・スコープのメソッドの呼び出し
		// 返り値なし
		privateMethod();
		// パッケージ・スコープのメソッドの呼び出し
		// 返り値なし
		packagedMethod();
		// プロテクテッド・スコープのメソッドの呼び出し
		// 返り値は整数型
		int number = protectedMethod();
		// パブリック・スコープのメソッドの呼び出し
		// 返り値は文字列型
		String mojiretu = publicMethod();

		// 返り値を表示する
		System.out.println(mojiretu + number);

		System.out.println("staticのついたフィールド" + staticField);

		// staticがついていないメソッド・フィールド変数はクラスをnewしてから使用する
		AccessSample main = new AccessSample();
		System.out.println("プライベートはクラスの中のみ" + main.privateFileld);
		System.out.println("パッケージ、クラスの中のみ" + main.packagedField);
		System.out.println("プロテクテッドはクラスの中、パッケージ、継承関係のあるクラスのみ" + main.protectedFileld);
		System.out.println("パブリックは、どこからでも" + main.publicField);
	}
}
