package com.test8.springTestJava8.repositories;

import com.test8.springTestJava8.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
