package pl.asilver.university.entity;

public class Professor implements BaseAction, ProfessorAction {
    private String professorName;
    private String studyField;
    private University university;
    private Student student;

    public Professor(University university, String professorName, String studyField, Student student) {
        this.university = university;
        this.professorName = professorName;
        this.studyField = studyField;
        this.student = student;
    }

    public Professor(University university, String professorName, String studyField) {
        this.university = university;
        this.professorName = professorName;
        this.studyField = studyField;
    }

    public Professor(String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorName() {
        return this.professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
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

    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I am professor " + getProfessorName() + " and I teach " +
                getStudyField() + " at the " + university + ". One of my students is: " + student);
    }

    @Override
    public void teach() {
        System.out.println("I teach " + getStudyField() +
                " and I love to prepare colloquia often.");
    }

    @Override
    public String toString() {
        return professorName;
    }
}
