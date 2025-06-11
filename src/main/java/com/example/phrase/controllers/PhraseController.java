package com.example.phrase.controllers;

import com.example.phrase.models.Phrase;
import com.example.phrase.services.PhraseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PhraseController {
    private final PhraseService phraseService;

    public PhraseController(PhraseService phraseService) {
        this.phraseService = phraseService;
    }

    @GetMapping("/phrases")
    public List<Phrase> getAllPhrase(){
        return phraseService.getAllPhrase();
    }
    //Put es modificar y post poner uno nuevo
    @PostMapping ("/phrase") //puedo usar el mismo nombre porque son solicitudes distintas
    public void addPhrase(@RequestBody Phrase newPhrase){
        phraseService.addPhrase(newPhrase);
    }

    @GetMapping("/phrase")
    public Phrase getPhraseById(@RequestParam int id){
        return phraseService.getPhraseById(id);
    }

    @DeleteMapping ("/phrase")
    public void deletePhraseById(@RequestParam int id){
        phraseService.deletePhraseById(id);
    }

    @PutMapping ("/phrase/{id}")
    public Phrase editPhraseById(@PathVariable int id, @RequestBody Phrase changePhrase){
        changePhrase.setId(id);
        return phraseService.editPhrase(changePhrase);
    }


}
