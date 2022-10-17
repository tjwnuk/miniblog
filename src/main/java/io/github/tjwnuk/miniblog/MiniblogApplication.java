package io.github.tjwnuk.miniblog;

import io.github.tjwnuk.miniblog.Data.Entry;
import io.github.tjwnuk.miniblog.Data.EntryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiniblogApplication implements CommandLineRunner {

	@Autowired
	private EntryRepository entryRepository;
	public static void main(String[] args) {
//		private static final Logger logger =LoggerFactory.getLogger(MiniblogApplication.class);
		SpringApplication.run(MiniblogApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
