package ru.job4j.tracker;

/**
 * Class Класс.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class StartUI {
    public static void main(String[] args) {
        String[] allQuestion = {"0. Add new Item", "1. Show all items", "2. Edit item", "3. Delete item", "4. Find item by Id", "5. Find items by name", "6. Exit Program"};
        for(String question : allQuestion) {
            System.out.println(question);
        }
        ConsoleInput input = new ConsoleInput();
    }
}
