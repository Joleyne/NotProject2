public class Tasks {
    private String name;
    private String description;
    private int priority;

    public Tasks(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "The Task name is " + name + '\'' +
                " the description for the task is " + description + '\'' +
                " and the priority value is " + priority;
    }
}