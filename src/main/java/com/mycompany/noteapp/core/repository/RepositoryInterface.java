package com.mycompany.noteapp.core.repository;

import com.mycompany.noteapp.core.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryInterface extends JpaRepository<Note,Long> {
//
//    public List<Note> getNoteList();
//    public Note addNote(Note note);


}
