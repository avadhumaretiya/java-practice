package dev.practice.java8.dao;

import java.util.ArrayList;

public class Dao {

    private int id;
    private String name;
    private String designation;
    private String password;
    private String username;
    private int salary;
    private String location;

    public Dao(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    public Dao(String username, String password) {
        this.password = password;
        this.username = username;
    }

    public Dao(String name, String designation, int salary, String location) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.location = location;
    }

    public Dao(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Dao(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
        return getName()+","+getDesignation()+","+getSalary()+","+getLocation();
    }

    public boolean equals(Object obj){
        Dao dao=(Dao) obj;
        if(dao.getName().equals(name)&&dao.getDesignation().equals(designation)&&dao.getSalary()==salary&&dao.getLocation().equals(location)){
            return true;
        }else{
            return false;
        }
    }
}
