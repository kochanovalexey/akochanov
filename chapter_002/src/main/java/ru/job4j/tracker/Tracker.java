package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Iterator;
/**
 * Class Класс tracker.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив Item.
     */
    private List<Item> items = new ArrayList<Item>();
    /**
     * Текущая позиция в массиве items.
     */
    private int position = 0;
    /**
     * Рандом.
     */
    private static final Random RN = new Random();

    /**
     * Метод add добавляет новый Item в массив items.
     * @param item - новый Item.
     * @return - item.
     */
    public Item add(Item item) {
        item.setId(generateId());
        this.items.add(item);
        return item;
    }

    /**
     * Метод update - изменяет элемент массива items.
     * @param item - измененный Item.
     */
    public void update(Item item) {
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i) != null && this.items.get(i).getId().equals(item.getId())) {
                this.items.set(i, item);
                break;
            }
        }
    }

    /**
     * Метод delete удаляет Item из массива items.
     * @param item - удаляемый Item.
     */
    public void delete(Item item) {
        Iterator<Item> iterator = this.items.iterator();
        while (iterator.hasNext()) {
            Item elementItems = iterator.next();
            if (elementItems != null && elementItems.getId().equals(item.getId())) {
                iterator.remove();
                break;
            }
        }
    }

    /**
     * Метод findAll находит все заполненные элементы массива items.
     * @return массив найденных Item.
     */
    public List<Item> findAll() {
        return this.items;
    }

    /**
     * Метод findByName находит все элементы массива items совпадающие по имени с key.
     * @param name - искомое имя.
     * @return массив с совмавшими именами с key.
     */
    public List<Item> findByName(String name) {
        List<Item> result = new ArrayList<Item>();
        for (Item item : this.items) {
            if (item != null && item.getName().equals(name)) {
                result.add(item);
            }
        }
        if (result.size() == 0) {
            return null;
        } else {
            return result;
        }
    }

    /**
     * Метод findById ищет Item по id.
     * @param id - id.
     * @return искомый Item.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : this.items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Метод generateId генерирует id.
     * @return id.
     */
    public String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }
}
