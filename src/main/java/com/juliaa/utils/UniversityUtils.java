package com.juliaa.utils;

import models.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Narzędzia pomocnicze dla funkcji uniwersytetu.
 */
public class UniversityUtils {
    private static final Logger logger = LogManager.getLogger(UniversityUtils.class);
    /**
     * Rejestruje studenta w systemie uniwersytetu.
     *
     * @param student student do zarejestrowania
     */
    public static void registerStudent(Student student) {
        logger.info("Rejestrowanie studenta: " + student.getName());
        // Tutaj logika rejestrowania...
    }
}
