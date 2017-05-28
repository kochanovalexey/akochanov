package ru.job4j.profession;

/**
 * Class Класс, описывающий оборудование.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Equipment {
    /**
     * Название оборудования.
     */
    private String name;

    /**
     * Коструктор класса.
     * @param name - название оборудования.
     */
    public Equipment(String name) {
        this.name = name;
    }

    /**
     * Метод геттер.
     * @return - возращает название оборудования.
     */
    public String getName() {
        return name;
    }
}
