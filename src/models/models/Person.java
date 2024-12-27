package models.models;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    public Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        String genderName;

        if (gender) {
            genderName = "Male";
        } else {
            genderName = "Female";
        }

        return "Hi, I am " + name + " " + surname + ", a " + age + " -year-old " + genderName + ".";
    }

    public String getName() {
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getAge() {
        return age + "old";
    }

    public boolean isGender() {
        return gender;
    }

}

