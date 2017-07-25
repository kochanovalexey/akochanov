package ru.job4j.chess;

/**
 * Class Класс исключения, когда фигура не найдена.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class FigureNotFoundException extends RuntimeException {
    /**
     * Конструктор класса.
     * @param msg - сообщение.
     */
    FigureNotFoundException(String msg) {
        super(msg);
    }
}
