package com.airhacks;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Book createBook(final Book book);

    List<Book> getAllBooks();

    Optional<Book> getBookById(final int id);

    Optional<Book> removeBook(final int id);

    Optional<Book> updateBook(final Book book);
}
