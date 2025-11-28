package com.assignment.assignment6.BOOK;

public class Book {
    int regno;
    String title;
    boolean isissued;

    public Book(int regno, String title, boolean isissued) {
        this.regno = regno;
        this.title = title;
        this.isissued = isissued;
    }

    public int getRegno() {
        return regno;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return isissued;
    }

    public void setIssued(boolean issued) {
        isissued = issued;
    }

    // Converts a Book object into a comma-separated string for file storage
    public String toCsvString() {
        return regno + "," + title + "," + isissued;
    }

    // Creates a Book object from a comma-separated string from the file
    public static Book fromCsvString(String csvLine) {
        String[] parts = csvLine.split(",");
        int regno = Integer.parseInt(parts[0]);
        String title = parts[1];
        boolean isissued = Boolean.parseBoolean(parts[2]);
        return new Book(regno, title, isissued);
    }
    
    @Override
    public String toString() {
        return "Book [Reg No=" + regno + ", Title='" + title + "', Issued=" + isissued + "]";
    }
}