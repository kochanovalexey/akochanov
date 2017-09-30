package ru.job4j.automat;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class Класс.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class AutomatTest {
    /**
     *
     */
    @Test
    public void whenCustomerGetChange() {
        Automat automat = new Automat();
        automat.fillCells();
        automat.refuelCoins("1 рубль", 100);
        automat.refuelCoins("2 рубля", 100);
        automat.refuelCoins("5 рублей", 100);
        automat.refuelCoins("10 рублей", 100);
        Coins[] result = automat.giveChange(50, 31);
        Coins[] expected = new Coins[4];
        expected[0] = automat.getCells()[3].getCoin();
        expected[1] = automat.getCells()[2].getCoin();
        expected[2] = automat.getCells()[1].getCoin();
        expected[3] = automat.getCells()[1].getCoin();
        assertThat(result, is(expected));
    }
}
