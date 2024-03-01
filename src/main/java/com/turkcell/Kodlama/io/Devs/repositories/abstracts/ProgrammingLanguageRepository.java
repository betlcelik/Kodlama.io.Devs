package com.turkcell.Kodlama.io.Devs.repositories.abstracts;

import com.turkcell.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
     void add(ProgrammingLanguage programmingLanguage);
     void delete(ProgrammingLanguage programmingLanguage);
     void update(int id, String newName);
     List<ProgrammingLanguage> getAll();
     ProgrammingLanguage getById(int id);
}
