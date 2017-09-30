package ru.job4j.automat;

/**
 * Class Класс.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Coins {
    /**
     * Название монеты.
     */
    private String name;

    /**
     * Величина монеты.
     */
    private int value;

    /**
     * Коструктор класса.
     * @param name - название монеты.
     * @param value - величина монеты.
     */
    Coins(String name, int value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Геттер name.
     * @return - name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Геттер value.
     * @return - value.
     */
    public int getValue() {
        return this.value;
    }

}
