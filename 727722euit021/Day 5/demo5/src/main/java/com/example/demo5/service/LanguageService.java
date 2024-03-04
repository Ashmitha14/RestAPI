package com.example.demo5.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo5.model.Language;
import com.example.demo5.repository.LanguageRepo;
@Service
public class LanguageService {
    @Autowired LanguageRepo repo;
    public Language post(Language l)
    {
       return repo.save(l);
    }
    public List<Language> get()
    {
        return repo.findAll();
    }
    public Optional<Language> getid(int id)
    {
        return repo.findById(id);
    }
    public Language put(int id,Language l)
    {
        Language u=repo.findById(id).orElse(null);
        if(u!=null)
        {
            u.setLanguageName(l.getLanguageName());
            u.setLanguageComplexity(l.getLanguageComplexity());
            return repo.saveAndFlush(u);
        }
        else
        return null;
    }
    public Boolean delete(int id)
    {
        repo.deleteById(id);
        return true;
    }
}