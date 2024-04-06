package pl.asilver.university._main;

import pl.asilver.university.entity.Professor;
import pl.asilver.university.entity.Student;
import pl.asilver.university.entity.University;

public class _Main {
    public static void main(String[] args) {
        University university1 = new University("Stanford University");
        University university2 = new University("Ohio University");
        University university3 = new University("Univesity of Texas");

        Student student1 = new Student(university1, "John Smith", "Applied Mathematics");
        Student student2 = new Student(university2, "Amanda Gerber", "Art History");
        Student student3 = new Student(university3, "Kelly Salem", "Medical Biotechnology");

        Professor professor1 = new Professor(university1, "Michael Nowicki", "Statistics");
        Professor professor2 = new Professor(university2, "Greg Ferenz", "Greek History");
        Professor professor3 = new Professor(university3, "Joanne Corrie", "Genetics");

        professor1.setStudent(student1);
        professor2.setStudent(student2);
        professor3.setStudent(student3);

        student1.setProfessor(professor1);
        student2.setProfessor(professor2);
        student3.setProfessor(professor3);

        System.out.println("The students are introducing themselves:");
        student1.introduce();
        student1.study();
        System.out.println("");
        student2.introduce();
        student2.study();
        System.out.println("");
        student3.introduce();
        student3.study();
        System.out.println("");
        System.out.println("The professors are introducing themselves:");
        professor1.introduce();
        professor1.teach();
        System.out.println("");
        professor2.introduce();
        professor2.teach();
        System.out.println("");
        professor3.introduce();
        professor3.teach();


    }
}
