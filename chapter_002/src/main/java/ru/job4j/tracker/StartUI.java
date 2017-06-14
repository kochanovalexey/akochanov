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
     * Вход в нашу программу.
     * @param args - массив строк.
     */
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        ConsoleInput input = new ConsoleInput();
        int answer = Integer.parseInt(input.ask("0. Add new Item\n1. Show all items\n2. Edit item\n3. Delete item\n4. Find item by Id\n5. Find items by name\n6. Exit Program"));
        while (answer != 6) {
            switch (answer) {
                case 0:
                    String nameItem = input.ask("Write name item");
                    String descriptionItem =  input.ask("Write description item");
                    Item item = new Item(nameItem, descriptionItem, 0L, null);
                    tracker.add(item);
                    break;
                case 1:
                    Item[] items = tracker.findAll();
                    for (Item itemAll : items) {
                        System.out.println(itemAll.getName());
                    }
                    break;
                case 2:
                    String idItem = input.ask("Write id item");
                    nameItem = input.ask("Write name item");
                    descriptionItem =  input.ask("Write description item");
                    item = new Item(nameItem, descriptionItem, 0L, null);
                    item.setId(idItem);
                    tracker.add(item);
                    break;
                case 3:
                    idItem = input.ask("Write id item");
                    item = new Item("", "", 0L, null);
                    item.setId(idItem);
                    tracker.delete(item);
                    break;
                case 4:
                    idItem = input.ask("Write id item");
                    tracker.findById(idItem);
                    break;
                case 5:
                    nameItem = input.ask("Write name item");
                    tracker.findByName(nameItem);
                    break;
                default:
                    System.out.println("Error, please write again");
                    break;
            }
            answer = Integer.parseInt(input.ask("0. Add new Item\n1. Show all items\n2. Edit item\n3. Delete item\n4. Find item by Id\n5. Find items by name\n6. Exit Program"));
        }
    }
}
