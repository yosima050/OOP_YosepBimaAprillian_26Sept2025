package overloading;

public class Calculator {

    // Method add untuk menjumlahkan dua bilangan bulat
    // Sesuai dengan test case testAddIntInt [cite: 686]
    public int add(int a, int b) {
        // Mengembalikan hasil penjumlahan a dan b
        return a + b;
    }

    // Method add untuk menjumlahkan dua bilangan double
    // Sesuai dengan test case testAddDoubleDouble [cite: 724]
    public double add(double a, double b) {
        // Mengembalikan hasil penjumlahan a dan b
        return a + b;
    }

    // Method add untuk menjumlahkan tiga bilangan bulat
    // Sesuai dengan test case testAddIntIntInt [cite: 763]
    public int add(int a, int b, int c) {
        // Mengembalikan hasil penjumlahan a, b, dan c
        return a + b + c;
    }
}