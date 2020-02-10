package yncrea.lab06.core.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab06.core.dao.LanguageDAO;

@Service
@Transactional
public class LanguageService {
    private LanguageDAO languageDAO;

    public LanguageService(LanguageDAO languageDAO) {
        this.languageDAO = languageDAO;
    }
}
