package ru.job4j.chess;

/**
 * Class Класс описывающий позици фигур.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Cell {
    /**
     * Горизонтальная позиция.
     */
    private int horizontalCell;
    /**
     * Вертикальная позиция.
     */
    private int verticalCell;

    /**
     * Конструктор класса.
     * @param horizontalCell - горизонтальная позиция.
     * @param verticalCell - вертикальная позиция.
     */
    public Cell(int horizontalCell, int verticalCell) {
        this.horizontalCell = horizontalCell;
        this.verticalCell = verticalCell;
    }

    /**
     * Сеттер поля horizontalCell.
     * @param horizontalCell - горизонтальная позиция.
     */
    public void setHorizontalCell(int horizontalCell) {
        this.horizontalCell = horizontalCell;
    }

    /**
     * Геттер поля horizontalCell.
     * @return - возращает horizontalCell.
     */
    public int getHorizontalCell() {
        return horizontalCell;
    }

    /**
     * Сеттер поля verticalCell.
     * @param verticalCell - вертикальная позиция.
     */
    public void setVerticalCell(int verticalCell) {
        this.verticalCell = verticalCell;
    }

    /**
     * Геттер поля verticalCell.
     * @return - возращает verticalCell.
     */
    public int getVerticalCell() {
        return verticalCell;
    }
}
