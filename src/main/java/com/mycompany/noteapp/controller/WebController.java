package com.mycompany.noteapp.controller;


import com.mycompany.noteapp.entity.Note;
import com.mycompany.noteapp.entity.NoteForm;
import com.mycompany.noteapp.service.ServiceInterface;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WebController {

    private final ServiceInterface serviceInterface;

    public WebController(ServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    @RequestMapping("/home")
    public String displayHome(Model model)
    {
        List<Note> noteList = serviceInterface.getNoteList();
        if(noteList.isEmpty())
        {
            System.out.println("It's null");
            noteList.add(new Note("Six","is salah"));
        }
        model.addAttribute("notes",noteList);
        System.out.println("Im in");
        return "homePage";
    }
    @RequestMapping("/add-note")
    public void displayAddNote(@ModelAttribute("note") NoteForm noteForm)
    {
    }


}
