package models;

import models.models.Person;
import models.models.School;
import models.models.Student;
import models.models.Teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        School school = new School();

        File file = new File("C:\\Users\\Dana\\IdeaProjects\\Assignment 1\\src\\models\\students.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {

            String name = scanner.next();
            String surname = scanner.next();
            int age = scanner.nextInt();
            boolean gender = scanner.next().equals("Male");

            ArrayList<Integer> grades = new ArrayList<>();
            while (scanner.hasNextInt()) {
                grades.add(scanner.nextInt());
            }

            Student student = new Student(name, surname, age, gender, grades);
            school.addMember(student);

            System.out.println(student);
            System.out.println("GPA: " + student.calculateGPA());

        }

        scanner.close();

        file = new File("C:\\Users\\Dana\\IdeaProjects\\Assignment 1\\src\\models\\teachers.txt");
        scanner = new Scanner(file);

        while (scanner.hasNext()) {

            String name = scanner.next();
            String surname = scanner.next();
            int age = scanner.nextInt();
            boolean gender = scanner.next().equals("Male");

            String subject = scanner.next();
            int yearsOfExperience = scanner.nextInt();
            int salary = scanner.nextInt();

            Teacher teacher = new Teacher(name, surname, age, gender, subject, yearsOfExperience, salary);
            school.addMember(teacher);

            if (teacher.getYearsOfExperience() > 10) {
                teacher.giveRaise(25);
            }

            System.out.println(teacher);
            System.out.println("My salary: " + teacher.getSalary());

        }

        System.out.println(school);



    }

}