package polymorphism;

// Superclass (dibuat abstract)
public abstract class Shape {
    
    /**
     * Method abstract untuk diimplementasikan oleh subclass.
     * Setiap bentuk (Shape) harus memiliki cara menghitung luas (Area).
     * @return luas dari bentuk (double)
     */
    public abstract double getArea();
}