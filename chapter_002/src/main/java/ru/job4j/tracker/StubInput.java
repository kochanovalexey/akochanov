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
     * Массив answerOnQuestion.
     */
    private String[] answerOnQuestion;
    /**
     * Массив answerItemMenu.
     */
    private int[] answerItemMenu;
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
    public StubInput(String[] answerOnQuestion, int[] answerItemMenu) {
        this.answerOnQuestion = answerOnQuestion;
        this.answerItemMenu = answerItemMenu;
    }
    @Override
    public String ask(String question) {
        return answerOnQuestion[positionAnswerOnQuestion++];
    }
    @Override
    public int ask(String question, int[] range) {
        int value = answerItemMenu[positionAnswerItemMenu++];
        for (int item : range) {
            if (item == value) {
                return value;
            }
        }
        throw new MenuOutException("Out of menu range. ");
    }
}
