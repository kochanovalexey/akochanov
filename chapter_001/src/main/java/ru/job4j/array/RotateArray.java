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
			int helperX = array[i][array.length - 1];
			array[i][array.length - 1] = array[0][i];
			int helperY = array[array.length - 1][array.length - 1 - i];
			array[array.length - 1][array.length - 1 - i] = helperX;
			helperX = array[array.length - 1 - i][0];
			array[array.length - 1 - i][0] = helperY;
			array[0][i] = helperX;
		}
		return array;
	}
}