package con.lms.test;
import java.util.ArrayList;

import con.lms.dto.*;
import con.lms.util.*;
import con.lms.app.Library;

public class Test {

	public static void main(String args[])
	{
		/*Staff s1 = new Staff(101,"asd","123444","sdf");
		//System.out.println(s1);

		Staff s2 = new Staff(3,2);
		//System.out.println(s2);

		Member m1 = new Member(101,"asd","123444","sdf",22);
		//System.out.println()

		Member m2 = new Member();
		*/
		

		Library.books[0].setIssuedTo(Library.members[0]);
			Library.books[0].setIssuedBy(Library.staffs[0]);

			Library.books[1].setIssuedTo(Library.members[0]);
			Library.books[2].setIssuedTo(Library.members[1]);

			Book books[] = Library.getBooksByMember(Library.members[1].getEmail(), "memberEmail");

			ArrayList<Book> books = Library.getBooksByMember(Library.members[1].getEmail(), "memberEmail");



			for(int i=0; i<books.length; i++){
				if(books[i] != null){
					System.out.println(books[i]);
				}
			}


			/*System.out.println("Using ArrayList ");


			ArrayList<Book> bookList = Library.getBooksByMember(Library.members[0].getEmail(), "memberEmail");

			for(Book book : bookList){
				System.out.println(book);
			}*/

			ArrayList<Book> borrowedBooks1 = Library.getBooksByMember("Hans", "memberName");
        ArrayList<Book> borrowedBooks2 = Library.getBooksByMember("hans@hans.org", "memberEmail");
        ArrayList<Book> borrowedBooks3 = Library.getBooksByMember("9100000011", "mobileNumber");

        
        System.out.println("Books borrowed by Hans (by name):");
        printBooks(borrowedBooks1);

        System.out.println("Books borrowed by hans@hans.org (by email):");
        printBooks(borrowedBooks2);

        System.out.println("Books borrowed by 9100000011 (by mobile number):");
        printBooks(borrowedBooks3);
    }

    public static void printBooks(ArrayList<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            for (Book book : books) {
                
                System.out.println(book.getBookName());
            }
        }
        System.out.println();



			


		
    }
}
