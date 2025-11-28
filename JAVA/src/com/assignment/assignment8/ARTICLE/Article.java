package com.assignment.assignment8.ARTICLE;

import java.util.List;

public class Article {
    private int srno;
    private String subject;
    private int yearOfPublishing;
    private long noOfViews;
    private List<String> categories;

    public Article(int srno, String subject, int yearOfPublishing, long noOfViews, List<String> categories) {
        this.srno = srno;
        this.subject = subject;
        this.yearOfPublishing = yearOfPublishing;
        this.noOfViews = noOfViews;
        this.categories = categories;
    }

    public int getSrno() {
        return srno;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public long getNoOfViews() {
        return noOfViews;
    }

    public List<String> getCategories() {
        return categories;
    }

    @Override
    public String toString() {
        return "Article{" +
               "srno=" + srno +
               ", subject='" + subject + '\'' +
               ", year=" + yearOfPublishing +
               ", views=" + noOfViews +
               ", categories=" + categories +
               '}';
    }
}
