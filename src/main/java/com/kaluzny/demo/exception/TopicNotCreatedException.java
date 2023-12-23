package com.kaluzny.demo.exception;

public class TopicNotCreatedException extends RuntimeException{
    public TopicNotCreatedException() {
    }

    public TopicNotCreatedException(String message) {
        super(message);
    }

    public TopicNotCreatedException(String message, Throwable cause) {
        super(message, cause);
    }

    public TopicNotCreatedException(Throwable cause) {
        super(cause);
    }
}
