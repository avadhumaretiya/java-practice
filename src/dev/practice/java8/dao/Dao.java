package dev.practice.java8.dao;

import java.util.ArrayList;

public class Dao {

    private int id;
    private String name;
    private String designation;

    public Dao(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String toString(){
        return "Dao class with id: "+this.id;
    }
}
