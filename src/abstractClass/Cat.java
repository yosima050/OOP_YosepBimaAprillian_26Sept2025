package abstractClass;

// Cat meng-extend Animal dan mengimplementasikan makeSound.
// Penjelasan singkat:
// - Implementasi berbeda dari Dog, tetapi tetap memenuhi kontrak yang sama.
public class Cat extends Animal {
    @Override
    public String makeSound(String name) {
        // Mengembalikan string berformat "<name> says Meow!"
        return name + " says Meow!";
    }
}