package classRelationship;

public class Person {
    protected String name;

    // Konstruktor untuk inisialisasi nama
    public Person(String name) {
        this.name = name;
    }

    // Method untuk mendapatkan nama
    public String getName() {
        // Mengembalikan nama
        return this.name;
    }
}