package dev.practice.corejava.collections.setintroduction.storeobjectsdao;

public class StoreObjectsDao {

    private int id;
    private String name;
    private String surname;
    private boolean married;

    public StoreObjectsDao(int id, String name, String surname, boolean married) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.married = married;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
