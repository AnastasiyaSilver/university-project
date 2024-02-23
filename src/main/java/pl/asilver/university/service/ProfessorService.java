package pl.asilver.university.service;

import pl.asilver.university.entity.Professor;

public class ProfessorService {
    public static void performProfessorAction(Professor professor){
        professor.introduce();
        professor.teach();
    }
}
