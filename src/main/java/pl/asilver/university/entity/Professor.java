package pl.asilver.university.entity;

import pl.asilver.university.service.BaseAction;
import pl.asilver.university.service.ProfessorAction;

public abstract class Professor extends University implements BaseAction, ProfessorAction {
    private String professorName;
    private String studyField;
    private University university;

    public Professor(String universityName, String professorName, String studyField) {
        super(universityName);
        this.professorName = professorName;
        this.studyField = studyField;
    }

    public String getProfessorName(){
        return this.professorName;
    }

    public void setProfessorName(String professorName){
        this.professorName = professorName;
    }

    public String getStudyField(){
        return this.studyField;
    }

    public void setStudyField(String studyField){
        this.studyField = studyField;
    }

    public University getUniversity(){
        return this.university;
    }

    public void setUniversity(University university){
        this.university = university;
    }

    @Override
    public void introduce(Professor professor){
        System.out.println("I am professor " + getProfessorName() + " and I teach " +
                getStudyField() + " at the " + getUniversity() + ".");
    }

    @Override
    public void teach(Professor professor){
        System.out.println("I teach " + getStudyField() +
                " and I love to prepare colloquia often.");
    }
}
