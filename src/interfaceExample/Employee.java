package interfaceExample;

// Kelas Employee 'mengimplementasikan' interface Payable
public class Employee implements Payable {
    
    // Field privat untuk menyimpan gaji
    private double salary;

    // Konstruktor untuk inisialisasi gaji
    // Sesuai dengan: new Employee(codeInputSalary)
    public Employee(double salary) {
        this.salary = salary;
    }

    // Implementasi method dari interface Payable
    // Sesuai dengan: employee.getPaymentAmount()
    @Override
    public double getPaymentAmount() {
        // Mengembalikan jumlah gaji
        return this.salary;
    }
}