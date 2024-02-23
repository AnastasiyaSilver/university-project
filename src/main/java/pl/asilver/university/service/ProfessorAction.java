package pl.asilver.university.service;

import pl.asilver.university.entity.Professor;

public interface ProfessorAction {
    public void teach();

    void teach(Professor professor);
}
