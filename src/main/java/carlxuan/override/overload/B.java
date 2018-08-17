package carlxuan.override.overload;

import carlxuan.share.object.Child;
import carlxuan.share.object.Parent;

public class B extends A{
	@Override
	public Child say(Parent p) {
		System.out.println("B Child say");
		return null;
	}
	
	public int say(Child p) {
		System.out.println("B int say");
		return 1;
	}
}
