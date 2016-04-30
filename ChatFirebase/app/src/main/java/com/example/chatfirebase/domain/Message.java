package com.example.chatfirebase.domain;

/**
 * Created by Admin on 30/04/2016.
 */
public class Message {
    private String username;
    private String message;

    public Message() {
        // Obligatorio para Firebase
    }

    public Message(String username, String message) {
        this.username = username;
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.username + ": " + this.message;
    }
}
