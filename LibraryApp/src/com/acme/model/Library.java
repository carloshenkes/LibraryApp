package com.acme.model;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.Iterator;

public class Library implements Serializable {

    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public void addBook(Book b) {
        this.books.add(b);
    }

    public int getNumberOfBooks() {
        return books.size();
    }

    /**
     * @param l
     * @param title
     * @param code
     * @return b
     * @author carloshenkes
     */
    public static Book returnBook(Library l, String title, int code) {
        Book b = null;
        for (Iterator<Book> it = l.getBooks().iterator(); it.hasNext();) {
            if (b.getTitle().equals(title) | b.getCode() == code) {

            }
        }
        return b;
    }

    /**
     * @param b
     * @author carloshenkes
     */
    public static void getBook(Book b) {
        b.getTitle();
        ArrayList<String> authors = b.getAuthors();
        authors.toString();
        b.getEdition();
        b.getFormat();
        b.getDateAdded();
        b.getCode();
    }

}
