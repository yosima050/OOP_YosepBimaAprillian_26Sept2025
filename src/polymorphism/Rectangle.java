package polymorphism;

// Rectangle adalah subclass dari Shape
public class Rectangle extends Shape {
    private double width;
    private double height;

    // Konstruktor untuk inisialisasi lebar dan tinggi
    // Sesuai dengan: new Rectangle(codeInputWidth, codeInputHeight)
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Implementasi method getArea untuk Rectangle.
     * Menghitung luas berdasarkan rumus lebar * tinggi.
     */
    @Override
    public double getArea() {
        // Mengembalikan hasil perhitungan luas persegi panjang
        return this.width * this.height;
    }
}