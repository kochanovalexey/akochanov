package ru.job4j.profession;

/**
 * Class Класс, описывающий текущую работу.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Work {
    /**
     * Название работы.
     */
    private String name;

    /**
     * Коструктор.
     * @param name - название работы.
     */
    public Work(String name) {
        this.name = name;
    }

    /**
     * Метод геттер.
     * @return - возращает name.
     */
    public String getName() {
        return name;
    }
}
