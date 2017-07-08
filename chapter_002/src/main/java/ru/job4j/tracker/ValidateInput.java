package ru.job4j.tracker;

/**
 * Class Класс проверяющий пользовательский ввод.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class ValidateInput extends ConsoleInput {
    /**
     * Метод ask.
     * @param question - вопрос.
     * @param range - диапозон допустимых значений.
     * @return - возращает валидный номер.
     */
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again. ");
            } catch (MenuOutException moe) {
                System.out.println("Please select key from menu. ");
            }
        } while (invalid);
        return value;
    }
}
