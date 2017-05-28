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
public class EngineerTest {
    /**
     * Test whenEngineerDesign.
     */
    @Test
    public void whenEngineerDesign() {
        Engineer engineer = new Engineer("Семен", "Чижиков", 36, 12, "СПБГУ", "Гидрооборудование");
        Equipment equipment = new Equipment("Насос");
        String result = engineer.design(equipment);
        String expected = "Инженер Чижиков Семен проектирует Насос";
        assertThat(result, is(expected));
    }

    /**
     * Test whenEngineerControl.
     */
    @Test
    public void whenEngineerControl() {
        Engineer engineer = new Engineer("Семен", "Чижиков", 36, 12, "СПБГУ", "Гидрооборудование");
        Work work = new Work("Сборку");
        String result = engineer.control(work);
        String expected = "Инженер Чижиков Семен контролирует Сборку";
        assertThat(result, is(expected));
    }
}
