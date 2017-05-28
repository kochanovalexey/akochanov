package ru.job4j.profession;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class DoctorTest {
    /**
     * Test whenDoctorHeal.
     */
    @Test
    public void whenDoctorHeal() {
        Doctor doctor = new Doctor("Семен", "Чижиков", 27, 2, "СПБГУ", "Интерн", "Хирургия");
        Patient patient = new Patient("Игоря", "Васильева");
        String result = doctor.heal(patient);
        String expected = "Доктор Чижиков Семен лечит Васильева Игоря";
        assertThat(result, is(expected));
    }

    /**
     * Test whenDoctorConductsResearch.
     */
    @Test
    public void whenDoctorConductsResearch() {
        Doctor doctor = new Doctor("Семен", "Чижиков", 27, 2, "СПБГУ", "Интерн", "Хирургия");
        Disease disease = new Disease("Псориаза");
        String result = doctor.conductsResearch(disease);
        String expected = "Доктор Чижиков Семен проводит исследование Псориаза";
        assertThat(result, is(expected));
    }
}
