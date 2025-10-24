package encapsulation;

public class Student {
    // Field (atribut) dibuat private untuk menyembunyikan data
    private String name;
    private int age;

    // Konstruktor publik untuk inisialisasi objek
    // Sesuai dengan: new Student(codeInputName, codeInputAge)
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter publik untuk mengakses field name
    // Sesuai dengan: student.getName()
    public String getName() {
        // Mengembalikan nilai field name
        return this.name;
    }

    // Getter publik untuk mengakses field age
    // Sesuai dengan: student.getAge()
    public int getAge() {
        // Mengembalikan nilai field age
        return this.age;
    }

    // Setter publik untuk mengubah field age
    // Sesuai dengan: student.setAge(codeInputNewAge)
    public void setAge(int age) {
        // Mengatur nilai field age
        this.age = age;
    }
}