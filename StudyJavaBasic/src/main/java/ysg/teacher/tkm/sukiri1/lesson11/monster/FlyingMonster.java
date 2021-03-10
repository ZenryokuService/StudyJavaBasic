package ysg.teacher.tkm.sukiri1.lesson11.monster;

public abstract class FlyingMonster extends Monster {

	public FlyingMonster(String name, int hp, int mp) {
		super(name, hp, mp);
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(super.name + "はバサバサ飛んで逃げ出した");

	}

}
