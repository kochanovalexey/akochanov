package ru.job4j.convertlist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class Класс тестирущий ConvertList.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class ConvertListTest {
    /**
     * Test whenConvertArrayToList.
     */
    @Test
    public void whenConvertArrayToList() {
        ConvertList convertList = new ConvertList();
        List<Integer> expected = new ArrayList<>();
        for (int i = 1; i < 9; i++) {
            expected.add(i);
        }
        List<Integer> result = convertList.toList(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}});
        assertThat(result, is(expected));
    }

    /**
     * Test whenConvertListToArray.
     */
    @Test
    public void whenConvertListToArray() {
        ConvertList convertList = new ConvertList();
        int[][] expected = {{1, 2, 3}, {4, 5, 6}, {7, 0, 0}};
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 8; i++) {
            list.add(i);
        }
        int[][] result = convertList.toArray(list, 3);
        assertThat(result, is(expected));
    }
}
