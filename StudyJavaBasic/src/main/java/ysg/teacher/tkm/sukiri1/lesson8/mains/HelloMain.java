package ysg.teacher.tkm.sukiri1.lesson8.mains;

import ysg.teacher.tkm.frw.CommandIF;

public class HelloMain implements CommandIF {

	@Override
	public void execute() {
		System.out.println("Hello CommandIF!");
	}

}
