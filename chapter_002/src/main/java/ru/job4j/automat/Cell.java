package ru.job4j.automat;

/**
 * Class Класс.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Cell {
    /**
     * Монета.
     */
    private Coins coin;

    /**
     * Количество.
     */
    private int quantity;

    /**
     * Конструктор класса.
     * @param coin - монета.
     * @param quantity - количество.
     */
    Cell(Coins coin, int quantity) {
        this.coin = coin;
        this.quantity = quantity;
    }

    /**
     * Сеттер quantity.
     * @param quantity - количество.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Геттер coin.
     * @return - coin.
     */
    public Coins getCoin() {
        return this.coin;
    }

    /**
     * Геттер quantity.
     * @return - quantity.
     */
    public int getQuantity() {
        return this.quantity;
    }
}
