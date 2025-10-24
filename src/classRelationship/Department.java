package classRelationship;

public class Department {
    private String deptName;
    // Aggregation: Department 'memiliki' seorang Manager
    private Manager manager;

    // Konstruktor untuk inisialisasi nama departemen
    public Department(String deptName) {
        this.deptName = deptName;
    }

    // Setter untuk Aggregation 
    public void setManager(Manager manager) {
        this.manager = manager;
    }

    // Getter untuk Aggregation 
    public String getManagerName() {
        // Mengambil nama dari objek Manager
        return this.manager.getName();
    }
}