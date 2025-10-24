package polymorphism;

// Circle adalah subclass dari Shape
public class Circle extends Shape {
    private double radius;

    // Konstruktor untuk inisialisasi radius
    // Sesuai dengan: new Circle(codeInputRadius)
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Implementasi method getArea untuk Circle.
     * Menghitung luas berdasarkan rumus PI * r * r.
     */
    @Override
    public double getArea() {
        // Mengembalikan hasil perhitungan luas lingkaran
        return Math.PI * this.radius * this.radius;
    }
}