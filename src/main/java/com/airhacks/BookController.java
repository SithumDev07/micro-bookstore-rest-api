package com.airhacks;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.http.HTTPException;
import java.util.List;

@Path("book")
public class BookController {
    @Inject
    private BookService bookService;

    @GET
    @Path("all")
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Book> message() {
        return bookService.getAllBooks();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Book createBook(Book book) {
        bookService.createBook(book);
        return book;
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book allBooks(@PathParam("id") Integer id) {
        if(bookService.getBookById(id).isPresent()) {
            return bookService.getBookById(id).get();
        }
        throw new HTTPException(404);
    }

    @DELETE
    @Path("{id}")
    public Book removeBook(@PathParam("id") Integer id) {
        if(bookService.removeBook(id).isPresent()) {
            return bookService.removeBook(id).get();
        }
        throw new HTTPException(404);
    }

    @PUT
    @Path("{id}")
    public Book updateBook(Book book) {
        if(bookService.updateBook(book).isPresent()) {
            return bookService.updateBook(book).get();
        }
        throw new HTTPException(404);
    }
}
