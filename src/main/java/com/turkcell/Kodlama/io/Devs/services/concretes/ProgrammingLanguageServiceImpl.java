package com.turkcell.Kodlama.io.Devs.services.concretes;

import com.turkcell.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import com.turkcell.Kodlama.io.Devs.repositories.abstracts.ProgrammingLanguageRepository;
import com.turkcell.Kodlama.io.Devs.services.abstracts.ProgrammingLanguageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageServiceImpl implements ProgrammingLanguageService {
    private ProgrammingLanguageRepository programmingLanguageRepository;

    public ProgrammingLanguageServiceImpl(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        List<ProgrammingLanguage> programmingLanguageList;
        if(programmingLanguage.getName() == null){
            throw new RuntimeException("Programlama dili boş geçilemez");
        }
        programmingLanguageList= getAll();
        for(ProgrammingLanguage _programmingLanguage: programmingLanguageList){
            if(_programmingLanguage.getName().equals(programmingLanguage.getName())){
                throw new RuntimeException("Bu isimde bit programlama dili zaten mevcut");
            }
        }
        programmingLanguageRepository.add(programmingLanguage);
    }

    @Override
    public void delete(int id) {
        ProgrammingLanguage programmingLanguage= getById(id);
    programmingLanguageRepository.delete(programmingLanguage);
    }

    @Override
    public void update(int id, String newName) {
    List<ProgrammingLanguage> programmingLanguageList= getAll();
    ProgrammingLanguage programmingLanguage= getById(id);
        for(ProgrammingLanguage _programmingLanguage: programmingLanguageList){
            if(_programmingLanguage.getName().equals(newName) && _programmingLanguage != programmingLanguage){
                throw new RuntimeException("Bu isimde bir programlama dili zaten mevcut");
            }
        }
        programmingLanguageRepository.update(id, newName);

    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage getById(int id) {

        return  programmingLanguageRepository.getById(id);
    }
}
