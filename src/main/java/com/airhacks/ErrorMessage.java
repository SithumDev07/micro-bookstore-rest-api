package com.airhacks;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

public class ErrorMessage {
    private String errorMessage;
    private int statusCode;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ErrorMessage(String errorMessage, int statusCode) {
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return "error{" +
                "message='" + errorMessage + '\'' +
                ", code=" + statusCode +
                '}';
    }
}
