package classRelationship;

// Manager adalah subclass dari Employee (juga mewarisi dari Person)
public class Manager extends Employee {
    
    // Composition: Manager 'memiliki' sebuah Task
    private Task task;

    // Konstruktor memanggil superclass (Employee)
    public Manager(String name) {
        super(name);
    }

    // Setter untuk Composition [cite: 665]
    public void setTask(Task task) {
        this.task = task;
    }

    // Getter untuk Composition [cite: 667]
    public String getTaskName() {
        // Mengambil nama dari objek Task
        return this.task.getTaskName();
    }
}