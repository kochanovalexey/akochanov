package ru.job4j.tracker;

/**
 * Class Класс.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class MenuOutException extends RuntimeException {
    /**
     * Конструктор класса.
     * @param msg - сообщение.
     */
    public MenuOutException(String msg) {
        super(msg);
    }
}
