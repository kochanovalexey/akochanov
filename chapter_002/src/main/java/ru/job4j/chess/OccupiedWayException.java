package ru.job4j.chess;

/**
 * Class Класс исключения, когда путь занят другими фигурами.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class OccupiedWayException extends RuntimeException {
    /**
     * Конструктор класса.
     * @param msg - сообщение.
     */
    OccupiedWayException(String msg) {
        super(msg);
    }
}
