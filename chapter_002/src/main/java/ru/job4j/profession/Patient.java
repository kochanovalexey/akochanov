package ru.job4j.profession;

/**
 * Class Класс, описыващий пациентов.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Patient {
    /**
     * Имя пациента.
     */
    private String name;
    /**
     * Фамилия пациента.
     */
    private String surname;

    /**
     * Коструктор класса.
     * @param name - имя.
     * @param surname - фамилия.
     */
    public Patient(String name, String surname) {
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
