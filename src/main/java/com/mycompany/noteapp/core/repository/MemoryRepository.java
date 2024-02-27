package com.mycompany.noteapp.core.repository;

import com.mycompany.noteapp.core.entity.Note;

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
