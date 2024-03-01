package com.turkcell.Kodlama.io.Devs.controllers;

import com.turkcell.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import com.turkcell.Kodlama.io.Devs.services.abstracts.ProgrammingLanguageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/programmingLangauges")
public class ProgrammingLangaugeController {

    private ProgrammingLanguageService  programmingLanguageService;

    public ProgrammingLangaugeController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @PostMapping
    public void add(@RequestBody ProgrammingLanguage programmingLanguage){
         this.programmingLanguageService.add(programmingLanguage);
    }
    @DeleteMapping
    public void delete(int id){
        this.programmingLanguageService.delete(id);
    }
    @PutMapping
    public void update(int id, String newName){
        this.programmingLanguageService.update(id,newName);
    }
    @GetMapping
    public List<ProgrammingLanguage> getAll(){
        return this.programmingLanguageService.getAll();
    }
    @GetMapping("/getById")
    public ProgrammingLanguage getById(@RequestParam int id){
        return this.programmingLanguageService.getById(id);
    }
}
