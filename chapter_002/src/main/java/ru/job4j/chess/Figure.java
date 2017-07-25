package ru.job4j.chess;

/**
 * Class Абстрактный класс фигур.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
abstract class Figure {
    /**
     * Позиция фигуры.
     */
    private final Cell position;
    /**
     * Имя фигуры.
     */
    private String name;

    /**
     * Конструктор класса.
     * @param position - позиция фигуры.
     * @param name - имя фигуры.
     */
    Figure(Cell position, String name) {
        this.position = position;
        this.name = name;
    }

    /**
     * Сообщает имя фигуры.
     */
    public void echoName() {
        System.out.println(name);
    }

    /**
     * Абстрактный метод, который будет описывать логику движения фигуры.
     * @param dist - позиция фигуры.
     * @return - возращает массив, содержащий все позиции, которые пройдет фигура.
     * @throws ImpossibleMoveException - исключение в случае, если фигура не может двигаться в заданную позицию.
     */
    abstract Cell[] way(Cell dist) throws ImpossibleMoveException;

    /**
     * Абстрактный метод клонирует фигуру.
     * @param dist - позиция куда должна переместиться фигура.
     * @return - возращает фигуру с новой позицией.
     */
    abstract Figure cloneFigure(Cell dist);

    /**
     * Метод проверяет совпадает точка с заданной.
     * @param position - позиция.
     * @return - возращает boolean результат.
     */
    public boolean occupaid(Cell position) {
        return this.position.getVerticalCell() == position.getVerticalCell() && this.position.getHorizontalCell() == position.getHorizontalCell();
    }

    /**
     * Геттер поля position.
     * @return - position.
     */
    public Cell getPosition() {
        return this.position;
    }
}
