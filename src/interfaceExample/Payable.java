package interfaceExample;

// Deklarasi interface
public interface Payable {
    
    /**
     * Method abstract yang harus diimplementasikan oleh kelas apapun
     * yang menggunakan interface ini (seperti kelas Employee).
     * @return jumlah pembayaran dalam bentuk double
     */
    double getPaymentAmount();
}