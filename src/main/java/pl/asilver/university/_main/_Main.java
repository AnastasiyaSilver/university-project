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
        Professor professor1 = new Professor(university1, "Michael Nowicki", "Statistics", student1);

        Student student2 = new Student(university2, "Amanda Gerber", "Art History");
        Professor professor2 = new Professor(university2, "Greg Ferenz", "Greek History", student2);

        Student student3 = new Student(university3, "Kelly Salem", "Medical Biotechnology");
        Professor professor3 = new Professor(university3, "Joanne Corrie", "Genetics", student3);

        Professor professor4 = new Professor(university1, "Michael Nowicki", "Statistics");
        Student student4 = new Student(university1, "John Smith", "Applied Mathematics", professor4);

        Professor professor5 = new Professor(university2, "Greg Ferenz", "Greek History");
        Student student5 = new Student(university2, "Amanda Gerber", "Art History", professor5);

        Professor professor6 = new Professor(university3, "Joanne Corrie", "Genetics");
        Student student6 = new Student(university3, "Kelly Salem", "Medical Biotechnology", professor6);

        System.out.println("The students are introducing themselves:");
        student4.introduce();
        student4.study();
        System.out.println("");
        student5.introduce();
        student5.study();
        System.out.println("");
        student6.introduce();
        student6.study();
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
