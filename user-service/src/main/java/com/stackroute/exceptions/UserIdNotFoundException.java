package com.stackroute.exceptions;

public class UserIdNotFoundException extends Exception {
    private String message;

    public UserIdNotFoundException()
    {

    }
    public UserIdNotFoundException(String message)
    {
        super(message);
        this.message=message;
    }
}
