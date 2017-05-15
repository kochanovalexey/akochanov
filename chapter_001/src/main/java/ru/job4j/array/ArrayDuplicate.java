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
		for (int i = 0; i < array.length - 2; i++) {
			if (array[i] == "") {
				continue;
			}
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].equals(array[j])) {
					array[j] = "";
					sumNoDuplicateString -= 1;
				}
			}
		}
		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j].equals("")) {
					array[j] = array[j + 1];
					array[j + 1] = "";
				}
			}
		}
		return Arrays.copyOf(array, sumNoDuplicateString);
	}
}