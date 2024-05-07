package com.epam.mjc;

public class NotFindStudentException extends IllegalArgumentException {
    public NotFindStudentException (String message) {
        super(message);
    }
}
