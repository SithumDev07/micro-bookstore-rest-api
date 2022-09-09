package com.airhacks;

import java.util.Date;

public class Book {
    private int id;
    private String name;
    private int ISBN;
    private String author;
    private String published;

    public Book() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public Book(int id, String name, int ISBN, String author, String published) {
        this.id = id;
        this.name = name;
        this.ISBN = ISBN;
        this.author = author;
        this.published = published;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ISBN=" + ISBN +
                ", author='" + author + '\'' +
                ", published=" + published +
                '}';
    }
}
