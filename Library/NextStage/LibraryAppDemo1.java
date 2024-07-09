package con.lms.app;

import con.lms.dto.Book;
import con.lms.dto.Member;
import con.lms.dto.Staff;
import con.lms.util.Helper;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryAppDemo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            displayMenu();
            choice = Helper.getI(1, 7);
            switch (choice) {
                case 1:
                    displayAllMembers();
                    break;
                case 2:
                    displayAllBooks();
                    break;
                case 3:
                    displayAllStaff();
                    break;
                case 4:
                    issueBookToMember();
                    break;
                case 5:
                    returnBookFromMember();
                    break;
                case 6:
                    searchBook();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nLibrary Management System:");
        System.out.println("1. Display all Members");
        System.out.println("2. Display all Books");
        System.out.println("3. Display all Staff");
        System.out.println("4. Issue a Book to a Member");
        System.out.println("5. Return a Book from a Member");
        System.out.println("6. Search for a Book");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void displayAllMembers() {
        System.out.println("\nList of Members:");
        for (Member member : Library.members) {
            System.out.println(member);
        }
    }

    private static void displayAllBooks() {
        System.out.println("\nList of Books:");
        for (Book book : Library.books) {
            System.out.println(book);
        }
    }

    private static void displayAllStaff() {
        System.out.println("\nList of Staff:");
        for (Staff staff : Library.staffs) {
            System.out.println(staff);
        }
    }

    private static void issueBookToMember() {
        System.out.print("\nEnter Book ID to issue: ");
        int bookId = Helper.getI();
        System.out.print("Enter Member ID: ");
        int memberId = Helper.getI();
        System.out.print("Enter Staff ID: ");
        int staffId = Helper.getI();
        String message = Library.issueBook(bookId, memberId, staffId);
        System.out.println(message);
    }

    private static void returnBookFromMember() {
        System.out.print("\nEnter Book ID to return: ");
        int bookId = Helper.getI();
        System.out.print("Enter Member ID: ");
        int memberId = Helper.getI();
        System.out.print("Enter Staff ID: ");
        int staffId = Helper.getI();
        String message = Library.returnBook(bookId, memberId, staffId);
        System.out.println(message);
    }

    private static void searchBook() {
        System.out.print("\nEnter Book name to search: ");
        String bookName = Helper.getS();
        ArrayList<Book> searchedBooks = Library.searchBook(bookName, "bookName");
        if (searchedBooks.isEmpty()) {
            System.out.println("No books found with the name: " + bookName);
        } else {
            System.out.println("Books found:");
            for (Book book : searchedBooks) {
                System.out.println(book);
            }
        }
    }
}