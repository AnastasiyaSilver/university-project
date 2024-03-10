package pl.asilver.university.entity;

public class Student extends University implements BaseAction, StudentAction {
    private String studentName;
    private String studyField;
    private University university;
    private Professor professor;

    public Student(String universityName, String studentName, String studyField, Professor professor) {
        super(universityName);
        this.studentName = studentName;
        this.studyField = studyField;
        this.professor = professor;
    }

    public Student(String universityName, String studentName, String studyField) {
        super(universityName);
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
                + studyField + " at " + getUniversityName() + ". My favorite professor is: " + getProfessor());
    }

    @Override
    public void study() {
        System.out.println("I study and go to the " + getUniversityName()
                + " every day to learn something new.");
    }
}
