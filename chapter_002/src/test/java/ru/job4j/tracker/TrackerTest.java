package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class TrackerTest {
    /**
     * Test whenAddNewItemThenTrackerHasSameItem.
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L, null);
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }
    /**
     * Test whenUpdateItemInTracker.
     */
    @Test
    public void whenUpdateItemInTracker() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L, null);
        tracker.add(item);
        Item updateItem = new Item("test1", "testDescription", 123L, null);
        updateItem.setId(item.getId());
        tracker.update(updateItem);
        assertThat(tracker.findAll()[0], is(updateItem));
    }
    /**
     * Test whenDeleteItemInTracker.
     */
    @Test
    public void whenDeleteItemInTracker() {
        Tracker tracker = new Tracker();
        Item item0 = new Item("test1", "testDescription1", 123L, null);
        Item item1 = new Item("test2", "testDescription2", 132L, null);
        tracker.add(item0);
        tracker.add(item1);
        tracker.delete(item1);
        assertThat(tracker.findAll()[0], is(item0));
    }
    /**
     * Test whenFindItemInTrackerByName.
     */
    @Test
    public void whenFindItemInTrackerByName() {
        Tracker tracker = new Tracker();
        Item item0 = new Item("test1", "testDescription1", 123L, null);
        Item item1 = new Item("test2", "testDescription2", 132L, null);
        Item item2 = new Item("test1", "testDescription2", 132L, null);
        Item[] expected = {item0, item2};
        tracker.add(item0);
        tracker.add(item1);
        tracker.add(item2);
        assertThat(tracker.findByName("test1"), is(expected));
    }
    /**
     * Test whenFindItemInTrackerById.
     */
    @Test
    public void whenFindItemInTrackerById() {
        Tracker tracker = new Tracker();
        Item item0 = new Item("test1", "testDescription1", 123L, null);
        Item item1 = new Item("test2", "testDescription2", 132L, null);
        Item item2 = new Item("test1", "testDescription2", 132L, null);
        tracker.add(item0);
        tracker.add(item1);
        tracker.add(item2);
        assertThat(tracker.findById(item1.getId()), is(item1));
    }
}
