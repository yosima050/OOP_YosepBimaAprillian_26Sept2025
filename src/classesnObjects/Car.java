

public class Car {
    private String brand;
    private String model;
    private int year;

    // Konstruktor untuk inisialisasi brand, model, dan tahun
    // Dipanggil oleh: new Car(codeInputBrand, codeInputModel, codeInputYear)
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method untuk mengembalikan informasi mobil
    // Dipanggil oleh: car.getCarInfo()
    public String getCarInfo() {
        // Menggabungkan brand, model, dan tahun sesuai format yang diharapkan
        // Contoh: "Toyota Corolla (2020)"
        return this.brand + " " + this.model + " (" + this.year + ")";
    }
}