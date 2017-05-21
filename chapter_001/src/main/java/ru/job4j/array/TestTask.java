package ru.job4j.array;

/**
 * Class Класс, записывающий два отсортированных массива в один с сортировкой.
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
*/

public class TestTask {
	/**
	 * copyTwoArrayToOne Метод, записывающий два отсортированных массива в один с сортировкой.
	 * @param firstArray - первый массив.
	 * @param secondArray - второй массив.
	 * @return - возращает результат метода.
	*/
	public int[] copyTwoArrayToOne(int[] firstArray, int[] secondArray) {
		int[] resultArray = new int[firstArray.length + secondArray.length];
		int firstIndex = 0;
		int secondIndex = 0;
		for (int i = 0; i < resultArray.length; i++) {
			if (firstIndex >= firstArray.length) {
				resultArray[i] = secondArray[secondIndex];
				secondIndex += 1;
			} else if (secondIndex >= secondArray.length) {
				resultArray[i] = firstArray[firstIndex];
				firstIndex += 1;
			} else if (firstArray[firstIndex] < secondArray[secondIndex]) {
				resultArray[i] = firstArray[firstIndex];
				firstIndex += 1;
			} else {
				resultArray[i] = secondArray[secondIndex];
				secondIndex += 1;
			}
		}
		return resultArray;
	}
}