package br.edu.iftm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	ItemRepository itemRepository;

	@Autowired
	CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run (String... args) throws Exception{
		Categoria c1 = new Categoria(null, "alimentos");

		Item i1 = new Item(null, "bolacha", 4.2, 2022-2-14, c1);
		Item i2 = new Item(null, "arroz", 4.2, 2022-2-14, c1);
		Item i3 = new Item(null, "feijao", 4.2, 2022-2-14, c1);
		Item i4 = new Item(null, "pão", 4.2, 2022-2-14, c1);

		categoriaRepository.save(c1);

		itemRepository.save(i1);
		itemRepository.save(i2);
		itemRepository.save(i3);
		itemRepository.save(i4);
	}

}
