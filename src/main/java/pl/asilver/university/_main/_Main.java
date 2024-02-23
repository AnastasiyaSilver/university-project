package pl.asilver.university._main;

import pl.asilver.university.entity.Professor;
import pl.asilver.university.entity.Student;
import pl.asilver.university.entity.University;
import pl.asilver.university.service.ProfessorService;
import pl.asilver.university.service.StudentService;

public class _Main {
    public static void main(String[] args) {
        University university1 = new University("Stanford University");
        University university2 = new University("Ohio University");
        University university3 = new University("The Univesity of Texas");
        Student student1 = new Student(university1.getUniversityName(), "John Smith", "Applied Mathematics");
        Student student2 = new Student(university2.getUniversityName(), "Amanda Gerber", "Art History");
        Student student3 = new Student(university3.getUniversityName(), "Kelly Salem", "Medical Biotechnology");
        Professor professor1 = new Professor(university1.getUniversityName(), "Michael Nowicki", "Statistics");
        Professor professor2 = new Professor(university2.getUniversityName(), "Greg Ferenz", "Greek History");
        Professor professor3 = new Professor(university3.getUniversityName(), "Joanne Corrie", "Genetics");
        StudentService.performStudentAction(student1);
        ProfessorService.performProfessorAction(professor1);
        System.out.println("________________");
        StudentService.performStudentAction(student2);
        ProfessorService.performProfessorAction(professor2);
        System.out.println("________________");
        StudentService.performStudentAction(student3);
        ProfessorService.performProfessorAction(professor3);
    }
}
