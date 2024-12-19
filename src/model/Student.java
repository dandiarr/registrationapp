package model;

import java.util.*;

public class Student extends Person implements Evaluation {

    private double average;                                             // Student class can also have its own attributes

    private final List<Course> courses = new ArrayList<>();             // Student has a list of courses that he/ she attends

    private final Map<String, Course> approvedCourses = new HashMap<>();// Student has a list of approved courses that he/ she attends

    public Student(String id, String name, String email, Date DOB) {
        super(id, name, email, DOB);
        average = 0.0;
    }

    public Student(String id, String name, String email, Date DOB, double average) {
        super(id, name, email, DOB);
        this.average = average;
    }

    // Q: If I DO NOT override the toString method in Student class, which toString() method would Student class be using?
    // Ans: Inherit and use the toString() method from the parent class (Person)

    // Q: What is the keyword super used for in Student class?
    // Ans: Referencing the
    @Override
    public String toString() {
        return String.format(
                "{id: %d, name: %s, email: %s, DOB: %s, average GPA: %.2f}",
                super.getId(),
                super.getName(),
                super.getEmail(),
                super.getDOB(),
                this.average
        );
    }
    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;

    }

    public void enrollToCourse(Course course) {
        //TODO
    }

    public void registerApproveCourses() {
        //TODO
    }

    public boolean isCourseApproved(Course course) {
        // TODO
        return false;
    }

    @Override
    public List<Course> getApprovedCourses() {
        return null;
    }
}
