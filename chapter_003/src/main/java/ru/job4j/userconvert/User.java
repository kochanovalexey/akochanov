package ru.job4j.userconvert;

/**
 * Class Класс User.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class User {
    /**
     * ID.
     */
    private int id;
    /**
     * Name.
     */
    private String name;
    /**
     * City.
     */
    private String city;

    /**
     * Конструктор класса.
     * @param id - id.
     * @param name - name.
     * @param city -city.
     */
    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    /**
     * Геттер id.
     * @return - id.
     */
    public int getId() {
        return id;
    }

    /**
     * Геттер name.
     * @return - name.
     */
    public String getName() {
        return name;
    }

    /**
     * Геттер city.
     * @return - city.
     */
    public String getCity() {
        return city;
    }

    /**
     * Сеттер id.
     * @param id - id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Сеттер name.
     * @param name - name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Сеттер city.
     * @param city - city.
     */
    public void setCity(String city) {
        this.city = city;
    }
}
