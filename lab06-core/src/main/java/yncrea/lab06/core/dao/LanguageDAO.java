package yncrea.lab06.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yncrea.lab06.core.entity.Language;

public interface LanguageDAO extends JpaRepository<Language,Long> {
}
