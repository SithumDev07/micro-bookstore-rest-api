package com.airhacks;

import com.google.gson.Gson;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("book")
public class BookController {
    @Inject
    private BookService bookService;

    @GET
    @Path("all")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response message() {
        return Response
                .ok(new Gson().toJson(bookService.getAllBooks()), MediaType.APPLICATION_JSON)
                .build();
    }

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    public Response allBooks(@QueryParam("id") Integer id) {
        if(bookService.getBookById(id).isPresent()) {
            return Response
                    .ok(new Gson().toJson(bookService.getBookById(id).get()), MediaType.APPLICATION_JSON)
                    .build();
        }
        return Response
                .status(Response.Status.NOT_FOUND)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createBook(Book book) {
        bookService.createBook(book);
        return Response
                .status(Response.Status.CREATED)
                .build();
    }

    @DELETE
    public Response removeBook(@QueryParam("id") Integer id) {
        if(bookService.removeBook(id)) {
            return Response
                    .status(Response.Status.ACCEPTED)
                    .build();
        }
        return Response
                .status(Response.Status.BAD_REQUEST)
                .build();
    }

    @PUT
    public Response updateBook(@QueryParam("id") Integer id ,Book book) {
        if(bookService.updateBook(id, book).isPresent()) {
            bookService.updateBook(id, book);
            return Response
                    .status(Response.Status.ACCEPTED)
                    .build();
        }
        return Response
                .status(Response.Status.BAD_REQUEST)
                .build();
    }

    @POST
    @Path("batch")
    public Response batchCreateBooks(List<Book> books) {
        Boolean isSaved = bookService.batchCreateBooks(books);
        if(isSaved) {
            return Response.accepted().build();
        } return Response.status(Response.Status.BAD_REQUEST).build();
    }
}
