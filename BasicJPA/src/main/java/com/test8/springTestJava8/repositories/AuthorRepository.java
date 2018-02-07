package com.test8.springTestJava8.repositories;

import com.test8.springTestJava8.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
