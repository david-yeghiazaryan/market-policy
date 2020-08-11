package models;

public abstract class Base {
    private static int nextId = 1;
    private int id;

    public Base() {
        setId();
    }

    private void setId() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }
}