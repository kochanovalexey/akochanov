package ru.job4j.convertlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Класс.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class ConvertList {
    /**
     * Метод добавляет все элементы массива в List.
     * @param array - двумерный массив.
     * @return заполненный List.
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] elementArray : array) {
            for (int value : elementArray) {
                list.add(value);
            }
        }
        return list;
    }

    /**
     * Добавляет в двумерный массив все элементы List.
     * @param list коллекция List.
     * @param rows число строк.
     * @return двумерный массив.
     */
    public int[][] toArray(List<Integer> list, int rows) {
        int cols;
        while(list.remove(null));
        if (list.size() % rows == 0) {
            cols = list.size() / rows;
        } else {
            cols = list.size() / rows + 1;
        }
        int[][] array = new int[rows][cols];
        int indexRows = 0;
        int indexCols = 0;
        for (int value : list) {
            array[indexRows][indexCols++] = value;
            if (indexCols == cols) {
                indexRows++;
                indexCols = 0;
            }
        }
        return array;
    }
}
