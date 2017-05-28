package ru.job4j.profession;

/**
 * Class Класс, описывающий учеников.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Student {
    /**
     * Имя.
     */
    private String name;
    /**
     * Фамилия.
     */
    private String surname;

    /**
     * Коструктор.
     * @param name - имя.
     * @param surname - фамилия.
     */
    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * Метод геттер.
     * @return - возращает name.
     */
    public String getName() {
        return name;
    }

    /**
     * Метод геттер.
     * @return - возращает surname.
     */
    public String getSurname() {
        return surname;
    }
}
