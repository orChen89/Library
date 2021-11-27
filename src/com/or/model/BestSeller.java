package com.or.model;

import java.util.Objects;

public class BestSeller extends Book {

    private String summary;
    private int worldCopies;

    public BestSeller(int id, String name, double price, String summary, int worldCopies) {
        super(id, name, price);
        this.summary = summary;
        this.worldCopies = worldCopies;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getWorldCopies() {
        return worldCopies;
    }

    public void setWorldCopies(int worldCopies) {
        this.worldCopies = worldCopies;
    }

    @Override
    public String toString() {
        return "Book: " + "< " + name + " > " + " - " + " < " + price + " ILS > " +
                "summary : " + "< " + summary + " > " + " , " + worldCopies + " Copies sold!";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof BestSeller) {
            BestSeller best = (BestSeller) o;
            return super.equals(o);
        }return false;
    }

    }


