package com.mycompany.noteapp;

import com.mycompany.noteapp.entity.Note;
import com.mycompany.noteapp.repository.RepositoryInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NoteappApplication {


	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(NoteappApplication.class, args);
		RepositoryInterface repositoryInterface = applicationContext.getBean(RepositoryInterface.class);
		repositoryInterface.save(new Note("The start","And the story begins"));
		repositoryInterface.save(new Note("The start","And the story begins"));
	}




}
