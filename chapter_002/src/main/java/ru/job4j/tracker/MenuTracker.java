package ru.job4j.tracker;

/**
 * Class Класс MenuTracker.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class MenuTracker  {
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
    private UserAction[] actions = new UserAction[6];
    /**
     * Коструктор.
     * @param input - input.
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
        this.actions[0] = new AddItem();
        this.actions[1] = new ShowItems();
        this.actions[2] = new EditItem();
        this.actions[3] = new DeleteItem();
        this.actions[4] = new FindItemByID();
        this.actions[5] = new FindItemsByName();
    }
    /**
     * Метод по ключу вызывает выполнение пункта меню.
     * @param key - ключ.
     */
    public void selectMenuItem(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }
    /**
     * Метод показывает печатет пункты меню.
     */
    public void showMenu() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
    /**
     * Класс AddItem, которые добавляет новые заявки в трекер.
     */
    private class AddItem implements UserAction {
        /**
         * Метод возращающий ключ.
         * @return - номер ключа равный 0.
         */
        public int key() {
            return 0;
        }
        /**
         * Метод добавляющий заявку в трекер.
         * @param input - input.
         * @param tracker - tracker.
         */
        public void execute(Input input, Tracker tracker) {
            String nameItem = input.ask("Please, enter the task's name:");
            String descriptionItem =  input.ask("Please, enter the task's description");
            tracker.add(new Item(nameItem, descriptionItem, 0L, null));
        }
        /**
         * Метод возращающий информацию о пункте меню.
         * @return - возращает номер ключа и информацию пункта меню.
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Add the new item");
        }
    }
    /**
     * Класс ShowItems, который показывает все заявки трекера.
     */
    private static class ShowItems implements UserAction {
        /**
         * Метод возращающий ключ.
         * @return - номер ключа равный 1.
         */
        public int key() {
            return 1;
        }
        /**
         * Метод, который показывает все заявки трекера.
         * @param input - input.
         * @param tracker - tracker.
         */
        public void execute(Input input, Tracker tracker) {
            Item[] items = tracker.findAll();
            for (Item itemAll : items) {
                System.out.println("Id item: " + itemAll.getId());
                System.out.println("Name item: " + itemAll.getName());
                System.out.println("Description item: " + itemAll.getDescription());
            }
        }
        /**
         * Метод возращающий информацию о пункте меню.
         * @return - возращает номер ключа и информацию пункта меню.
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Show all items");
        }
    }
    /**
     * Класс DeleteItem, который удаляет завку.
     */
    private class DeleteItem implements UserAction {
        /**
         * Метод возращающий ключ.
         * @return - номер ключа равный 3.
         */
        public int key() {
            return 3;
        }
        /**
         * Метод, который удвет заявку.
         * @param input - input.
         * @param tracker - tracker.
         */
        public void execute(Input input, Tracker tracker) {
            String idItem = input.ask("Write id item");
            Item item = new Item("", "", 0L, null);
            item.setId(idItem);
            tracker.delete(item);
            System.out.println("Item " + item.getName() + " deleted");
        }
        /**
         * Метод возращающий информацию о пункте меню.
         * @return - возращает номер ключа и информацию пункта меню.
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Delete item");
        }
    }
    /**
     * Класс FindItemByID, который находит заявку по ID.
     */
    private class FindItemByID implements UserAction {
        /**
         * Метод возращающий ключ.
         * @return - номер ключа равный 4.
         */
        public int key() {
            return 4;
        }
        /**
         * Метод, который находит заявку по ID.
         * @param input - input.
         * @param tracker - tracker.
         */
        public void execute(Input input, Tracker tracker) {
            String idItem = input.ask("Please, enter the task's id:");
            Item item = tracker.findById(idItem);
            System.out.println("Id item: " + item.getId());
            System.out.println("Name item: " + item.getName());
            System.out.println("Description item: " + item.getDescription());
        }
        /**
         * Метод возращающий информацию о пункте меню.
         * @return - возращает номер ключа и информацию пункта меню.
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by id");
        }
    }
    /**
     * Класс FindItemsByName, который находит заявку по имени.
     */
    private class FindItemsByName implements UserAction {
        /**
         * Метод возращающий ключ.
         * @return - номер ключа равный 5.
         */
        public int key() {
            return 5;
        }
        /**
         * Метод, который находит заявку по имени.
         * @param input - input.
         * @param tracker - tracker.
         */
        public void  execute(Input input, Tracker tracker) {
            String nameItem = input.ask("Please, enter the task's name");
            Item[] items = tracker.findByName(nameItem);
            for (Item itemAll : items) {
                System.out.println("Id item: " + itemAll.getId());
                System.out.println("Name item: " + itemAll.getName());
                System.out.println("Description item: " + itemAll.getDescription());
            }
        }
        /**
         * Метод возращающий информацию о пункте меню.
         * @return - возращает номер ключа и информацию пункта меню.
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Find items by name");
        }
    }
}
/**
 * Класс EditItem, который редактирует заявку.
 */
class EditItem implements UserAction {
    /**
     * Метод возращающий ключ.
     * @return - номер ключа равный 2.
     */
    public int key() {
        return 2;
    }
    /**
     * Метод, который редактирует заявку.
     * @param input - input.
     * @param tracker - tracker.
     */
    public void execute(Input input, Tracker tracker) {
        String idItem = input.ask("Please, enter the task's id:");
        String nameItem = input.ask("Please, enter the task's name:");
        String descriptionItem =  input.ask("Please, enter the task's description");
        Item item = new Item(nameItem, descriptionItem, 0L, null);
        item.setId(idItem);
        tracker.update(item);
        System.out.println(item.getId() + " updated");
    }
    /**
     * Метод возращающий информацию о пункте меню.
     * @return - возращает номер ключа и информацию пункта меню.
     */
    public String info() {
        return String.format("%s. %s", this.key(), "Edit item");
    }
}