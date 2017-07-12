package ru.job4j.tracker;

/**
 * Class Класс BaseAction абстрактный.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
abstract class BaseAction implements UserAction {
    /**
     *  Ключ.
     */
    private int key;
    /**
     * Название пункта меню.
     */
    private String name;
    /**
     * Конструктор класса.
     * @param name - название пункта меню.
     * @param key - ключ.
     */
    BaseAction(String name, int key) {
        this.key = key;
        this.name = name;
    }
    /**
     * Метод инфо.
     * @return - возращает строку с ключом и названием пункта меню.
     */
    public String info() {
        return String.format("%s. %s", this.key, this.name);
    }
}
