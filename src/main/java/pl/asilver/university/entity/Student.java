package pl.asilver.university.entity;

import pl.asilver.university.service.BaseAction;
import pl.asilver.university.service.StudentAction;

public abstract class Student extends University implements BaseAction, StudentAction {
    private String studentName;
    private String studyField;
    private University university;

    public Student(String universityName, String studentName, String studyField) {
        super(universityName);
        this.studentName = studentName;
        this.studyField = studyField;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudyField() {
        return this.studyField;
    }

    public void setStudyField(String studyField) {
        this.studyField = studyField;
    }

    public University getUniversity() {
        return this.university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public void introduce(Student student) {
        System.out.println("Hello, my name is " + getStudentName() + " and I study "
                + getStudyField() + " at " + getUniversity() + ".");
    }

    @Override
    public void study() {
        System.out.println("I study and go to the " + getUniversity()
                + " every day to learn something new.");
    }
}
