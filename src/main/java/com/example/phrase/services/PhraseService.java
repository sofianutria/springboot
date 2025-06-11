package com.example.phrase.services;

import com.example.phrase.models.Phrase;
import com.example.phrase.repositories.PhraseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhraseService { //Para conectar con repository no hacemos una instancia porque lo estamos guardando en un objeto específico (genera acoplamiento), tenemos que inicializar por cosntructor
    private final PhraseRepository phraseRepository;

    public PhraseService(PhraseRepository phraseRepository) {
        this.phraseRepository = phraseRepository;
    }

    public List<Phrase> getAllPhrase(){
        return phraseRepository.findAll();
    }

    public Phrase addPhrase(Phrase newPhrase){
        return phraseRepository.save(newPhrase);
    }

    public Phrase getPhraseById(int id){
        return phraseRepository.findById(id).get();
    }

    public void deletePhraseById (int id){
        phraseRepository.deleteById(id);
    }

    public Phrase editPhrase (Phrase changePhrase){
        return phraseRepository.save(changePhrase);
    }
}
