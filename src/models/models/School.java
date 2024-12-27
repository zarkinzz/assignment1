package models.models;

import java.util.ArrayList;

public class School {

    private ArrayList<Person> members = new ArrayList<>();

    public void addMember(Person person) {
        members.add(person);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("School members:\n");

        for (Person member : members) {
            sb.append(member).append("\n");
        }

        return sb.toString();
    }

    public ArrayList<Person> getMembers() {
        return members;
    }

}
