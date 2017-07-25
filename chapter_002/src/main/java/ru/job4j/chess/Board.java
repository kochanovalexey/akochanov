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
     * Метод выполняет проверку на ошибки и если ошибок не выявлено перемещает фигуру в заданную позицию.
     * @param source - исходное положение фигуры.
     * @param dist - позиция, куда фигура должна переместиться.
     * @return - возращает boolean значение.
     * @throws ImpossibleMoveException - исключение в случае, если фигура не может двигаться в заданную позицию.
     * @throws OccupiedWayException - исключение в случае, если путь занят другими фигурами.
     * @throws FigureNotFoundException - исключение в случае, если фигура не найдена.
     */
    boolean move(Cell source, Cell dist) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {
        boolean invalid = false;
        int index = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].occupaid(source)) {
                invalid = true;
                index = i;
                break;
            }
        }
        if (!invalid) {
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
                    invalid = false;
                    break;
                }
            }
        }
        if (invalid) {
            figures[index] = figures[index].cloneFigure(dist);
        } else {
            throw  new OccupiedWayException("Occupied Way");
        }
        return invalid;
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
            System.out.println(" " + figure.getPosition().getHorizontalCell() + ":" + figure.getPosition().getVerticalCell());
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
            Cell position = getPosition();
            if (Math.abs(position.getHorizontalCell() - dist.getHorizontalCell()) == Math.abs(position.getVerticalCell() - dist.getVerticalCell()) && dist.getVerticalCell() > 0 && dist.getVerticalCell() < 9 && dist.getHorizontalCell() > 0 && dist.getHorizontalCell() < 9) {
                Cell[] way = new Cell[Math.abs(position.getHorizontalCell() - dist.getHorizontalCell())];
                int index = 0;
                if (position.getHorizontalCell() < dist.getHorizontalCell() && position.getVerticalCell() < dist.getVerticalCell()) {
                    for (int i = position.getHorizontalCell() + 1; i < dist.getHorizontalCell() + 1; i++) {
                        for (int j = position.getVerticalCell() + 1; j < dist.getVerticalCell() + 1; j++) {
                            way[index] = new Cell(i, j);
                        }
                    }
                    return way;
                } else if (position.getHorizontalCell() > dist.getHorizontalCell() && position.getVerticalCell() < dist.getVerticalCell()) {
                    for (int i = position.getHorizontalCell() - 1; i < dist.getHorizontalCell() - 1; i--) {
                        for (int j = position.getVerticalCell() + 1; j < dist.getVerticalCell() + 1; j++) {
                            way[index] = new Cell(i, j);
                        }
                    }
                    return way;
                } else if (position.getHorizontalCell() < dist.getHorizontalCell() && position.getVerticalCell() > dist.getVerticalCell()) {
                    for (int i = position.getHorizontalCell() + 1; i < dist.getHorizontalCell() + 1; i++) {
                        for (int j = position.getVerticalCell() - 1; j < dist.getVerticalCell() - 1; j--) {
                            way[index] = new Cell(i, j);
                        }
                    }
                    return way;
                } else {
                    for (int i = position.getHorizontalCell() - 1; i < dist.getHorizontalCell() - 1; i--) {
                        for (int j = position.getVerticalCell() - 1; j < dist.getVerticalCell() - 1; j--) {
                            way[index] = new Cell(i, j);
                        }
                    }
                    return way;
                }
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
