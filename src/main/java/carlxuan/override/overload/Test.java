package carlxuan.override.overload;

import carlxuan.share.object.Child;
import carlxuan.share.object.Parent;

public class Test {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		Parent pc = new Child();
		B a = new B();
		a.say(p);
		a.say(c);
		a.say(pc);
	}

}
