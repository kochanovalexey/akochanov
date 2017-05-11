package ru.job4j.loop;

/**
 * Class Класс рисующий шахматную доску.
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
*/
public class Board {
	/**
	 * paint Метод рисующий шахматную доску.
	 * @param width - ширина шахматной доски.
	 * @param height - высота шахматной доски.
	 * @return - строка содержащая шахматную доску.
	*/
	public String paint(int width, int height) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if ((i + j) % 2 == 0) {
					builder.append("x");
				} else {
					builder.append(" ");
				}
			}
			builder.append("\r\n");
		}
		return builder.toString();
	}
}