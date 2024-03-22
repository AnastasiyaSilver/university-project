package pl.asilver.university.entity;

public class Student implements BaseAction, StudentAction {
    private String studentName;
    private String studyField;
    private University university;
    private Professor professor;

    public Student(University university, String studentName, String studyField, Professor professor) {
        this.university = university;
        this.studentName = studentName;
        this.studyField = studyField;
        this.professor = professor;
    }

    public Student(University university, String studentName, String studyField) {
        this.university = university;
        this.studentName = studentName;
        this.studyField = studyField;
    }

    public Student(String studentName) {
        this.studentName = studentName;
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

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, my name is " + studentName + " and I study "
                + studyField + " at " + university + ". My favorite professor is: " + getProfessor());
    }

    @Override
    public void study() {
        System.out.println("I study and go to the " + university
                + " every day to learn something new.");
    }

    @Override
    public String toString() {
        return studentName;
    }
}
