package ru.job4j.bank;

/**
 * Class Класс описывающий аккаунты.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Account {
    private double value;
    private long requisites;

    public Account(double value, long requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    public double getValue() {
        return value;
    }

    public long getRequisites() {
        return requisites;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setRequisites(long requisites) {
        this.requisites = requisites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != getClass()) {
            return false;
        }
        Account account = (Account) o;
        return account.getRequisites() == requisites;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
