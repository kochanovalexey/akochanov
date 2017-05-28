package ru.job4j.profession;

/**
 * Class Класс, описывающий профессию инженера.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Engineer extends Profession {
    /**
     * Образование.
     */
    private String education;
    /**
     * Специализация.
     */
    private String specialization;

    /**
     * Коструктор класса.
     * @param name - имя.
     * @param surname - фамилия.
     * @param age - возраст.
     * @param workExperience - опыт работы.
     * @param education - образование.
     * @param specialization - специализация.
     */
    public Engineer(String name, String surname, int age, int workExperience, String education, String specialization) {
        super(name, surname, age, workExperience);
        this.education = education;
        this.specialization = specialization;
    }

    /**
     * Метод геттер.
     * @return - возращает education.
     */
    public String getEducation() {
        return education;
    }

    /**
     * Метод геттер.
     * @return - возращает specialization.
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * design Метод, в котором инженер проектирует оборудование.
     * @param equipment - оборудование.
     * @return - возращает строку о том, что инженер проектирует оборудование.
     */
    public String design(Equipment equipment) {
        return "Инженер " + getSurname() + " " + getName() + " проектирует " + equipment.getName();
    }

    /**
     * control Метод, в котором инженер контролирует работу.
     * @param work - работа.
     * @return - возращает строку о том, что инженер контролирует работу.
     */
    public String control(Work work) {
        return "Инженер " + getSurname() + " " + getName() + " контролирует " + work.getName();
    }
}
