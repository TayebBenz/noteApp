package com.mycompany.noteapp;

import com.mycompany.noteapp.core.entity.Note;
import com.mycompany.noteapp.core.repository.RepositoryInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NoteappApplication {


	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(NoteappApplication.class, args);
		RepositoryInterface repositoryInterface = applicationContext.getBean(RepositoryInterface.class);
		repositoryInterface.save(new Note("The start","And the story begins"));
	}

}
