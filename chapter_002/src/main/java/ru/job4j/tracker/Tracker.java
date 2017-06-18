package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

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
    private Item[] items = new Item[100];
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
        this.items[position++] = item;
        return item;
    }

    /**
     * Метод update - изменяет элемент массива items.
     * @param item - измененный Item.
     */
    public void update(Item item) {
        for (int i = 0; i < this.position; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(item.getId())) {
                this.items[i] = item;
                break;
            }
        }
    }

    /**
     * Метод delete удаляет Item из массива items.
     * @param item - удаляемый Item.
     */
    public void delete(Item item) {
        for (int i = 0; i < this.position; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(item.getId())) {
                this.items[i] = null;
                position--;
                for (int j = i; j < position; j++) {
                    Item nextItem = this.items[j + 1];
                    this.items[j + 1] = this.items[j];
                    this.items[j] = nextItem;
                }
                break;
            }
        }
    }

    /**
     * Метод findAll находит все заполненные элементы массива items.
     * @return массив найденных Item.
     */
    public Item[] findAll() {
        Item[] result = new Item[position];
        return Arrays.copyOf(this.items, position);
    }

    /**
     * Метод findByName находит все элементы массива items совпадающие по имени с key.
     * @param key - искомое имя.
     * @return массив с совмавшими именами с key.
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[items.length];
        int index = 0;
        for (int i = 0; i < position; i++) {
            if (this.items[i] != null && items[i].getName().equals(key)) {
                result[index++] = items[i];
            }
        }
        return Arrays.copyOf(result, index);
    }

    /**
     * Метод findById ищет Item по id.
     * @param id - id.
     * @return искомый Item.
     */
    public Item findById(String id) {
        Item result = null;
            for (int i = 0; i < position; i++) {
                if (this.items[i] != null && items[i].getId().equals(id)) {
                    result = items[i];
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
