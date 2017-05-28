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
public class TeacherTest {
    /**
     * Test whenTeacherTeaches.
     */
    @Test
    public void whenTeacherTeaches() {
        Teacher teacher = new Teacher("Иван", "Иванов", 47, 22, "Школа № 6", "Русский язык");
        Student student = new Student("Петра", "Петрова");
        String result = teacher.teaches(student);
        String expected = "Учитель Иванов Иван учит ученика Петрова Петра";
        assertThat(result, is(expected));
    }

    /**
     * Test whenTeacherExamine.
     */
    @Test
    public void whenTeacherExamine() {
        Teacher teacher = new Teacher("Иван", "Иванов", 47, 22, "Школа № 6", "Русский язык");
        Student student = new Student("Петра", "Петрова");
        String result = teacher.examine(student);
        String expected = "Учитель Иванов Иван экзаменует ученика Петрова Петра";
        assertThat(result, is(expected));
    }
}
