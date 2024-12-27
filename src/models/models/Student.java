package models.models;

import java.util.ArrayList;

public class Student extends Person {

    private static int id_generator = 0;

    private int id = id_generator++;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, String surname, int age, boolean gender, ArrayList<Integer> grades) {
        super(name, surname, age, gender);
        this.grades = grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public int calculateGPA() {
        int sum = 0;

        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }

        return sum / grades.size();
    }

    @Override
    public String toString() {
        return super.toString() + ", I am a student with ID " + id + ".";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

}
