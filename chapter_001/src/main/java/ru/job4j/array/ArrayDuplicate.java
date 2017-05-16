package ru.job4j.array;

import java.util.Arrays;

/**
 * Class Класс, удалющий дубликаты в массиве.
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
*/
public class ArrayDuplicate {
	/**
	 * rotate Метод, удалющий дубликаты в массиве.
	 * @param array - входящий массив.
	 * @return - возращает, массив без дупликатов.
	*/
	public String[] remove(String[] array) {
		int sumNoDuplicateString = array.length;
		int count = 0;
		for (int i = 0; i < array.length - 2; i++) {
			for (int j = i + 1; j < array.length - count; j++) {
				if (array[i].equals(array[j])) {
					count += 1;
					sumNoDuplicateString -= 1;
					for (int k = j; k < array.length - 1; k++) {
						String helper = "";
						array[k] = helper;
						array[k] = array[k + 1];
						array[k + 1] = helper;
					}
				}
			}
		}
		return Arrays.copyOf(array, sumNoDuplicateString);
	}
}