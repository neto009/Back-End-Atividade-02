package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	BookRepository bookRepository;

	@Autowired
	LibraryRepository libraryRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run (String... args) throws Exception{
		Library c1 = new Library(null, "Terror");

		Book i1 = new Book(null, "Livro 1", c1);
		Book i2 = new Book(null, "Livro 2", c1);
		Book i3 = new Book(null, "Livro 3", c1);
		Book i4 = new Book(null, "Livro 4", c1);

		libraryRepository.save(c1);

		bookRepository.save(i1);
		bookRepository.save(i2);
		bookRepository.save(i3);
		bookRepository.save(i4);
	}

}
