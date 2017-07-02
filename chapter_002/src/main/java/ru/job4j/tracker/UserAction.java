package ru.job4j.tracker;

/**
 * Interface Интерфейс UserAction.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public interface UserAction {
    /**
     * Метод key.
     * @return - int value.
     */
    int key();

    /**
     * Метод execute.
     * @param input - input.
     * @param tracker - tracker.
     */
    void execute(Input input, Tracker tracker);

    /**
     * Метод info.
     * @return - String value.
     */
    String info();
}
