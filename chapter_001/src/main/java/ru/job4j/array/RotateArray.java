package ru.job4j.array;

/**
 * Class Класс, поворачивающий двумерный массив по часовой стрелке.
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
*/
public class RotateArray {
	/**
	 * rotate Метод, поворачивающий двумерный массив по часовой стрелке.
	 * @param array - входящий массив.
	 * @return - возращает, перевернутый массив.
	*/
	public int[][] rotate(int[][] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i * 2; j++) {
				int helperX = array[i + j][array.length - 1 - i];
				array[i + j][array.length - 1 - i] = array[i][i + j];
				int helperY = array[array.length - 1 - i][array.length - 1 - j - i];
				array[array.length - 1 - i][array.length - 1 - j - i] = helperX;
				helperX = array[array.length - 1 - j - i][i];
				array[array.length - 1 - j - i][i] = helperY;
				array[i][i + j] = helperX;
			}
		}
		return array;
	}
}