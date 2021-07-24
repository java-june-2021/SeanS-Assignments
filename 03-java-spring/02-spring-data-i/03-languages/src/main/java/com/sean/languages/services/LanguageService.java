package com.sean.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sean.languages.models.Language;
import com.sean.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository lRepo;
	
	public LanguageService(LanguageRepository repo) {
		this.lRepo = repo;
	}
	
	// Find All Languages
	public List<Language> allLanguages(){
		return this.lRepo.findAll();
	}
	
	// Find 1 Language
	public Language findLanguage(Long Id) {
		return this.lRepo.findById(Id).orElse(null);
	}
	
	// Create
	public Language createLanguage(Language newLang) {
		return this.lRepo.save(newLang);
	}
	
	// Update
	public Language updateLanguage(Language updatedLang) {
		return this.lRepo.save(updatedLang);
	}
	
	// Delete
	public void deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
	}

}
