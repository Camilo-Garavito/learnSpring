package com.test8.springTestJava8.bootstrap;

import com.test8.springTestJava8.model.Author;
import com.test8.springTestJava8.model.Book;
import com.test8.springTestJava8.model.Publisher;
import com.test8.springTestJava8.repositories.AuthorRepository;
import com.test8.springTestJava8.repositories.BookRepository;
import com.test8.springTestJava8.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData(){
        //Harper Publisher
        Publisher harperCollings = new Publisher("Harper Collings","USA");
        publisherRepository.save(harperCollings);
        //Worx Publisher
        Publisher worx = new Publisher("Worx","USA");
        publisherRepository.save(worx);

        //Eric
        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design", "1234", harperCollings);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        //Rod
        Author rod = new Author("Rod","Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444",worx);
        eric.getBooks().add(noEJB);
        authorRepository.save(rod);
        bookRepository.save(noEJB);

    }
}
