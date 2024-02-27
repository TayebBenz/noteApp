package com.mycompany.noteapp.core.service;


import com.mycompany.noteapp.core.entity.Note;
import com.mycompany.noteapp.core.entity.NoteObj;

import java.util.List;

public interface ServiceInterface {

    public Note editNoteById(Long id, NoteObj note);
    public List<Note> getNoteList();
    public Note addNote(Note note);
    public Long deleteNote(Long id);
    public Note getNote(Long id);
}
