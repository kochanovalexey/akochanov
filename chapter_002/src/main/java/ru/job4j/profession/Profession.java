package ru.job4j.profession;

/**
 * Class Класс, описывающий профессии.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Profession {
    /**
     * Имя.
     */
    private String name;
    /**
     * Фамилия.
     */
    private String surname;
    /**
     * Возраст.
     */
    private int age;
    /**
     * Опыт работы.
     */
    private int workExperience;

    /**
     * Пустой конструктор.
     */
    public Profession() {

    }

    /**
     * Коструктор.
     * @param name - имя.
     * @param surname - фамилия.
     * @param age - возраст.
     * @param workExperience - опыт работы.
     */
    public Profession(String name, String surname, int age, int workExperience) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.workExperience = workExperience;
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

    /**
     * Метод геттер.
     * @return - возращает age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Метод геттер.
     * @return - возращает workExperience.
     */
    public int getWorkExperience() {
        return workExperience;
    }
}
