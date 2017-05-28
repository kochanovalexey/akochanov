package ru.job4j.profession;

/**
 * Class Класс, описывающий профессию доктора.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class Doctor extends Profession {
    /**
     * Образование.
     */
    private String education;
    /**
     * Академическая степень.
     */
    private String academicDegree;
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
     * @param academicDegree - академическая степень.
     * @param specialization - специализация.
     */
    public Doctor(String name, String surname, int age, int workExperience, String education, String academicDegree, String specialization) {
        super(name, surname, age, workExperience);
        this.education = education;
        this.academicDegree = academicDegree;
        this.specialization = specialization;
    }

    /**
     * @return - возращает education.
     */
    public String getEducation() {
        return education;
    }

    /**
     * @return - возращает academicDegree.
     */
    public String getAcademicDegree() {
        return academicDegree;
    }

    /**
     * @return возращает specialization.
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * heal Метод, в котором доктор лечит пациента.
     * @param patient - пациент.
     * @return - возращает строку о том, что доктор лечит пациента.
     */
    public String heal(Patient patient) {
        return "Доктор " + getSurname() + " " + getName() + " лечит " + patient.getSurname() + " " + patient.getName();
    }

    /**
     * conductsResearch Метод, в которм доктор проводит исследования болезни.
     * @param disease - болезнь.
     * @return - возращает строку о том, что проводит исследования болезни.
     */
    public String conductsResearch(Disease disease) {
        return "Доктор " + getSurname() + " " + getName() + " проводит исследование " + disease.getName();
    }
}


