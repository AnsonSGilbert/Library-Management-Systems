public class LibraryAppDemo 
{
    static Book books[] = 
    {
            new Book(101, "Java", "Saravana M"),
            new Book(102, "HTML", "Rahul"),
            new Book(103, "Spring boot", "Anuraaag"),
            new Book(104, "CSS", "Ahana"),
            new Book(105, "React JS", "Sanya")
    };

    public static void main(String args[])
    {
        int service;

        while (true) 
        {
            System.out.println("\n** Library Menu **");
            System.out.println("1. Display All Books");
            System.out.println("2. Status of Particular Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Borrower Search");
            System.out.println("6. Book Details By BookId Or BookName ");
            System.out.println("7. Exit Menu");
            System.out.println("Enter the option (1-7): ");

            service = Helper.getI(); 
            String bookName = null;
            Book searchedBook = null;
            String issueToName =null;
            int bookId = 0;
            switch (service) 
            {
                case 1:
                    displayAllBook();
                    break;
                case 2:
                    System.out.println("Enter the Book Name : ");
                    bookName = Helper.getS(); 
                    searchedBook = getBookDetails(bookName); 
                

                    if (searchedBook == null) {
                        System.out.println("The Book " + bookName + " is not Available in the Library");
                    } else if (!searchedBook.getStatus()) {
                        System.out.println("The Book " + bookName + " is issued to " + searchedBook.getIssuedTo());
                    } else {
                        System.out.println("The Book " + bookName + " is available.");
                    }
                    break;
                case 3:
                    System.out.println("Enter the Book Name : ");
                    bookName = Helper.getS();
                    searchedBook = getBookDetails(bookName); 
                    if (searchedBook != null && searchedBook.getStatus()) {
                        System.out.println("The Book " + bookName + " is available.");
                        System.out.println("Enter the IssuedTo : ");
                        issueToName = Helper.getS();
                        searchedBook.setIssuedTo(issueToName);
                        searchedBook.setStatus(false);
                    } else {
                        System.out.println("The Book " + bookName + " is either not found or already issued.");
                    }
                    break;
                case 4:
                    try {
                        System.out.println("Enter the Return Book Name : ");
                        bookName = Helper.getS();
                        searchedBook = getBookDetails(bookName);
                        if (searchedBook != null && !searchedBook.getStatus()) {
                            System.out.println("The Book " + bookName + " issued to " + searchedBook.getIssuedTo() + " is returned");
                            searchedBook.setIssuedTo("Available");
                            searchedBook.setStatus(true);
                        } else {
                            System.out.println("The Book " + bookName + " is not issued or already returned.");
                        }
                    } catch (Exception e) {
                        System.out.println("Error returning book: " + e.getMessage());
                    }
                    break;
                case 5:
                    try{
                        System.out.println("Enter the IssuedTo : ");
                        issueToName = Helper.getS();
                        boolean found = false;
                        for (Book book : books) 
                        {
                            if (issueToName.equalsIgnoreCase(book.getIssuedTo()) && (!book.getStatus()) ) {
                                System.out.println(book.getBookName());
                                found = true;
                            }
                        }
                        if (!found) 
                        {
                            System.out.println("No books issued to " + issueToName);
                    }} catch (Exception e){
                        System.out.println("Error in Issuing the book: " + e.getMessage());
                    }

                        break;

                case 6:
                    try{
                    System.out.println("Searched By the BookName(1) Or BookId(2) : ");
                    int searchedBy = Helper.getI();
                    switch(searchedBy){
                        case 1:
                                System.out.println("Enter BookName To be Searched:");
                                 bookName = Helper.getS(); 
                                 searchedBook = getBookDetails(bookName);
                            break;
                        case 2:
                            System.out.println("Enter BookId To be Searched:");
                            bookId = Helper.getI(); 
                             searchedBook = getBookDetails(bookId);
                            break;
                        default:
                            System.out.println("Wrong Input");
                            break;

                    }
                     

                    if (searchedBook == null  &&  (searchedBy == 1 || searchedBy == 2)) {
                        System.out.println("The Book is not Available in the Library");
                    }else if(searchedBook != null){
                        System.out.println(searchedBook);
                    }
                }
                catch (Exception e){
                    System.out.println("Error in Searching the book :" +e.getMessage());
                }

                    break;

                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please enter a number from 1 to 6.");
                    break;
            }
        }
    }

    public static void displayAllBook() 
    {
        System.out.println("### BOOK DETAILS ###\n");

        for (Book book : books) {
            System.out.println("Book ID : " + book.getBookId());
            System.out.println("Book Name: " + book.getBookName());
            System.out.println("Author Name: " + book.getAuthorName());
            System.out.println("Status : " + (book.getStatus() ? "Available" : "Issued"));
            System.out.println("Issued To : " + (book.getIssuedTo() == null ? "Available" : book.getIssuedTo()));
            System.out.println("");
        }
    }

    public static Book getBookDetails(String bookName) 
    {
        Book availableBook = null;

        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(bookName)) {
                availableBook = book;
                break;
            }
        }

        return availableBook;
    }
    public static Book getBookDetails(int bookId) 
    {
        Book availableBook = null;

        for (Book book : books) {
            if (book.getBookId()==bookId) {
                availableBook = book;
                break;
            }
        }

        return availableBook;
    }

}