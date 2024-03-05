public class ToDoItem {
    private String description;
    private boolean isDone;

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field

    public ToDoItem(String description, boolean isDone) {
        this.description = description;
        this.isDone = false;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription() {
        this.description = description;
    }

    public boolean isDone() {
        return isDone();
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

}