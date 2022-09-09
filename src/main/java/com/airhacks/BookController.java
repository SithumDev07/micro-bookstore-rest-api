package com.airhacks;

import com.google.gson.Gson;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response allBooks(@PathParam("id") Integer id) {
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
    @Path("{id}")
    public Response removeBook(@PathParam("id") Integer id) {
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
    @Path("{id}")
    public Response updateBook(@PathParam("id") Integer id ,Book book) {
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
}
