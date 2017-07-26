package ru.job4j.chess;

/**
 * Class Класс доски.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Board {
    /**
     * Массив фигур.
     */
    private Figure[] figures = new Figure[2];
    /**
     * Фигура не найдена.
     */
    private static final int NOT_FOUND_FIGURE = -1;

    /**
     * Метод выполняет проверку на ошибки и если ошибок не выявлено перемещает фигуру в заданную позицию.
     * @param source - исходное положение фигуры.
     * @param dist - позиция, куда фигура должна переместиться.
     * @return - возращает boolean значение.
     * @throws ImpossibleMoveException - исключение в случае, если фигура не может двигаться в заданную позицию.
     * @throws OccupiedWayException - исключение в случае, если путь занят другими фигурами.
     * @throws FigureNotFoundException - исключение в случае, если фигура не найдена.
     */
    boolean move(Cell source, Cell dist) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        boolean invalid = true;

        int index = findIndexByCell(source);
        if (index == NOT_FOUND_FIGURE) {
            throw new FigureNotFoundException("Figure not found");
        }
        Cell[] way = new Cell[0];
        try {
            way = figures[index].way(dist);
        } catch (ImpossibleMoveException ime) {
            throw new ImpossibleMoveException("The figure can not so walk");
        }
        for (int i = 0; i < way.length; i++) {
            for (Figure figure : figures) {
                if (figure.occupaid(way[i])) {
                    throw  new OccupiedWayException("Occupied Way");
                }
            }
        }
        figures[index] = figures[index].cloneFigure(dist);
        return invalid;
    }

    /**
     * Находит индекс фигуры по Cell.
     * @param source - исходное положение фигуры.
     * @return - возращает индекс фигуры.
     */
    int findIndexByCell(Cell source) {
        int index = NOT_FOUND_FIGURE;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].occupaid(source)) {
                index = i;
                break;
            }
        }
        return index;
    }
    /**
     * Метод заполняет массив figures фигурами.
     */
    public void fillBoard() {
        this.figures[0] = new Bishop(new Cell(2, 0));
        this.figures[1] = new Bishop(new Cell(5, 0));
    }

    /**
     * Метод показывает все фигуры и их позиции.
     */
    public void showPositionAllFigure() {
        for (Figure figure : figures) {
            figure.echoName();
            System.out.println(String.format(" " + figure.getPosition().getHorizontalCell() + ":" + figure.getPosition().getVerticalCell()));
        }
    }

    /**
     * Класс описывает фигуру слона.
     */
    private class Bishop extends Figure {
        /**
         * Конструктор класса.
         * @param dist - позиция фигуры.
         */
        Bishop(Cell dist) {
            super(dist, "Bishop");
        }

        /**
         * Метод реализовывает движение фигуры.
         * @param dist - позиция куда фигура должна переместиться.
         * @return - возращает массив, содержащий все позиции, которые пройдет фигура.
         * @throws ImpossibleMoveException - исключение в случае, если фигура не может двигаться в заданную позицию.
         */
        @Override
        Cell[] way(Cell dist) throws ImpossibleMoveException {
            int verticalPosition = getPosition().getVerticalCell();
            int horizontalPosition = getPosition().getHorizontalCell();
            if (Math.abs(horizontalPosition - dist.getHorizontalCell()) == Math.abs(verticalPosition - dist.getVerticalCell()) && checkCellNotWayOutOfTheChessBoard(dist)) {
                int index = Math.abs(horizontalPosition - dist.getHorizontalCell());
                Cell[] way = new Cell[index];
                for (int i = 0; i < index; i++) {
                    way[i] = new Cell(dist.getHorizontalCell() > horizontalPosition ? ++horizontalPosition : --horizontalPosition, dist.getVerticalCell() > verticalPosition ? ++verticalPosition : --verticalPosition);
                }
                return way;
            }
            throw new ImpossibleMoveException("The figure can not so walk");
        }

        /**
         * Метод клонирует фигуру.
         * @param dist - позиция куда должна переместиться фигура.
         * @return - возращает фигуру с новой позицией.
         */
        @Override
        public Bishop cloneFigure(Cell dist) {
            return new Bishop(dist);
        }
    }
}
