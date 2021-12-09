package com.or.model;


public class Storage {

    private final Book[] books;
    private final int[] inStock;

    public Storage(Book[] books, int[] inStock) {
        this.books = new Book[6];
        this.inStock = new int[books.length];
        }

    public void addBook(Book newBook, int amount) {
        int limitCounter = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null && inStock[i] == 0) {
                books[i] = newBook;
                inStock[i] = amount;
                System.out.println(books[i].getName() +  " has been added!");
                break;
                } else {
                limitCounter++;
            }
        }
        if (limitCounter == 6) {

            System.out.println("There is no storage available!");

        }
    }

    public void rentBook(Book book) throws NotInStockException {

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(book.getName())) {
                if (inStock[i] > 0) {
                    this.inStock[i] -= 1;
                    System.out.println(books[i].getName() + " is in stock, you can have it!");
                    System.out.println("Current stock of " + books[i].getName() + " is: " + inStock[i]);
                    break;
                } else if (inStock[i] == 0) {
                    throw new NotInStockException(book);

                }
            }

        }
    }

    public void returnBook(Book book) {

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(book.getName())) {
                inStock[i]++;
                System.out.println("Thank you ! The current stock of " + books[i] + " is: " + inStock[i]);
                return;
            }
        }
    }

    public void getInStock(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(book.getName())) {
                System.out.println("The current stock of " + books[i] + " is: " + inStock[i]);
                return;
            }
        }
    }
}
