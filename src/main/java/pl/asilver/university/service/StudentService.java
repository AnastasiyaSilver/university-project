package pl.asilver.university.service;

import pl.asilver.university.entity.Professor;
import pl.asilver.university.entity.Student;

public class StudentService {
    public static void performStudentAction(Student student) {
        student.introduce();
        student.study();
    }
}
