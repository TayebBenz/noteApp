package com.mycompany.noteapp.repository;

import com.mycompany.noteapp.entity.Note;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class MemoryRepository {

    private List<Note> DB = new ArrayList<>();

//    @Override
    public List<Note> getNoteList() {
        return DB;
    }

//    @Override
    public Note addNote(Note note) {
        Note newNote = new Note(note.getTitle(),note.getBody());
        DB.add(newNote);
        return newNote;
    }
}
