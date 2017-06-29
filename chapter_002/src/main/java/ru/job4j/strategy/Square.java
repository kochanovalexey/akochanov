package ru.job4j.strategy;

/**
 * Class Класс Square.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Square extends Paint implements Shape {
    @Override
    public String pic() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sb.append("0 ");
            }
            sb.append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }
}
