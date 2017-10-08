package ru.job4j.execution;

import java.util.Random;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Class Класс вычисляющий время добавления и удаления Строк в коллекции.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class ExecutionTime {
    /**
     * Random.
     */
    private Random random = new Random();

    /**
     * Добавляет определенное количество рандомных строк в коллекцию.
     * @param collection - Коллекция.
     * @param amount - количество.
     * @return - возвращает время выполнения.
     */
    public long add(Collection<String> collection, int amount) {
        long start = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            collection.add(String.valueOf(random.nextInt(999999999)));
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    /**
     * Удаляет определенное количество элементов коллекции.
     * @param collection - коллекция.
     * @param amount - количество.
     * @return - время выполнения.
     */
    public long delete(Collection<String> collection, int amount) {
        long start = System.nanoTime();
        Iterator<String> iterator = collection.iterator();
        for (int i = 0; i < amount; i++) {
            iterator.next();
            iterator.remove();
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    /**
     * Метод старта.
     * @param args - аргументы.
     */
    public static void main(String[] args) {
        ExecutionTime executionTime = new ExecutionTime();

        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(String.format("Time to add 1000 String in ArrayList: " + executionTime.add(arrayList, 1000)));
        System.out.println(String.format("Time to remove first 500 String in ArrayList: " + executionTime.delete(arrayList, 500)));

        LinkedList<String> linkedList1 = new LinkedList<>();
        System.out.println(String.format("Time to add 1000 String in LinkedList: " + executionTime.add(linkedList1, 1000)));
        System.out.println(String.format("Time to remove first 500 String in LinkedList: " + executionTime.delete(linkedList1, 500)));

        TreeSet<String> treeSet = new TreeSet<>();
        System.out.println(String.format("Time to add 1000 String in TreeSet: " + executionTime.add(treeSet, 1000)));
        System.out.println(String.format("Time to remove first 500 String in TreeSet: " + executionTime.delete(treeSet, 500)));
    }
}
