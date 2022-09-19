package com.airhacks;

public class Book {
    private int id;
    private String name;
    private int ISBN;
    private String author;
    private String published;
    private int rating;
    private String imageUrl;

    public Book() {}

    public void setId(int id) {
        this.id = id;
    }

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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Book(int id, String name, int ISBN, String author, String published, int rating, String imageUrl) {
        this.id = id;
        this.name = name;
        this.ISBN = ISBN;
        this.author = author;
        this.published = published;
        this.rating = rating;
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ISBN=" + ISBN +
                ", author='" + author + '\'' +
                ", published='" + published + '\'' +
                ", rating=" + rating +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
