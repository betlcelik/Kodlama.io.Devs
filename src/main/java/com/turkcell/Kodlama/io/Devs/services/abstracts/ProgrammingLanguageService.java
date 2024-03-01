package com.turkcell.Kodlama.io.Devs.services.abstracts;

import com.turkcell.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    void add(ProgrammingLanguage programmingLanguage);
    void delete(int id);
    void update(int id, String newName);
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id);
}
