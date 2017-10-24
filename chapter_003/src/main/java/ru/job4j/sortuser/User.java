package ru.job4j.sortuser;
import java.util.TreeSet;

/**
 * Class Класс.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public  class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User user) {
        if (this.age > user.getAge()) {
            return 1;
        } else if (this.age < user.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
