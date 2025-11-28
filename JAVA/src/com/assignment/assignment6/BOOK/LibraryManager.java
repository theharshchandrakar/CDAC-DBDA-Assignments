package com.assignment.assignment6.BOOK;

import java.io.*;
import java.util.*;


public class LibraryManager {

    public static void main(String[] args) {
        
        File booksFile = new File("books.txt");

        createInitialFile(booksFile);

        System.out.println("--- Current Library Status ---");
        displayFileContent(booksFile);
        System.out.println("------------------------------");

        System.out.println("Attempting to issue '1984' (Reg No: 102)...");
        Book bookToIssue1 = new Book(102, "1984", false);
        issueBook(booksFile, bookToIssue1);
        System.out.println();

        System.out.println("Attempting to issue 'Pride and Prejudice' (Reg No: 103)...");
        Book bookToIssue2 = new Book(103, "Pride and Prejudice", true);
        issueBook(booksFile, bookToIssue2);
        System.out.println();
        
        System.out.println("Attempting to issue '1984' (Reg No: 102) again...");
        issueBook(booksFile, bookToIssue1);
        System.out.println();

        System.out.println("--- Final Library Status ---");
        displayFileContent(booksFile);
        System.out.println("----------------------------");
    }


    public static void issueBook(File books, Book bookToIssue) {
        List<Book> allBooks = new ArrayList<>();
        boolean bookFound = false;
        boolean wasAlreadyIssued = false;

        // Read all books from the file into a list
        try (BufferedReader reader = new BufferedReader(new FileReader(books))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                allBooks.add(Book.fromCsvString(currentLine));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Find the book and update its status in the list
        for (Book book : allBooks) {
            if (book.getRegno() == bookToIssue.getRegno()) {
                bookFound = true;
                if (book.isIssued()) {
                    wasAlreadyIssued = true;
                } else {
                    book.setIssued(true);
                }
                break; // Stop searching once found
            }
        }

        if (!bookFound) {
            System.out.println("Book with registration number " + bookToIssue.getRegno() + " not found.");
        } else if (wasAlreadyIssued) {
            System.out.println("Book already issued");
        } else {
            // If the book was successfully issued, rewrite the entire file with the updated list
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(books))) {
                for (Book book : allBooks) {
                    writer.write(book.toCsvString());
                    writer.newLine();
                }
                System.out.println("Book Issued");
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        }
    }

    
     // Creates the books.txt file with initial data if it doesn't already exist.
    public static void createInitialFile(File file) {
        if (!file.exists()) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
                writer.println("101,The Great Gatsby,false");
                writer.println("102,1984,false");
                writer.println("103,Pride and Prejudice,true");
                writer.println("104,To Kill a Mockingbird,false");
            } catch (IOException e) {
                System.out.println("An error occurred while creating the initial file.");
                e.printStackTrace();
            }
        }
    }
    

    public static void displayFileContent(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Could not read file content.");
        }
    }
}
