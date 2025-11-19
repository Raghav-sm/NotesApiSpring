package com.example.notesapi.controller;

import com.example.notesapi.model.Note;
import com.example.notesapi.service.NotesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NotesController {

    private final NotesService notesService;

    public NotesController(NotesService notesService) {
        this.notesService = notesService;
    }

    @GetMapping
    public List<Note> getAllNotes() {
        return notesService.getAllNotes();
    }

    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable Long id) {
        return notesService.getNoteById(id);
    }

    @PostMapping
    public Note createNote(@RequestBody Note noteData) {
        return notesService.createNote(noteData);
    }
}
