package ru.job4j.tracker;

import org.junit.Test;

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
        Input input = new StubInput(new String[]{"0", "test name", "desc", "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));
    }
    /**
     * Test whenUserAddItemThenTrackerHasNewItemWithSameDescription.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameDescription() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getDescription(), is("desc"));
    }
    /**
     * Test whenUserUpdateItemThenTrackerHasItemWithSameName.
     */
    @Test
    public void whenUserUpdateItemThenTrackerHasItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "y"});
        new StartUI(input, tracker).init();
        input = new StubInput(new String[]{"2", tracker.findAll()[0].getId(), "test name updated", "desk", "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findByName("test name updated")[0].getName(), is("test name updated"));
    }
    /**
     * Test whenUserUpdateItemThenTrackerHasItemWithSameDescription.
     */
    @Test
    public void whenUserUpdateItemThenTrackerHasItemWithSameDescription() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "y"});
        new StartUI(input, tracker).init();
        input = new StubInput(new String[]{"2", tracker.findAll()[0].getId(), "test name", "desk updated", "y"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findByName("test name")[0].getDescription(), is("desk updated"));
    }
    /**
     * Test whenUserDeleteItemThenTrackerDidNotHaveThisItem.
     */
    @Test
    public void whenUserDeleteItemThenTrackerDidNotHaveThisItem() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "y"});
        new StartUI(input, tracker).init();
        input = new StubInput(new String[]{"3", tracker.findAll()[0].getId(), "y"});
        new StartUI(input, tracker).init();
        assertNull(tracker.findByName("test name"));
    }
}
