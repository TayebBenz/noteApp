package com.mycompany.noteapp.repository;

import com.mycompany.noteapp.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryInterface extends JpaRepository<Note,Long> {
//
//    public List<Note> getNoteList();
//    public Note addNote(Note note);


}
