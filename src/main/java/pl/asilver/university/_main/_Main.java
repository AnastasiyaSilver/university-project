package pl.asilver.university._main;

import pl.asilver.university.entity.Professor;
import pl.asilver.university.entity.Student;
import pl.asilver.university.entity.University;
import pl.asilver.university.service.StudentService;

public class _Main {
    public static void main(String[] args) {
        University university1 = new University("Stanford University");
        Student student1 = new Student(university1.getUniversityName(), "John Smith", "Applied Mathematics");
        StudentService.performStudentAction(student1);
    }
}
