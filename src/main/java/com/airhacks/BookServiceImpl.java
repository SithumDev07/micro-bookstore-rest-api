package com.airhacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookServiceImpl implements BookService {

    private static List<Book> books = new ArrayList<>();

    @Override
    public Book createBook(Book book) {
        books.add(book);
        return book;
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public Optional<Book> getBookById(int id) {
        for(Book b : books) {
            if(b.getId() == id) {
                return Optional.of(b);
            }
        }
        return Optional.empty();
    }

    @Override
    public Boolean removeBook(int id) {
        for(Book b: books) {
            if(b.getId() == id) {
                if(books.remove(b)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Optional<Book> updateBook(int id, Book book) {
        for(Book b: books) {
            if(book.getId() == id) {
                b.setName(book.getName());
                b.setISBN(book.getISBN());
                b.setAuthor(book.getAuthor());
                b.setPublished(book.getPublished());
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }
}
