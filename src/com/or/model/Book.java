package com.or.model;

import java.util.Objects;

public class Book {

    protected int id;
    protected String name;
    protected double price;

    public Book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book: " + "< " + name + " > " + " - " + " < " + price + " ILS >";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Book) {
            Book book = (Book) o;
            return super.equals(o);
         }
         return false;
    }

    }


