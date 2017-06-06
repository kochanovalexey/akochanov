package ru.job4j.Tracker;

/**
 * Class Класс заявок.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Item {
    private String name;
    private String desc;
    private long created;
    private String[] comments;
    public Item() {
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return this.desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public long getCreated() {
        return this.created;
    }
    public void setCreated(long created) {
        this.created = created;
    }
    public String[] getComments() {
        return this.comments;
    }
    public void setComments(String[] comments) {
        this.comments = comments;
    }
}
