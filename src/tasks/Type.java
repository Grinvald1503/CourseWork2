package tasks;

public enum Type {
    WORK("личная"),
    PERSONAL("рабочая");
    private String typeTask;

    Type(String typeTask) {
        this.typeTask = typeTask;
    }

    public String getTypeTask() {
        return typeTask;
    }
}
