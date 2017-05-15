package ru.job4j.array;

/**
 * Class Класс, переворачивающий массив задом на перед.
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
*/
public class Turn {
	/**
	 * back Метод, который переворачивает массив задом наперед.
	 * @param array - входящий массив.
	 * @return - возращает перевернутый массив.
	*/
	public int[] back(int[] array) {
		int help = 0;
		for (int i = 0; i < array.length / 2; i++) {
			help = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = help;
		}
		return array;
	}
}