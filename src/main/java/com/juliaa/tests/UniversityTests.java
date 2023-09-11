package com.juliaa.tests;

import models.Student;
import com.juliaa.utils.UniversityUtils;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Klasa testująca funkcje uniwersytetu.
 */
public class UniversityTests {
    @Test
    /**
     * Testuje proces rejestracji studenta.
     */
    public void testRegisterStudent() {
        Student student = new Student("Anna", 12345);
        UniversityUtils.registerStudent(student);
    }
}
