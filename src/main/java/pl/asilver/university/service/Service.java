package pl.asilver.university.service;

import pl.asilver.university.entity.BaseAction;
import pl.asilver.university.entity.ProfessorAction;
import pl.asilver.university.entity.StudentAction;

public class Service {
    public static void introduce(BaseAction entity) {
        entity.introduce();
    }

    public static void teach(ProfessorAction professor) {
        professor.teach();
    }

    public static void study(StudentAction student) {
        student.study();
    }
}
