package ru.job4j.chess;

/**
 * Class Класс описывающий исключение, когда фигура не может двигаться до заданной позиции.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class ImpossibleMoveException extends RuntimeException {
    /**
     * Конструктор класса.
     * @param msg - сообщение.
     */
    ImpossibleMoveException(String msg) {
        super(msg);
    }
}
