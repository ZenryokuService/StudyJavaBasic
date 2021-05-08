package ysg.teacher.tkm.sukiri1.lesson8.mains;

import ysg.teacher.tkm.frw.CommandIF;
import ysg.teacher.tkm.sukiri1.lesson9.Sword;

public class Lesson9Impl implements CommandIF {

	@Override
	public void execute() {
		Sword sword = new Sword();
		sword.setName("炎の剣");
		sword.setDamage(20);

		// クラス名が重複するのでパッケージ名から実装する(完全クラス名)
		ysg.teacher.tkm.sukiri1.lesson9.Hero hero = new ysg.teacher.tkm.sukiri1.lesson9.Hero();
		hero.setSword(sword);

		System.out.println("現在の武器は" + hero.getSword().getName() + "です");

	}

}
