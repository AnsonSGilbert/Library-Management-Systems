package con.lms.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import con.lms.dto.Book;
import con.lms.dto.Member;
import con.lms.dto.Staff;
import con.lms.dto.Person;


public class LibraryAppDemo {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        int choice;
        do {
            System.out.println("Welcome to Library Management System");
            System.out.println("1. Display all book details");
            System.out.println("2. Search book by author");
            System.out.println("3. Search book by name");
            System.out.println("4. Search book by category");
            System.out.println("5. List books borrowed");
            System.out.println("6. List books issued by staff");
            System.out.println("7. List all members");
            System.out.println("8. List all staff");
            System.out.println("9. Search member by name/email/mobile number");
            System.out.println("10. Search staff by name/email/mobile number");
            System.out.println("11. Prepare pay slip");
            System.out.println("12. Issue books");
            System.out.println("13. Return books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    displayAllBookDetails();
                    break;
                case 2:
                    searchBookByAuthor();
                    break;
                case 3:
                    searchBookByName();
                    break;
                case 4:
                    searchBookByCategory();
                    break;
                case 5:
                    listBooksBorrowed();
                    break;
                case 6:
                    listBooksIssuedByStaff();
                    break;
                case 7:
                    listAllMembers();
                    break;
                case 8:
                    listAllStaff();
                    break;
                case 9:
                    searchMember();
                    break;
                case 10:
                    searchStaff();
                    break;
                case 11:
                    preparePaySlip();
                    break;
                case 12:
                    issueBooks();
                    break;
                case 13:
                    returnBooks();
                    break;
                case 0:
                    System.out.println("Exiting... Thank you for using Library Management System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);
    }

    public static void displayAllBookDetails() {
        System.out.println("All Book Details:");
        for (Book book : Library.books) {
            System.out.println(book);
        }
    }

    public static void searchBookByAuthor() {
        System.out.print("Enter author name to search: ");
        String authorName = scanner.nextLine().trim();
        List<Book> booksFound = Library.searchBook(authorName, "author");
        if (booksFound.isEmpty()) {
            System.out.println("No books found for author: " + authorName);
        } else {
            System.out.println("Books found for author " + authorName + ":");
            for (Book book : booksFound) {
                System.out.println(book);
            }
        }
    }

    public static void searchBookByName() {
        System.out.print("Enter book name to search: ");
        String bookName = scanner.nextLine().trim();
        Book bookFound = Library.getBookDetails(bookName);
        if (bookFound == null) {
            System.out.println("No book found with name: " + bookName);
        } else {
            System.out.println("Book found:");
            System.out.println(bookFound);
        }
    }

    public static void searchBookByCategory() {
        System.out.print("Enter category to search: ");
        String category = scanner.nextLine().trim();
        List<Book> booksFound = Library.getBookByCategory(category);
        if (booksFound.isEmpty()) {
            System.out.println("No books found in category: " + category);
        } else {
            System.out.println("Books found in category " + category + ":");
            for (Book book : booksFound) {
                System.out.println(book);
            }
        }
    }

    public static void listBooksBorrowed() {
        System.out.print("Enter member email to list borrowed books: ");
        String memberEmail = scanner.nextLine().trim();
        List<Book> booksBorrowed = Library.getBooksByMember(memberEmail, "memberEmail");
        if (booksBorrowed.isEmpty()) {
            System.out.println("No books borrowed by member with email: " + memberEmail);
        } else {
            System.out.println("Books borrowed by member with email " + memberEmail + ":");
            for (Book book : booksBorrowed) {
                System.out.println(book);
            }
        }
    }

    public static void listBooksIssuedByStaff() {
        System.out.print("Enter staff email to list issued books: ");
        String staffEmail = scanner.nextLine().trim();
        List<Book> booksIssued = Library.getBooksByStaff(staffEmail, "staffEmail");
        if (booksIssued.isEmpty()) {
            System.out.println("No books issued by staff with email: " + staffEmail);
        } else {
            System.out.println("Books issued by staff with email " + staffEmail + ":");
            for (Book book : booksIssued) {
                System.out.println(book);
            }
        }
    }

    public static void listAllMembers() {
        System.out.println("All Members:");
        for (Member member : Library.members) {
            System.out.println(member);
        }
    }

    public static void listAllStaff() {
        System.out.println("All Staff:");
        for (Staff staff : Library.staffs) {
            System.out.println(staff);
        }
    }

    public static void searchMember() {
        System.out.print("Enter search value: ");
        String value = scanner.nextLine().trim();
        System.out.print("Enter search type (name/email/mobileNumber): ");
        String inputType = scanner.nextLine().trim();
        Person person = null;
        switch (inputType) {
            case "name":
                person = Library.searchMember(value, "memberName");
                break;
            case "email":
                person = Library.searchMember(value, "memberEmail");
                break;
            case "mobileNumber":
                person = Library.searchMember(value, "mobileNumber");
                break;
            default:
                System.out.println("Invalid search type.");
                break;
        }
        if (person == null) {
            System.out.println("No member found with " + inputType + ": " + value);
        } else {
            System.out.println("Member found:");
            System.out.println(person);
        }
    }

    public static void searchStaff() {
        System.out.print("Enter search value: ");
        String value = scanner.nextLine().trim();
        System.out.print("Enter search type (name/email/mobileNumber): ");
        String inputType = scanner.nextLine().trim();
        Person person = null;
        switch (inputType) {
            case "name":
                person = Library.searchStaff(value, "staffName");
                break;
            case "email":
                person = Library.searchStaff(value, "staffEmail");
                break;
            case "mobileNumber":
                person = Library.searchStaff(value, "staffMobileNumber");
                break;
            default:
                System.out.println("Invalid search type.");
                break;
        }
        if (person == null) {
            System.out.println("No staff found with " + inputType + ": " + value);
        } else {
            System.out.println("Staff found:");
            System.out.println(person);
        }
    }

    public static void preparePaySlip() {
        // Logic to prepare pay slip for staff
        // Implement this as per your requirements
        System.out.println("Preparing pay slip...");
    }

   


    public static void issueBooks() {
        System.out.print("Enter book ID to issue: ");
        int bookId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter member ID to issue book to: ");
        int memberId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter staff ID issuing the book: ");
        int staffId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        String message = Library.issueBook(bookId, memberId, staffId);
        System.out.println(message);
    }

    public static void returnBooks() {
        System.out.print("Enter book ID to return: ");
        int bookId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter member ID returning the book: ");
        int memberId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter staff ID accepting the return: ");
        int staffId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        String message = Library.returnBook(bookId, memberId, staffId);
        System.out.println(message);
    }
}
