package ru.job4j.loop;

/**
 * Class Класс рисующий пирамиду.
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
*/
public class Paint {
	/**
	 * piramid Метод рисующий пирамиду.
	 * @param h - высота пирамиды.
	 * @return - строка содержащая пирамиду.
	*/
	public String piramid(int h) {
		StringBuilder builder = new StringBuilder();
		for (int j = 0; j < h; j++) {
			for (int i = 0; i < 2 * j + 1; i++) {
				if (i + j == 0) {
					builder.append(" ^ ");
				} else {
					builder.append("^");
				}
			}
			builder.append(System.getProperty("line.separator"));
		}
		return builder.toString();
	}
}