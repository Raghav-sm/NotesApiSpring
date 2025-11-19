package com.example.notesapi.model;

public class Note {
    private Long id;
    private String title;
    private String content;

    //Constructor
    public Note(Long id, String title , String content){
        this.id = id;
        this.title = title;
        this.content = content;
    }
    public Long getId(){return id;}
    public String getTitle(){return title;}
    public String getContent(){return content;}

}