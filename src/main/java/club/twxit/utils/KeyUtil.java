package club.twxit.utils;

import java.util.Random;
/**
 * 生成主键Key
 * @author Lenovo
 *
 */
public class KeyUtil {
	 public static synchronized String genUniqueKey() {
		 Random random = new Random();
		 Integer number = random.nextInt(900000) + 100000;
		 return System.currentTimeMillis() + String.valueOf(number);
		 
	 }
}
