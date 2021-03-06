package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Класс MenuTracker.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class MenuTracker {
    /**
     * Input.
     */
    private Input input;
    /**
     * Tracker.
     */
    private Tracker tracker;
    /**
     * Массив UserAction.
     */
    //private BaseAction[] actions = new BaseAction[6];
    private List<BaseAction> actions = new ArrayList<>();
    /**
     * Коструктор.
     *
     * @param input   - input.
     * @param tracker - tracker.
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Метод заполняет массив пунктов меню.
     */
    public void fillActions() {
        this.actions.add(new AddItem());
        this.actions.add(new ShowItems());
        this.actions.add(new EditItem());
        this.actions.add(new DeleteItem());
        this.actions.add(new FindItemByID());
        this.actions.add(new FindItemsByName());
    }

    /**
     * Метод возращает массив ключей меню.
     *
     * @return - массив ключей меню.
     */
    public List<Integer> returnArrayOfMenuKeys() {
        List<Integer> range = new ArrayList<>();
        for (BaseAction action : actions) {
            range.add(action.key());
        }
        return range;
    }

    /**
     * Метод по ключу вызывает выполнение пункта меню.
     *
     * @param key - ключ.
     */
    public void selectMenuItem(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    /**
     * Метод показывает печатет пункты меню.
     */
    public void showMenu() {
        for (BaseAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    /**
     * Класс AddItem, которые добавляет новые заявки в трекер.
     */
    private class AddItem extends BaseAction {
        /**
         * Конструктор класса.
         */
        AddItem() {
            super("Add the new item", 0);
        }
        /**
         * Метод добавляющий заявку в трекер.
         *
         * @param input   - input.
         * @param tracker - tracker.
         */
        public void execute(Input input, Tracker tracker) {
            String nameItem = input.ask("Please, enter the task's name:");
            String descriptionItem = input.ask("Please, enter the task's description");
            tracker.add(new Item(nameItem, descriptionItem, 0L, null));
        }
    }

    /**
     * Класс ShowItems, который показывает все заявки трекера.
     */
    private static class ShowItems extends BaseAction {
        /**
         * Конструктор класса.
         */
        ShowItems() {
            super("Show all items", 1);
        }
        /**
         * Метод, который показывает все заявки трекера.
         *
         * @param input   - input.
         * @param tracker - tracker.
         */
        public void execute(Input input, Tracker tracker) {
            List<Item> items = tracker.findAll();
            for (Item itemAll : items) {
                System.out.println("Id item: " + itemAll.getId());
                System.out.println("Name item: " + itemAll.getName());
                System.out.println("Description item: " + itemAll.getDescription());
            }
        }
    }
    /**
     *  Класс DeleteItem удаляет заявку в трекере.
     */
    private class DeleteItem extends BaseAction {
        /**
         *  Конструктор класса.
         */
        DeleteItem() {
            super("Delete item", 3);
        }
        /**
         * Метод, который удвет заявку.
         *
         * @param input   - input.
         * @param tracker - tracker.
         */
        public void execute(Input input, Tracker tracker) {
            String idItem = input.ask("Write id item");
            Item item = new Item("", "", 0L, null);
            item.setId(idItem);
            tracker.delete(item);
            System.out.println("Item " + item.getName() + " deleted");
        }
    }

    /**
     * Класс FindItemByID, который находит заявку по ID.
     */
    private class FindItemByID extends BaseAction {
        /**
         * Конструктор класса.
         */
        FindItemByID() {
            super("Find item by id", 4);
        }
        /**
         * Метод, который находит заявку по ID.
         *
         * @param input   - input.
         * @param tracker - tracker.
         */
        public void execute(Input input, Tracker tracker) {
            String idItem = input.ask("Please, enter the task's id:");
            Item item = tracker.findById(idItem);
            System.out.println("Id item: " + item.getId());
            System.out.println("Name item: " + item.getName());
            System.out.println("Description item: " + item.getDescription());
        }
    }

    /**
     * Класс FindItemsByName, который находит заявку по имени.
     */
    private class FindItemsByName extends BaseAction {
        /**
         * Конструктор класса.
         */
        FindItemsByName() {
            super("Find items by name", 5);
        }
        /**
         * Метод, который находит заявку по имени.
         *
         * @param input   - input.
         * @param tracker - tracker.
         */
        public void execute(Input input, Tracker tracker) {
            String nameItem = input.ask("Please, enter the task's name");
            List<Item> items = tracker.findByName(nameItem);
            for (Item itemAll : items) {
                System.out.println("Id item: " + itemAll.getId());
                System.out.println("Name item: " + itemAll.getName());
                System.out.println("Description item: " + itemAll.getDescription());
            }
        }
    }
}
/**
 * Класс EditItem, который редактирует заявку.
 */
class EditItem extends BaseAction {
    /**
     * Конструктор класса.
     */
    EditItem() {
        super("Edit item", 2);
    }
    /**
     * Метод, который редактирует заявку.
     *
     * @param input   - input.
     * @param tracker - tracker.
     */
    public void execute(Input input, Tracker tracker) {
        String idItem = input.ask("Please, enter the task's id:");
        String nameItem = input.ask("Please, enter the task's name:");
        String descriptionItem = input.ask("Please, enter the task's description");
        Item item = new Item(nameItem, descriptionItem, 0L, null);
        item.setId(idItem);
        tracker.update(item);
        System.out.println(item.getId() + " updated");
    }
}

