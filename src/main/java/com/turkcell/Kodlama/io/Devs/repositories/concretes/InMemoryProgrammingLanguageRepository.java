package com.turkcell.Kodlama.io.Devs.repositories.concretes;

import com.turkcell.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import com.turkcell.Kodlama.io.Devs.repositories.abstracts.ProgrammingLanguageRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
    List<ProgrammingLanguage> programmingLanguageList = new ArrayList<>();

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
    programmingLanguageList.add(programmingLanguage);
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
    programmingLanguageList.remove(programmingLanguage);
    }

    @Override
    public void update(int id, String newName) {
        ProgrammingLanguage programmingLanguage= getById(id);
        programmingLanguage.setName(newName);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageList;
    }
    @Override
    public ProgrammingLanguage getById(int id){
       for(ProgrammingLanguage programmingLanguage:programmingLanguageList){
           if(programmingLanguage.getId()== id){
               return programmingLanguage;
           }
       }
       throw new RuntimeException("Böyle bir idye sahip kayıt yok");
    }
}
