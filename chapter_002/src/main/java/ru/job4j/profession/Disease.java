package ru.job4j.profession;

/**
 * Class Класс, описывающий болезнь.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Disease {
    /**
     * Название болезни.
     */
    private String name;

    /**
     * Конструктор класса.
     * @param name - название болезни.
     */
    public Disease(String name) {
        this.name = name;
    }

    /**
     *
     * @return возращает название болезни.
     */
    public String getName() {
        return name;
    }
}
