package com.or.model;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book(1111, "Kobra", 60);
        Book book2 = new Book(1212, "Kai", 60);
        Book book3 = new Book(5877, "Pop", 60);
        Book bs1 = new BestSeller(3652,"Harry Potter", 100, "Wonderful book",5000);
        Book bs2 = new BestSeller(9854,"Matrix", 98, "Crazy",3500);
        Book bs3 = new BestSeller(2248,"Java", 120, "Interesting book",7000);


        Book [] books = {book1, book2, book3, bs1, bs2, bs3};
        int [] inStock = {2,5,3,7,9,5};

        System.out.println(bs1);
        System.out.println(bs2);
        System.out.println(bs3);

        System.out.println();

        Storage st = new Storage(books,inStock);

        st.addBook(book1, 2);
        st.addBook(book2, 5);
        st.addBook(book3, 3);
        st.addBook(bs1, 7);
        st.addBook(bs2, 9);
        st.addBook(bs3, 5);

        System.out.println("Current books and stock amounts: " + Arrays.toString(books));
        System.out.println(Arrays.toString(inStock));

        System.out.println();

       for (int i = 0; i < books.length ; i++) {
           st.getInStock(books[i]);
        }

        System.out.println();

        st.rentBook(book2);
        System.out.println();
        st.rentBook(bs3);
        System.out.println();

        for (int i = 0; i < books.length ; i++) {
            st.getInStock(books[i]);
        }

        System.out.println();
        st.returnBook(book2);
        System.out.println();

        for (int i = 0; i < books.length ; i++) {
            st.getInStock(books[i]);
        }
    }
}

