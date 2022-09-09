package com.airhacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookServiceImpl implements BookService{

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
    public Optional<Book> removeBook(int id) {
        for(Book b: books) {
            if(b.getId() == id) {
                return Optional.of(books.remove(id));
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Book> updateBook(Book book) {
        for(Book b: books) {
            if(book.getId() == book.getId()) {
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
