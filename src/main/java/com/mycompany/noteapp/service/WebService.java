package com.mycompany.noteapp.service;

import com.mycompany.noteapp.entity.Note;
import com.mycompany.noteapp.repository.RepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebService implements ServiceInterface {
    private final RepositoryInterface repositoryInterface;
    public WebService(RepositoryInterface repositoryInterface) {
        this.repositoryInterface = repositoryInterface;
    }

    @Override
    public List<Note> getNoteList() {
        return repositoryInterface.findAll();
    }

    @Override
    public Note addNote(Note note) {
        return repositoryInterface.save(note);
    }
}
