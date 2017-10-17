package ru.job4j.userconvert;

import java.util.HashMap;
import java.util.List;

/**
 * Class Класс.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class UserConvert {
    /**
     * Преобразует List в Map.
     * @param list входящий List.
     * @return сконвертированый Map.
     */
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> hashMap = new HashMap<>();
        for (User user : list) {
            hashMap.put(user.getId(), user);
        }
        return hashMap;
    }
}
