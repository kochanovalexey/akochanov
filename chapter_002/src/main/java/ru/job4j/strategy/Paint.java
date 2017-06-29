package ru.job4j.strategy;

/**
 * Class Класс Paint.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Paint {
    /**
     * Метод Paint.
     * @param shape - shape.
     */
    public void draw(Shape shape) {
        System.out.print(shape.pic());
    }
}
