package com.airhacks;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Book createBook(final Book book);

    List<Book> getAllBooks();

    Optional<Book> getBookById(final int id);

    Boolean removeBook(final int id);

    Optional<Book> updateBook(final int id, final Book book);

    Boolean batchCreateBooks(final List<Book> books);
}
