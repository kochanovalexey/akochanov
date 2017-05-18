package ru.job4j;

/**
 * Class Класс, проверяющий, что одна строка является подстрокой другой строки.
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
*/

public class TestTask {
	/**
	 * contains Метод, проверяющий, что одна строка является подстрокой другой строки.
	 * @param origin - строка.
	 * @param sub - подстрока.
	 * @return - возращает результат метода.
	*/
	public boolean contains(String origin, String sub) {
		char[] originCharArray = origin.toCharArray();
		char[] subCharArray = sub.toCharArray();
		int counter = 0;
		for (int i = 0; i + counter < originCharArray.length; i++) {
			if (originCharArray[i] == subCharArray[0]) {
				for (int j = 1; j < subCharArray.length; j++) {
					counter += 1;
					if (subCharArray[j] != originCharArray[i + j]) {
						break;
					} else if (j == subCharArray.length - 1) {
						return true;
					}
				}
			}
		}
		return false;
	}
}