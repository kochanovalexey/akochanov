package ru.job4j.userconvert;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class Класс test.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class UserConvertTest {
    /**
     * Test whenConvertListUserToMap.
     */
    @Test
    public void whenConvertListUserToMap() {
        UserConvert userConvert = new UserConvert();
        List<User> list = new ArrayList<>();
        User firstUser = new User(1, "Igor", "LA");
        User secondUser = new User(2, "John", "NY");
        User thirdUser = new User(3, "Kate", "Bren");
        list.add(firstUser);
        list.add(secondUser);
        list.add(thirdUser);
        HashMap<Integer, User> result = userConvert.process(list);
        HashMap<Integer, User> expected = new HashMap<>();
        expected.put(firstUser.getId(), firstUser);
        expected.put(secondUser.getId(), secondUser);
        expected.put(thirdUser.getId(), thirdUser);
        assertThat(result, is(expected));
    }
}
