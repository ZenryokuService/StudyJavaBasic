package ysg.teacher.tkm.frw;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;


public class SuperMain {
	/** デバック時にtrue */
	private static final boolean isDebug = true;
	/** CommandIFを実装したクラスを保持 */
	private Map<String, Class<CommandIF>> clsMap;

	/** コンストラクタ */
	public SuperMain() {
		if (isDebug) System.out.println(getClass().getName() + "起動");

		clsMap = new HashMap<String, Class<CommandIF>>();
		// プロパティファイルを読み込み、起動するクラスをロードする
		String path = "mains.properties";
		loadProperties(path);
	}

	/** クラスオブジェクトが解放されるときに動く */
	public void finalize() {
		if (isDebug) System.out.println("メモリの開放");
		this.clsMap = null;
	}

	/** フィールド変数propを返却する */
	public Map<String, Class<CommandIF>> getProp() {
		return this.clsMap;
	}

	private void loadProperties(String fileName) {
		Properties prop = new Properties();
		try {
			Path path = Paths.get("src/main/resources", fileName);

			if (isDebug) System.out.println("Path: " + path.getParent().toString() + "\\" + fileName);

			BufferedReader buf = Files.newBufferedReader(path);
			prop.load(buf);
		} catch (IOException ie) {
			System.out.println(fileName + "の読み込み時にエラーがありました。");
			ie.printStackTrace();
			System.exit(-1);
		}
		if (isDebug) System.out.println("propLength: " + prop.size());

		prop.keySet().stream().forEach(key-> {
			if (isDebug) System.out.println("key: " + key);
			// key = 実行クラスの番号
			String className = prop.getProperty(key.toString());
			try {
				Class<CommandIF> klass = (Class<CommandIF>) Class.forName(className);
				clsMap.put(key.toString(), klass);
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(-1);
			}
		});

		if (clsMap.size() == 0) {
			System.out.println("プロパティファイルにクラスが登録されていません。");
			System.exit(-1);
		}
 	}

	/**
	 * プロパティファイルから実行するクラスを取得して実行する。
	 *
	 * @param args プログラム引数
	 */
	public static void main(String[] args) {
		// このクラスをインスタンス化
		SuperMain main = new SuperMain();
		// コンストラクタで作成したPropertiesクラスを取得
		Map<String, Class<CommandIF>> clsMap = main.getProp();

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("どのプログラムを実行しますか？ ※終了は\"bye\"と入力");
			String input = scan.nextLine();

			if ("bye".equals(input)) {
				break;
			}

			if (input.matches("[0-9]") == false) {
				System.out.println("0-9の間で入力してください。");
				continue;
			}
			// 起動するクラスを取得
			Class<CommandIF> cls = clsMap.get(input);

			System.out.println("次のクラスを実行します： " + cls.getName());
			try {
				CommandIF cmd = cls.newInstance();
				cmd.execute();
			} catch (InstantiationException e) {
				e.printStackTrace();
				System.exit(-1);
			} catch (IllegalAccessException ae) {
				ae.printStackTrace();
				System.exit(-1);
			}
		}
	}


}
