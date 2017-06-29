package ru.job4j.strategy;

/**
 * Class Класс Triangle.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Triangle implements Shape {
    @Override
    public String pic() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i * 2 + 1; j++) {
                sb.append("O");
            }
            sb.append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }
}
