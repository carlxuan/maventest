package carlxuan.share.object;

import sun.misc.*;
import java.lang.reflect.Field;

public class UnsafeUtility {
	@SuppressWarnings("restriction")
	public static @Nullable Unsafe getUnsafe() {
		Unsafe unsafe = null;
		try {
			Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
			theUnsafe.setAccessible(true);
			unsafe =  (Unsafe) theUnsafe.get(null);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException  e) {
			e.printStackTrace();
		}
		return unsafe;
	}
}
