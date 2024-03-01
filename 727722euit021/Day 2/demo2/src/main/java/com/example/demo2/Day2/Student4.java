package com.example.demo2.Day2;

import java.util.Date;


import com.fasterxml.jackson.annotation.JsonFormat;

public class Student4 {
    String title;
    String author;
    
    @JsonFormat(pattern="yyyy-MM-dd",timezone="UTC")
    Date publicationDate;
           
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Date getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }
    public Student4(String title, String author, Date publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }
}

