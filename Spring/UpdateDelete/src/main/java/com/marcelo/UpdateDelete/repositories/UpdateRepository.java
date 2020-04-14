package com.marcelo.UpdateDelete.repositories;

import java.util.List;

import org.hibernate.sql.Update;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpdateRepository extends CrudRepository<Update, Long> {
	 // this method retrieves all the books from the database
    List<Update> findAll();
    // this method finds books with descriptions containing the search string
    List<Update> findByDescriptionContaining(String search);
    // this method counts how many titles contain a certain string
    Long countByTitleContaining(String search);
    // this method deletes a book that starts with a specific title
    Long deleteByTitleStartingWith(String search);
}
