package classRelationship;

public class Task {
    private String taskName;

    // Konstruktor untuk inisialisasi nama task
    public Task(String taskName) {
        this.taskName = taskName;
    }

    // Getter untuk nama task
    public String getTaskName() {
        // Mengembalikan nama task
        return this.taskName;
    }
}