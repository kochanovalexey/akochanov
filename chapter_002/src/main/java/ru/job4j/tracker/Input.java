package ru.job4j.tracker;

/**
 * Class Класс.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public interface Input {
    /**
     * Интерфейс Input.
     * @param question - вопрос.
     * @return - все что угодно.
     */
    String ask(String question);

    /**
     * Интерфейс Input.
     * @param question - вопрос.
     * @param range - диапазон значений.
     * @return - int значение.
     */
    int ask(String question, int[] range);
}
