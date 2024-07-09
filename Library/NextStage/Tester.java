package con.lms.test;

import java.util.ArrayList;

import con.lms.app.Library;

import con.lms.dto.*;
import con.lms.util.*;

public class Tester{
		public static void main(String args[]){

			/*	Staff s1 = new Staff(1001,"roni","992","roni@roni.org");
				Staff s2 = new Staff(1002,"bob","993","bob@bob.org");

				Member m1 = new Member(2001,"raj","882","raj@raj.org",5);

				System.out.println(s1);
				System.out.println(m1);
				System.out.println(s2);



				Book b1 = new Book(1002,"kumar","author","category");
				b1.setBookIssuedTo(m1);
				//System.out.println(b1);

				b1.setBookIssuedBy(s2);
			//	System.out.println(b1);d

				//b1.setBookReceivedBy(s1);
				System.out.println(b1);
			*/
			/*		for(Book book : Library.books ){

					System.out.println(book);
				}
			*/

			/*	Book searchedBook = Library.searchByBookCategory("stem");

				if(searchedBook == null ){
					System.out.println("category  is not available");
				}else{
					System.out.println(searchedBook);
				}
			*/

			/*

				Book searchedBook1 = Library.searchBook("stem","category");

				if(searchedBook1 == null ){
					System.out.println("category  is not available");
				}else{
					System.out.println(searchedBook1);
				}
				Book searchedBook2 = Library.searchBook("java","bookName");

				if(searchedBook2 == null ){
					System.out.println("bookName  is not available");
				}else{
					System.out.println(searchedBook2);
				}

				Book searchedBook3 = Library.searchBook("Tim","authorName");

				if(searchedBook3 == null ){
					System.out.println("authorName  is not available");
				}else{
					System.out.println(searchedBook3);
				}

				*/
	///////////////////****************************************************************
	/*
				Member searchedMember1 = Library.searchMember("hans","memberName");

				if(searchedMember1 == null){
					System.out.println("is not a Member");
				}else{
					System.out.println(searchedMember1);
				}


				Member searchedMember2 = Library.searchMember("feynman@feynman.org","memberEmail");

				if(searchedMember2 == null){
					System.out.println("is not a Member");
				}else{
					System.out.println(searchedMember2);
				}


				Member searchedMember3 = Library.searchMember("9100000013","mobileNumber");

				if(searchedMember3 == null){//mobileNumber
					System.out.println("is not a Member");
				}else{
					System.out.println(searchedMember3);
				}
	*/
	///////************************************************************************
			
				/*ArrayList<Book> borrowedBooks = Library.borrowedBooks("Raj","staffName");

				/*if(borrowedBooks1 == null){
					System.out.println("is not a Staff");
				}else{
					System.out.println(borrowedBooks1);
				}*/


				

				/*ArrayList<Book> borrowedBooks = Library.borrowedBooks("8000000012","staffMobileNumber");

				if(borrowedBooks2 == null){
					System.out.println("is not a Staff");
				}else{
					System.out.println(borrowedBooks2);
				}


				
				ArrayList<Book> borrowedBooks = Library.borrowedBooks("hal@library.org","staffEmail");

				if(borrowedBooks3 == null){
					System.out.println("is not a Staff");
				}else{
					System.out.println(borrowedBooks3);
				}
				*/


				/********************** ************************/
/*
				Library.books[0].setBookIssuedTo(Library.members[0]);
				Library.books[0].setBookIssuedBy(Library.staffs[0]);

				Library.books[1].setBookIssuedTo(Library.members[0]);
				Library.books[2].setBookIssuedTo(Library.members[1]);

				Library.books[3].setBookIssuedTo(Library.members[4]);
				Library.books[3].setBookIssuedBy(Library.staffs[1]);*/

	/*

				Book books[] = Library.getBooksByMember(Library.members[1].getPersonEmail());

				for(int i=0; i<books.length; i++){
					if(books[i] != null){
						System.out.println(books[i]);
					}
				}

				*/

	/*
				System.out.println("Using ArrayList ");


				ArrayList<Book> bookList = Library.getBooksByMember(Library.members[0].getPersonEmail(), "memberEmail");

				for(Book book : bookList){
					System.out.println(book);
				}*/

			/*	System.out.println("Using ArrayList ");


				ArrayList<Book> bookList1 = Library.getBooksByMember(Library.members[4].getPersonMobile(), "memberMobile");

				for(Book book : bookList1){
					System.out.println(book);
				}*/

//getBooksByStaff
/*
				System.out.println("using ArrayList for staff");

				ArrayList<Book> bookList2 = Library.getBooksByStaff(Library.staffs[1].getPersonMobile(),"staffMobile");

				for (Book book : bookList2){
					System.out.println(book);
				}
			/*  Book book = bookList.get(0);
				System.out.println(book);

			

				System.out.println("Book category"):
				ArrayList<Book> bookList3 = Library.getBookByCategory("programming");

					for (Book book : bookList3){
						System.out.println(book);


					}
					*/

				ArrayList<Book> books = new ArrayList<>();
        
        ArrayList<Book> borrowedBooks1 = getBooksByMember("Feynman", "memberName");
        ArrayList<Book> borrowedBooks2 = getBooksByMember("john.doe@example.com", "memberEmail");
        ArrayList<Book> borrowedBooks3 = getBooksByMember("1234567890", "mobileNumber");

        
        System.out.println("Books borrowed by John Doe (by name):");
        printBooks(borrowedBooks1);

        System.out.println("Books borrowed by john.doe@example.com (by email):");
        printBooks(borrowedBooks2);

        System.out.println("Books borrowed by 1234567890 (by mobile number):");
        printBooks(borrowedBooks3);
    }

    public static void printBooks(ArrayList<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            for (Book book : books) {
                System.out.println(book.getTitle());  
            }
        }
        System.out.println();  
    }
			





}