package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class StubInputTest {
    /**
     * Test whenUserAddItemThenTrackerHasNewItemWithSameName.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        List<String> answerOnQuestion = new ArrayList<>();
        answerOnQuestion.add("test name");
        answerOnQuestion.add("desc");
        answerOnQuestion.add("y");
        List<Integer> answerItemMenu = new ArrayList<>();
        answerItemMenu.add(0);
        Input input = new StubInput(answerOnQuestion, answerItemMenu);
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().get(0).getName(), is("test name"));
    }
    /**
     * Test whenUserAddItemThenTrackerHasNewItemWithSameDescription.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameDescription() {
        Tracker tracker = new Tracker();
        List<String> answerOnQuestion = new ArrayList<>();
        answerOnQuestion.add("test name");
        answerOnQuestion.add("desc");
        answerOnQuestion.add("y");
        List<Integer> answerItemMenu = new ArrayList<>();
        answerItemMenu.add(0);
        Input input = new StubInput(answerOnQuestion, answerItemMenu);
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().get(0).getDescription(), is("desc"));
    }
    /**
     * Test whenUserUpdateItemThenTrackerHasItemWithSameName.
     */
    @Test
    public void whenUserUpdateItemThenTrackerHasItemWithSameName() {
        Tracker tracker = new Tracker();
        List<String> answerOnQuestion = new ArrayList<>();
        answerOnQuestion.add("test name");
        answerOnQuestion.add("desc");
        answerOnQuestion.add("y");
        List<Integer> answerItemMenu = new ArrayList<>();
        answerItemMenu.add(0);
        Input input = new StubInput(answerOnQuestion, answerItemMenu);
        new StartUI(input, tracker).init();
        answerOnQuestion = new ArrayList<>();
        answerOnQuestion.add(tracker.findByName("test name").get(0).getId());
        answerOnQuestion.add("test name updated");
        answerOnQuestion.add("desk");
        answerOnQuestion.add("y");
        answerItemMenu = new ArrayList<>();
        answerItemMenu.add(2);
        input = new StubInput(answerOnQuestion, answerItemMenu);
        new StartUI(input, tracker).init();
        assertThat(tracker.findByName("test name updated").get(0).getName(), is("test name updated"));
    }
    /**
     * Test whenUserUpdateItemThenTrackerHasItemWithSameDescription.
     */
    @Test
    public void whenUserUpdateItemThenTrackerHasItemWithSameDescription() {
        Tracker tracker = new Tracker();
        List<String> answerOnQuestion = new ArrayList<>();
        answerOnQuestion.add("test name");
        answerOnQuestion.add("desc");
        answerOnQuestion.add("y");
        List<Integer> answerItemMenu = new ArrayList<>();
        answerItemMenu.add(0);
        Input input = new StubInput(answerOnQuestion, answerItemMenu);
        new StartUI(input, tracker).init();
        answerOnQuestion = new ArrayList<>();
        answerOnQuestion.add(tracker.findAll().get(0).getId());
        answerOnQuestion.add("test name");
        answerOnQuestion.add("desk updated");
        answerOnQuestion.add("y");
        answerItemMenu = new ArrayList<>();
        answerItemMenu.add(2);
        input = new StubInput(answerOnQuestion, answerItemMenu);
        new StartUI(input, tracker).init();
        assertThat(tracker.findByName("test name").get(0).getDescription(), is("desk updated"));
    }
    /**
     * Test whenUserDeleteItemThenTrackerDidNotHaveThisItem.
     */
    @Test
    public void whenUserDeleteItemThenTrackerDidNotHaveThisItem() {
        Tracker tracker = new Tracker();
        List<String> answerOnQuestion = new ArrayList<>();
        answerOnQuestion.add("test name");
        answerOnQuestion.add("desc");
        answerOnQuestion.add("y");
        List<Integer> answerItemMenu = new ArrayList<>();
        answerItemMenu.add(0);

        Input input = new StubInput(answerOnQuestion, answerItemMenu);
        new StartUI(input, tracker).init();

        answerOnQuestion = new ArrayList<>();
        answerOnQuestion.add(tracker.findAll().get(0).getId());
        answerOnQuestion.add("y");
        answerItemMenu = new ArrayList<>();
        answerItemMenu.add(3);

        input = new StubInput(answerOnQuestion, answerItemMenu);
        new StartUI(input, tracker).init();
        assertNull(tracker.findByName("test name"));
    }

    /**
     * Test whenUserCausesException.
     */
    @Test(expected = MenuOutException.class)
    public void whenUserCausesException() {
        Tracker tracker = new Tracker();
        List<String> answerOnQuestion = new ArrayList<>();
        answerOnQuestion.add("test name");
        answerOnQuestion.add("desc");
        answerOnQuestion.add("y");
        List<Integer> answerItemMenu = new ArrayList<>();
        answerItemMenu.add(10);
        Input input = new StubInput(answerOnQuestion, answerItemMenu);
        new StartUI(input, tracker).init();
    }
}
