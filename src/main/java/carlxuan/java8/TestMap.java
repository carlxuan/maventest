package carlxuan.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestMap {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		Function<String, String> f = new Function<String, String>() {
			@Override
			public String apply(String str) {
				return str+"x";
			}
		};
		
		List<String> updated = list.stream().map(f).collect(Collectors.toList());
		System.out.println(updated);
	}

}
