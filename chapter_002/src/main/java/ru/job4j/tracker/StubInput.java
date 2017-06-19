package ru.job4j.tracker;

/**
 * Class Класс.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class StubInput implements Input {
    /**
     * Массив Answer.
     */
    private String[] answer;
    /**
     * Позиция.
     */
    private int position;

    /**
     * Конструктор класса.
     * @param answer - answer.
     */
    public StubInput(String[] answer) {
        this.answer = answer;
    }
    @Override
    public String ask(String question) {
        return answer[position++];
    }
}
