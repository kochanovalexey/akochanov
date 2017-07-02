package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Class Класс.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class ConsoleInput implements Input {
    /**
     * scanner.
     */
    private Scanner scanner = new Scanner(System.in);
    @Override
    public String ask(String question) {
        System.out.println(question);
        return scanner.next();
    }
}