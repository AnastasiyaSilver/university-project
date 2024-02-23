package pl.asilver.university.service;

import pl.asilver.university.entity.Professor;

public interface BaseAction {
    public void introduce();

    void introduce(Professor professor);
}
