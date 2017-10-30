package ru.job4j.sortuser;

import java.util.Comparator;
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

    /**
     * Метод сортирующий List User по возрастанию длины имени.
     * @param userList - список User.
     * @return - осротированый список User.
     */
    public List<User> sortNameLength(List<User> userList) {
        userList.sort(
                new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {
                        if (o1.getName().length() > o2.getName().length()) {
                            return 1;
                        } else if (o1.getName().length() < o2.getName().length()) {
                            return -1;
                        } else {
                            return 0;
                        }
                    }
                }
        );
        return userList;
    }
    /**
     * Метод сортирующий List User по двум полям:
     * 1.возрастанию длины имени,
     * 2. возрастание возраста.
     * @param userList - список User.
     * @return - осротированый список User.
     */
    public List<User> sortByAllField(List<User> userList) {
        userList.sort(
                new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {
                        if (o1.getName().length() > o2.getName().length()) {
                            return 1;
                        } else if (o1.getName().length() < o2.getName().length()) {
                            return -1;
                        } else {
                            return o1.compareTo(o2);
                        }
                    }
                }
        );
        return userList;
    }
}
