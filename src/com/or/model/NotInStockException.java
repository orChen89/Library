package com.or.model;

public class NotInStockException  extends Exception {

        public NotInStockException(Book book) {

        super("The book " + book.toString() + " is not in stock currently!");

    }

}
