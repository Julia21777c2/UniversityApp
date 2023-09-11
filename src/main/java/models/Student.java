package models;
/**
 * Reprezentuje studenta uczęszczającego na uniwersytet.
 */
public class Student {

    private String name;

    /**
     * Tworzy nowego studenta.
     *
     * @param name imię studenta
     */
    public Student(String name, int i) {
        this.name = name;
    }

    /**
     * Zwraca imię studenta.
     *
     * @return imię studenta
     */
    public String getName() {
        return name;
    }
    /**
     * Ustawia imię studenta.
     *
     * @param name nowe imię studenta
     */
    public void setName(String name) {
        this.name = name;
    }
}