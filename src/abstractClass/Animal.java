package abstractClass;

// Deklarasi abstract class
public abstract class Animal {
    
    /**
     * Method abstract untuk menghasilkan suara.
     * Method ini harus diimplementasikan oleh setiap subclass konkret.
     * @param name Nama yang akan dimasukkan ke dalam string suara.
     * @return String yang berisi suara binatang.
     */
    public abstract String makeSound(String name);
}