package ru.job4j.chess;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class Класс тестовый.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class BoardTest {
    /**
     * Test whenUserSelectPositionWithoutFigure.
     */
    @Test(expected = FigureNotFoundException.class)
    public void whenUserSelectPositionWithoutFigure() {
        Board board = new Board();
        board.fillBoard();
        board.move(new Cell(0, 0), new Cell(3, 1));
    }

    /**
     * Test whenUserSelectPositionWhereTheFigureCanNotGo.
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenUserSelectPositionWhereTheFigureCanNotGo() {
        Board board = new Board();
        board.fillBoard();
        board.move(new Cell(2, 0), new Cell(2, 1));
    }

    /**
     * Test whenUserToMakeABishop.
     */
    @Test
    public void whenUserToMakeMoveABishop() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Board board = new Board();
        board.fillBoard();
        board.move(new Cell(2, 0), new Cell(3, 1));
        board.showPositionAllFigure();
        String expected = String.format("Bishop" + System.lineSeparator() + " 3:1" + System.lineSeparator() + "Bishop" + System.lineSeparator() + " 5:0" + System.lineSeparator());
        assertThat(out.toString(), is(expected));
    }
}
