package ysg.teacher.tkm.sukiri1.lesson11.monster;

public abstract class WalkingMonster extends Monster{

	public WalkingMonster(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void run() {
		System.out.println(name + "はトコトコ走って逃げた");
	}
}
