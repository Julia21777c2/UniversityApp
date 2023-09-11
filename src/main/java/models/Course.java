package models;
/**
 * Reprezentuje kurs oferowany przez uniwersytet.
 */
public class Course {
    private String courseName;
    private int courseID;
    /**
     * Tworzy nowy kurs.
     *
     * @param courseName nazwa kursu
     * @param courseID unikalny identyfikator kursu
     */
    public Course(String courseName, int courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
    }

    // Getters, setters i toString tutaj
}
