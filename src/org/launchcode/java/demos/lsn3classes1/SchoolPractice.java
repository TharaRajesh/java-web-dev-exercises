package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student newStudent = new Student("hani", 34);
        System.out.println(newStudent.getName());
        Student kayal = new Student("kayal",23);
        Student shahan = new Student("shahan",67);
        Course english = new Course("english", "Mr.Mike");
        english.addStudent(newStudent);
        english.addStudent(kayal);
        english.addStudent(shahan);
        ArrayList<Student> roster = english.getClassRoster();
        english.printClassRoster();

    }
}
