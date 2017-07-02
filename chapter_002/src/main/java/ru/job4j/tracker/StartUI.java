package ru.job4j.tracker;

/**
 * Class Класс.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class StartUI {
    /**
     * Tracker.
     */
    private Tracker tracker;
    /**
     * Input.
     */
    private Input input;

    /**
     * Конструктор класса.
     * @param input - input.
     * @param tracker - tracker.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    /**
     * Вход в нашу программу.
     * @param args - массив строк.
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
    /**
     * Метод init.
     */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        do {
            menu.showMenu();
            int key = Integer.valueOf(input.ask("Select:"));
            menu.selectMenuItem(key);
        } while (!"y".equals(this.input.ask("Exit?(y):")));
    }
}
