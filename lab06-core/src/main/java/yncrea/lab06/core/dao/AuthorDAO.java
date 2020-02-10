package yncrea.lab06.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yncrea.lab06.core.entity.Author;

public interface AuthorDAO extends JpaRepository<Author, Long> {
}
