package ru.job4j.array;

/**
 * Class Класс, cортирующий массив алгоритмом сортировки пузырек.
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
*/
public class BubbleSort {
	/**
	 * sort Метод, сортирующий массив алгоритмом сортировки пузырек.
	 * @param array - входящий массив.
	 * @return - возвращает отсортированный массив.
	*/
	public int[] sort(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					int helper = array[j];
					array[j] = array[j + 1];
					array[j + 1] = helper;
				}
			}
		}
		return array;
	}
}