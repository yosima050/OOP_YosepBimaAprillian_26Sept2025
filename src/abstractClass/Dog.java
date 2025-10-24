package abstractClass;

// Dog meng-extend Animal dan menyediakan implementasi konkret untuk makeSound.
// Penjelasan:
// - Karena Animal.makeSound adalah abstract, Dog wajib mengimplementasikannya.
// - Anotasi @Override membantu memastikan tanda tangan method sesuai superclass.
public class Dog extends Animal {
    @Override
    public String makeSound(String name) {
        // Mengembalikan string berformat "<name> says Woof!"
        // Ini adalah implementasi konkret dari kontrak di Animal.
        return name + " says Woof!";
    }
}