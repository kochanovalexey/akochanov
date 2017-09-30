package ru.job4j.automat;

import java.util.Arrays;

/**
 * Class Класс.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Automat {
    /**
     * Ячейки с монетами.
     */
    private Cell[] cells = new Cell[4];

    /**
     * Заполнить ячейки.
     */
    public void fillCells() {
        cells[0] = new Cell(new Coins("1 рубль", 1), 0);
        cells[1] = new Cell(new Coins("2 рубля", 2), 0);
        cells[2] = new Cell(new Coins("5 рублей", 5), 0);
        cells[3] = new Cell(new Coins("10 рублей", 10), 0);
    }

    /**
     * Пополнить монеты.
     * @param nameCoin - название монеты.
     * @param quantity - количество.
     */
    public void refuelCoins(String nameCoin, int quantity) {
        for (Cell cell : cells) {
            if (cell.getCoin().getName().equals(nameCoin)) {
                cell.setQuantity(quantity);
            }
        }
    }

    /**
     * Получить сдачу.
     * @param note - купюра.
     * @param price - цена.
     * @return - массив монет.
     */
    public Coins[] giveChange(int note, int price) {
        Coins[] change = new Coins[100];
        int indexChange = 0;
        int balance = note - price;
        for (int i = this.cells.length - 1; i > -1; i--) {
            int sumCoins = balance / cells[i].getCoin().getValue();
            if (sumCoins > 0) {
                if (sumCoins > cells[i].getQuantity()) {
                    fillCoinsChange(change, indexChange, cells[i].getCoin(), cells[i].getQuantity());
                    balance = balance - cells[i].getCoin().getValue() * cells[i].getQuantity();
                    indexChange = indexChange + cells[i].getQuantity();
                } else {
                    fillCoinsChange(change, indexChange, cells[i].getCoin(), sumCoins);
                    balance = balance - cells[i].getCoin().getValue() * sumCoins;
                    indexChange = indexChange + sumCoins;
                }
            }
        }
        return Arrays.copyOf(change, indexChange);
    }

    /**
     * Заполнить массив со сдачей, определенной монетой.
     * @param change - массив со сдачей.
     * @param index - текущия индекс массива.
     * @param coin - монета.
     * @param quantity - количество.
     */
    public void fillCoinsChange(Coins[] change, int index, Coins coin, int quantity) {
        for (int i = index; i < index + quantity; i++) {
            change[i] = coin;
        }
    }

    /**
     * Получить ячейки.
     * @return - массив ячеек.
     */
    public Cell[] getCells() {
        return cells;
    }
}
