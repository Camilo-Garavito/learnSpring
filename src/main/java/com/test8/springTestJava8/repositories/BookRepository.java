package com.test8.springTestJava8.repositories;

import com.test8.springTestJava8.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
