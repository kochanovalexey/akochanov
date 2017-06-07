package ru.job4j.tracker;

/**
 * Class Класс заявок.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Item {
    /**
     * id.
     */
    private String id;
    /**
     * Название заявки.
     */
    private String name;
    /**
     * Описание заявки.
     */
    private String description;
    /**
     * Дата создания.
     */
    private long created;
    /**
     * Комментарий к заявке.
     */
    private String[] comments;

    /**
     * Коструктор класса.
     * @param name - название заявки.
     * @param description - описание заявки.
     * @param created - дата создания.
     * @param comments - коментарии к заявке.
     */
    public Item(String name, String description, long created, String[] comments) {
        this.name = name;
        this.description = description;
        this.created = created;
        this.comments = comments;
    }

    /**
     * Геттер id.
     * @return id.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Сеттер id.
     * @param id - id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Геттер name.
     * @return name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Сеттер name.
     * @param name - название.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Геттер description.
     * @return description.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Сеттер description.
     * @param description - описание.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Геттер created.
     * @return created.
     */
    public long getCreated() {
        return this.created;
    }

    /**
     * Сеттер created.
     * @param created - дата создания.
     */
    public void setCreated(long created) {
        this.created = created;
    }

    /**
     * Геттер comments.
     * @return comments.
     */
    public String[] getComments() {
        return this.comments;
    }

    /**
     * Сеттер comments.
     * @param comments - комментарии.
     */
    public void setComments(String[] comments) {
        this.comments = comments;
    }
}
