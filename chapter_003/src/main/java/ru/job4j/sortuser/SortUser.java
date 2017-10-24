package ru.job4j.sortuser;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Class Класс.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class SortUser {
    /**
     * Метод сортирует List пользователей по возрастанию возраста.
     * @param list - список пользователей.
     * @return - отсортированный список пользователей.
     */
    public Set<User> sort(List<User> list) {
        Set<User> set = new TreeSet();
        for (User user : list) {
            set.add(user);
        }
        return set;
    }
}
