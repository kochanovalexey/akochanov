package ru.job4j.sortuser;

import org.junit.Test;
import ru.job4j.userconvert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

import java.util.List;
import java.util.TreeSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Class Класс.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class SortUserTest {
    @Test
    public void whenSortToAgeUser() {
        SortUser sortUser = new SortUser();
        List<User> list = new ArrayList<>();
        list.add(new User("Harry", 23));
        list.add(new User("John", 79));
        list.add(new User("Stacy", 44));
        list.add(new User("Nik", 11));
        list.add(new User("Stive", 63));
        Set<User> result = sortUser.sort(list);
        int[] truePosition = {3, 0, 2, 4, 1};
        int i = 0;
        for (User userResult : result) {
            assertThat(userResult, is(list.get(truePosition[i++])));
        }
    }
}
