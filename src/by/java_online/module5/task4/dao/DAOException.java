package by.java_online.module5.task4.dao;

import java.io.Serial;

public class DAOException extends Exception {

    @Serial
    private static final long serialVersionUID = 2L;

    public DAOException() {
        super();
    }

    public DAOException(String message) {
        super(message);
    }

    public DAOException(String message, Exception e) {
        super(message, e);
    }

    public DAOException(Exception e) {
        super(e);
    }
}
