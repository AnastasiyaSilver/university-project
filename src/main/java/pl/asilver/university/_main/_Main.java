package pl.asilver.university._main;

import pl.asilver.university.entity.Professor;
import pl.asilver.university.entity.Student;
import pl.asilver.university.entity.University;

public class _Main {
    public static void main(String[] args) {
        University university1 = new University("Stanford University");
        University university2 = new University("Ohio University");
        University university3 = new University("The Univesity of Texas");

        Student student1 = new Student("John Smith");
        Professor professor = new Professor(university1, "Michael Nowicki", "Statistics", student1);

        professor.introduce();

//        Student student1 = new Student(university1.getUniversityName(), "John Smith", "Applied Mathematics");
//        Professor professor1 = new Professor(university1, "Michael Nowicki", "Statistics", student1);
//
//        Student student2 = new Student(university2.getUniversityName(), "Amanda Gerber", "Art History");
//        Professor professor2 = new Professor(university2, "Greg Ferenz", "Greek History", student2);
//
//        Student student3 = new Student(university3.getUniversityName(), "Kelly Salem", "Medical Biotechnology");
//        Professor professor3 = new Professor(university3, "Joanne Corrie", "Genetics", student3);
//
//        Professor professor4 = new Professor(university1.getUniversityName(), "Michael Nowicki", "Statistics");
//        Student student4 = new Student(university1.getUniversityName(), "John Smith", "Applied Mathematics", professor4);
//
//        Professor professor5 = new Professor(university2.getUniversityName(), "Greg Ferenz", "Greek History");
//        Student student5 = new Student(university2.getUniversityName(), "Amanda Gerber", "Art History", professor5);
//
//        Professor professor6 = new Professor(university3.getUniversityName(), "Joanne Corrie", "Genetics");
//        Student student6 = new Student(university3.getUniversityName(), "Kelly Salem", "Medical Biotechnology", professor6);

    }
}
