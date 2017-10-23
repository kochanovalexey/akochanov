package ru.job4j.tracker;

import java.util.List;

/**
 * Class Класс.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class StubInput implements Input {
    /**
     * Массив answerOnQuestion.
     */
    private List<String> answerOnQuestion;
    /**
     * Массив answerItemMenu.
     */
    private List<Integer> answerItemMenu;
    /**
     * Позиция в массиве answerOnQuestion.
     */
    private int positionAnswerOnQuestion;
    /**
     * Позиция в массиве positionAnswerItemMenu.
     */
    private int positionAnswerItemMenu;

    /**
     * Конструктор класса.
     * @param answerOnQuestion - answer on question.
     * @param answerItemMenu - answer item menu.
     */
    public StubInput(List<String> answerOnQuestion, List<Integer> answerItemMenu) {
        this.answerOnQuestion = answerOnQuestion;
        this.answerItemMenu = answerItemMenu;
    }
    @Override
    public String ask(String question) {
        return answerOnQuestion.get(positionAnswerOnQuestion++);
    }
    @Override
    public int ask(String question, List<Integer> range) {
        int value = answerItemMenu.get(positionAnswerItemMenu++);
        for (int item : range) {
            if (item == value) {
                return value;
            }
        }
        throw new MenuOutException("Out of menu range. ");
    }
}
