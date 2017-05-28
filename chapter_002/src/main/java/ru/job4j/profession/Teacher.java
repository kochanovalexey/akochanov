package ru.job4j.profession;

/**
 * Class Класс, описывающий профессию учителя.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Teacher extends Profession {
    /**
     * Название школы.
     */
    private String schoolName;
    /**
     * Название предмета.
     */
    private String subject;

    /**
     * Конструктор.
     * @param name - имя.
     * @param surname - фамилия.
     * @param age - возраст.
     * @param workExperience - опыт работы.
     * @param schoolName - название школы.
     * @param subject - название предмета.
     */
    public Teacher(String name, String surname, int age, int workExperience, String schoolName, String subject) {
        super(name, surname, age, workExperience);
        this.schoolName = schoolName;
        this.subject = subject;
    }

    /**
     * Метод геттер.
     * @return - возращает schoolName.
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * Метод геттер.
     * @return - возращает subject.
     */
    public String getSubject() {
        return  subject;
    }

    /**
     * Метод, в котором учитель учит ученика.
     * @param student - студент.
     * @return - возращает строку о том, что учитель учит ученика.
     */
    public String teaches(Student student) {
        return "Учитель " + getSurname() + " " + getName() + " учит ученика " + student.getSurname() + " " + student.getName();
    }

    /**
     * Метод, в котором учитель экзаменует ученика.
     * @param student - студент.
     * @return - возращает строку о том, что учитель экзаменует ученика.
     */
    public String examine(Student student) {
        return "Учитель " + getSurname() + " " + getName() + " экзаменует ученика " + student.getSurname() + " " + student.getName();
    }
}
