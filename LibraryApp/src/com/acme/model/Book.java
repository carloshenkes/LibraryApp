package com.acme.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * @since 2016-05-12
 * @author carloshenkes
 */
public class Book {
    private String title;
    private ArrayList<String> authors;
    private int edition;
    private BookFormat format;
    private Date dateAdded;
    private int code;

    public Book() {
        authors = new ArrayList<>();
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded() {
        this.dateAdded = new Date();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public BookFormat getFormat() {
        return format;
    }

    public void setFormat(BookFormat format) {
        this.format = format;
    }

    public ArrayList<String> getAuthors() {

        return authors;
    }

    public void addAuthor(String name) {
        if (!name.isEmpty()) {
            authors.add(name);
        } else {
            System.out.println("Nome invalido");
        }
    }
    
}
