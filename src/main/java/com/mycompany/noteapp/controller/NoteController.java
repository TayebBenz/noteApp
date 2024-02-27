package com.mycompany.noteapp.controller;


import com.mycompany.noteapp.entity.Note;
import com.mycompany.noteapp.entity.NoteForm;
import com.mycompany.noteapp.service.ServiceInterface;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoteController {

    private final ServiceInterface serviceInterface;

    public NoteController(ServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    @GetMapping("/note")
    public List<Note> getNoteList()
    {
        return serviceInterface.getNoteList();
    }

    @PostMapping("/note/add")
    public String createNote(@ModelAttribute("note") NoteForm noteForm, Model model)
    {
        Note note = new Note(noteForm.getTitle(),noteForm.getBody());
        model.addAttribute("note",serviceInterface.addNote(note));
        return "note-created";
    }
}
