package com.airhacks;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("book")
public class MicroResources {
    @GET
    public String message() {
        return "Return all books";
    }

    @GET
    public
}
