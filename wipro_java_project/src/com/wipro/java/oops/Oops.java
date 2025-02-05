package com.wipro.java.oops;

//Abstraction - Abstract class defining common attributes
abstract class Library {
 private String title;
 private String author;
 private int bookId;

 public Library(String title, String author, int bookId) {
     this.title = title;
     this.author = author;
     this.bookId = bookId;
 }

 // Abstract method to be implemented in child classes
 public abstract void displayInfo();

 // Encapsulation - Getter methods
 public String getTitle() {
     return title;
 }

 public String getAuthor() {
     return author;
 }

 public int getBookId() {
     return bookId;
 }
}

//Inheritance - Book extends Library
class Book extends Library {
 private int pages;

 public Book(String title, String author, int bookId, int pages) {
     super(title, author, bookId);
     this.pages = pages;
 }

 // Polymorphism - Overriding abstract method
 @Override
 public void displayInfo() {
     System.out.println("Book: " + getTitle() + " by " + getAuthor() + " | ID: " + getBookId() + " | Pages: " + pages);
 }
}

//Inheritance - Magazine extends Library
class Magazine extends Library {
 private int issueNumber;

 public Magazine(String title, String author, int itemId, int issueNumber) {
     super(title, author, itemId);
     this.issueNumber = issueNumber;
 }

 // Polymorphism - Overriding abstract method
 @Override
 public void displayInfo() {
     System.out.println("Magazine: " + getTitle() + " by " + getAuthor() + " | ID: " + getBookId() + " | Issue: " + issueNumber);
 }
}

//Main class
public class Oops {
 public static void main(String[] args) {
     Library book = new Book("The Alchemist", "Paulo Coelho", 101, 500);
     Library magazine = new Magazine("Vogue", "Anna Wintour", 102, 12);

     // Using polymorphism to call overridden methods
     book.displayInfo();
     magazine.displayInfo();
 }
}
