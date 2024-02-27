package com.mycompany.noteapp.service;

import com.mycompany.noteapp.entity.Note;

import java.util.List;

public interface ServiceInterface {

    public List<Note> getNoteList();
    public Note addNote(Note note);
}
