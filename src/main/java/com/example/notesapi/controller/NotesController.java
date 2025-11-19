package com.example.notesapi.controller;

import com.example.notesapi.model.Note;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/notes")
public class NotesController {
    private final AtomicLong counter = new AtomicLong();
    private final List<Note> notes = new ArrayList<>();

    @GetMapping
    public List<Note> getAllNotes() {
        return notes;
    }

    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable Long id) {
        return notes.stream()
                .filter(note -> note.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public Note createNote(@RequestBody Note noteData) {
        Note newNote = new Note(
                counter.incrementAndGet(),
                noteData.getTitle(),
                noteData.getContent()
        );
        notes.add(newNote);
        return newNote;
    }
}
