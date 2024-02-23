package pl.asilver.university.service;

import pl.asilver.university.entity.Professor;

public class TeacherService {
    public static void performTeacherAction(Professor professor){
        professor.introduce();
        professor.teach();
    }
}
