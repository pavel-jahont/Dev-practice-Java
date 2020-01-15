package com.gmail.jahont.pavel.SortingBubbleArrayListIteratorComparable;

public class EmployeeSortingComparable implements Comparable<EmployeeSortingComparable> {

    private int id;
    private String name, surname, position;

    public EmployeeSortingComparable(int id, String name, String surname, String position) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public int compareTo(EmployeeSortingComparable obj) {
        return this.name.compareTo(obj.name);
    }

    @Override
    public String toString() {
        return "ID: " + id + "| Name: " + name + "| Surname: " + surname + "| Position: " + position;
    }
}