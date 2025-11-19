package com.example.notesapi.service;

import com.example.notesapi.model.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class NotesService {

    private final AtomicLong counter = new AtomicLong();
    private final List<Note> notes = new ArrayList<>();

    public List<Note> getAllNotes() {
        return notes;
    }

    public Note getNoteById(Long id) {
        return notes.stream()
                .filter(note -> note.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Note createNote(Note noteData) {
        Note newNote = new Note(
                counter.incrementAndGet(),
                noteData.getTitle(),
                noteData.getContent()
        );
        notes.add(newNote);
        return newNote;
    }
}
