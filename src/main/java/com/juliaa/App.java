package com.juliaa;

import models.Student;
import com.juliaa.utils.UniversityUtils;

/**
 * Główna klasa aplikacji uniwersyteckiej.
 */
public class App {

    /**
     * Główna metoda aplikacji, służąca do demonstracji funkcji uniwersyteckiej aplikacji.
     *
     * @param args argumenty z linii poleceń (nie są używane w tej aplikacji)
     */
    public static void main( String[] args ) {
        // Tworzymy nowego studenta
        Student newStudent = new Student("Anna Nowak");

        // Wykorzystujemy naszą utilitkę, aby zarejestrować studenta (dla celów demonstracyjnych)
        UniversityUtils.registerStudent(newStudent);

        // Wyświetlamy imię zarejestrowanego studenta
        System.out.println("Zarejestrowano studenta o imieniu: " + newStudent.getName());
    }
}