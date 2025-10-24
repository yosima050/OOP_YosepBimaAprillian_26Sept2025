package classRelationship;

public class Project {
    private String projectName;
    // Association: Project memiliki 'leader' (Employee)
    private Employee leader;

    // Konstruktor untuk inisialisasi nama project dan leader
    public Project(String projectName, Employee leader) {
        this.projectName = projectName;
        this.leader = leader;
    }

    // Method untuk mendapatkan nama leader
    public String getLeaderName() {
        // Mengambil nama dari objek Employee (leader)
        return this.leader.getName();
    }
}