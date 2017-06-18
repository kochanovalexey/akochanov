package ru.job4j.tracker;

/**
 * Class Класс.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class StartUI {
    /**
     * Tracker.
     */
    private Tracker tracker;
    /**
     * Input.
     */
    private Input input;

    /**
     * enum MenuItem.
     */
    enum MenuItem { ADD, SHOW, EDIT, DELETE, FINDID, FINDNAME, EXIT };
    /**
     * Конструктор класса.
     * @param input - input.
     * @param tracker - tracker.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    /**
     * Вход в нашу программу.
     * @param args - массив строк.
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
    /**
     * Метод init.
     */
    public void init() {
        MenuItem[] menuItems = MenuItem.values();
        MenuItem menuItem = menuItems[returnPositionMenuItem()];
        while (menuItem != MenuItem.EXIT) {
            switch (menuItem) {
                case ADD:
                    String nameItem = input.ask("Write name item");
                    String descriptionItem =  input.ask("Write description item");
                    Item item = new Item(nameItem, descriptionItem, 0L, null);
                    tracker.add(item);
                    break;
                case SHOW:
                    Item[] items = tracker.findAll();
                    for (Item itemAll : items) {
                        System.out.println("Id item: " + itemAll.getId());
                        System.out.println("Name item: " + itemAll.getName());
                        System.out.println("Description item: " + itemAll.getDescription());
                    }
                    break;
                case EDIT:
                    String idItem = input.ask("Write id item");
                    nameItem = input.ask("Write name item");
                    descriptionItem =  input.ask("Write description item");
                    item = new Item(nameItem, descriptionItem, 0L, null);
                    item.setId(idItem);
                    tracker.update(item);
                    System.out.println("Item " + item.getName() + " updated");
                    break;
                case DELETE:
                    idItem = input.ask("Write id item");
                    item = new Item("", "", 0L, null);
                    item.setId(idItem);
                    tracker.delete(item);
                    System.out.println("Item " + item.getName() + " deleted");
                    break;
                case FINDID:
                    idItem = input.ask("Write id item");
                    item = tracker.findById(idItem);
                    System.out.println("Id item: " + item.getId());
                    System.out.println("Name item: " + item.getName());
                    System.out.println("Description item: " + item.getDescription());
                    break;
                case FINDNAME:
                    nameItem = input.ask("Write name item");
                    items = tracker.findByName(nameItem);
                    for (Item itemAll : items) {
                        System.out.println("Id item: " + itemAll.getId());
                        System.out.println("Name item: " + itemAll.getName());
                        System.out.println("Description item: " + itemAll.getDescription());
                    }
                    break;
                default:
                    System.out.println("Error, please write again");
                    break;
            }
            menuItem = menuItems[returnPositionMenuItem()];
        }
    }

    /**
     * Метод возращает номер позиции в меню.
     * @return - номер позиции в меню.
     */
    public int returnPositionMenuItem() {
        return Integer.parseInt(input.ask("0. Add new Item\n1. Show all items\n2. Edit item\n3. Delete item\n4. Find item by Id\n5. Find items by name\n6. Exit Program\nPlease select menu item"));
    }
}
