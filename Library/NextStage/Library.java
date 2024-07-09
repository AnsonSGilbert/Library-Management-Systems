package con.lms.app;


import java.util.ArrayList;

import con.lms.dto.Book;
import con.lms.util.Helper;
import con.lms.dto.Member;
import con.lms.dto.Staff;


public class Library{

	public static Book books[] = 
				  { new Book(1,"java","James","Programming"),
					new Book(2,"html","Tim","Programming"),
					new Book(3,"css","Hakon","Programming"),
					new Book(4,"javascript","Brendan","Programming"),
					new Book(5,"Spring","Rod","Programming"),
					new Book(6,"Thinking, Fast and Slow","Kahneman","STEM"),
					new Book(105,"react","Jordan","Programming"),
					new Book(106,"A Brief History of Time","Stephen ","STEM"),
					new Book(107,"Sapiens","Yuval ","STEM"),
					new Book(108,"Why We Sleep","Matthew ","STEM"),
					new Book(109,"java Applications","James","Programming"),
					new Book(110,"weaving the web ","Tim","Programming"),
					new Book(111,"Black hole","Stephen ","STEM"),

					};

	public static Member members[] =
							{ 	new Member(1001,"Hans","hans@hans.org","9100000011",5),
							   	new Member (1002,"Feynman","feynman@feynman.org","9100000012",5),
								new Member (1003,"Teller","teller@teller.org" ,"9100000013",5),
								new Member (1004,"Ernest","Ernest@Ernest.org" ,"9100000014",5),
								new Member (1005,"john","john@john.org" ,"9100000015",5),
								new Member (1006,"niels","niels@niels.org","9100000016",5),
								new Member (1007,"Szilard","Szilard@Szilard.org" ,"9100000017",5),
								new Member (1008,"Oppie","oppie@oppie.org" ,"9100000018",5),
								new Member (1009,"Otto","otto@otto.org" ,"9100000019",5)

								};

	public static Staff staffs[] = 
							{			new Staff (1,"Raj","raj@library.org","8000000011"),
										new Staff (2,"Kumar","kumar@library.org","8000000012"),
										new Staff (3,"bob","bob@library.org","8000000013"),
										new Staff (4,"Tom","tom@library.org","8000000014"),
										new Staff (5,"Hal","hal@library.org","8000000015")

							};




	public static Book getBookDetails(int bookId){

		Book searchedBook = null;

		try{
			for(Book book : books){	 
				if(bookId == (book.getBookId())){
						searchedBook = book;
						break;
				}
			}

		}catch(Exception e){
			System.out.println("error : Library : searchBook" + e);
		}


		return searchedBook;

	}

	public static Member getMemberDetails(int memberId){

		Member memberObj = null;

		try{
			for(Member member : members){	 
				if(memberId == (member.getId())){
						memberObj = member;
						break;
				}
			}

		}catch(Exception e){
			System.out.println("error : Library : getMemberDetails" + e);
		}


		return memberObj;

	}
	

	public static Staff getStaffDetails(int staffId){

		Staff staffObj = null;

		try{
			for(Staff staff : staffs){	 
				if(staffId == (staff.getId())){
						staffObj = staff;
						break;
				}
			}

		}catch(Exception e){
			System.out.println("error : Library : getStaffDetails" + e);
		}


		return staffObj;

	}

	public static Book getBookDetails(String value){

		Book searchedBook = null;

		try{
			for(Book book : books){	 
				if(value.equalsIgnoreCase(book.getBookName())){
						searchedBook = book;
						break;
				}
			}

		}catch(Exception e){
			System.out.println("error : Library : searchBook" + e);
		}


		return searchedBook;

	}


	public static Member searchMember(String value,String inputType){

		Member searchedMember = null;

		try{
				for(Member member : members){
					if(inputType.equals("memberName")){
						if(value.equalsIgnoreCase(member.getName())){
							searchedMember = member;
						}
						break;
					}else if(inputType.equals("memberEmail")){
							if(value.equalsIgnoreCase(member.getEmail())){
								searchedMember = member;
								break;
							}
						}
						else if(inputType.equals("mobileNumber")){

								if(value.equalsIgnoreCase(member.getMobileNo())){
									searchedMember = member;
									break;
								}
							}

				}


		}catch(Exception e){
			System.out.println("error : Library : searchMemeber" + e);

		}
		return searchedMember;

	}

		public static Staff searchStaff(String value,String inputType){

		Staff searchedStaff = null;

		try{
				for(Staff staff : staffs){
					if(inputType.equals("staffName")){
						if(value.equalsIgnoreCase(staff.getName())){
							searchedStaff = staff;
						}
						break;
					}else if(inputType.equals("staffEmail")){
							if(value.equalsIgnoreCase(staff.getEmail())){
								searchedStaff = staff;
								break;
							}
						}
						else if(inputType.equals("staffMobileNumber")){
								if(value.equalsIgnoreCase(staff.getMobileNo())){
									searchedStaff = staff;
									break;
								}
							}

				}


		}catch(Exception e){
			System.out.println("error : Library : searchStaff" + e);

		}
		return searchedStaff;

	}


	public static Book[] getBooksByMember(String memberEmail){

		Book []searchedBooks = new Book[10];
		int i = 0;

		try{

			for(Book book : books){

				if(book.getIssuedTo() != null){
					if((book.getIssuedTo()).getEmail().equalsIgnoreCase(memberEmail)){
						searchedBooks[i] = book;
						i++;
					}
				}
			}

		}catch(Exception e){
			System.out.println("error : Library : getBooksByMember : " + e);
		}

		return searchedBooks;
	}


	public static ArrayList<Book> getBooksByMember(String value, String inputType){

		ArrayList<Book> bookList = new ArrayList<Book>();
	
		try{

			for(Book book : books){
				if(inputType.equalsIgnoreCase("memberEmail")){
						if(book.getIssuedTo() != null){
							if((book.getIssuedTo()).getEmail().equalsIgnoreCase(value)){
								bookList.add(book);
							}
						}
				}else if(inputType.equalsIgnoreCase("memberMobile")){
						if (book.getIssuedTo() != null){
							if((book.getIssuedTo()).getMobileNo().equalsIgnoreCase(value)){
								bookList.add(book);
							}
						}
				}


			}

		}catch(Exception e){
			System.out.println("error : Library : getBooksByMember : " + e);
		}

		return bookList;
	}

	public static ArrayList<Book> getBooksByStaff(String value, String inputType){

		ArrayList<Book> bookList = new ArrayList<Book>();
	
		try{

			for(Book book : books){
				if(inputType.equals("staffEmail")){
						if(book.getIssuedBy() != null){
							if((book.getIssuedBy()).getEmail().equalsIgnoreCase(value)){
								bookList.add(book);
							}
						}
				}else if(inputType.equalsIgnoreCase("staffMobile")){
						if (book.getIssuedBy() != null){
							if((book.getIssuedBy()).getMobileNo().equalsIgnoreCase(value)){
								bookList.add(book);
							}
						}
				}


			}

		}catch(Exception e){
			System.out.println("error : Library : getBooksByStaff : " + e);
		}

		return bookList;
	}

	public static ArrayList<Book> getBookByCategory(String value){
		ArrayList<Book> bookList = new ArrayList<Book>();

	//	bookList = null;

		try{

			for(Book book : books){
				if(value.equalsIgnoreCase(book.getCategory())){
					bookList.add(book);
				}
				

				

			}

		}catch(Exception e){
			System.out.println("error : Library : getBookByCategory : " + e);
		}
		return bookList;
	}

	public static ArrayList<Book> searchBook(String inputValue , String inputType ){

		ArrayList <Book> bookList = new ArrayList <Book>();

			try{

				for(Book book : books){

					switch(inputType){
					case "bookName" :

								if(inputValue.equalsIgnoreCase(book.getBookName())){
									 bookList.add(book);
								}
							break;
						case "category" :

								if(inputValue.equalsIgnoreCase(book.getCategory())){
									 bookList.add(book);
								}
							break;

						case "member" :

								//System.out.println("member " + inputValue + " " + inputType);

								if (book.getIssuedTo() != null){
							       if((inputValue.equalsIgnoreCase((book.getIssuedTo()).getEmail())) ||
							       	  (inputValue.equalsIgnoreCase((book.getIssuedTo()).getMobileNo())) ||
							       	  (inputValue.equalsIgnoreCase((book.getIssuedTo()).getName()))){
							       			bookList.add(book);
							       }
								}
							break;

						case "author" :
								if(inputValue.equalsIgnoreCase(book.getAuthorName())) {
									bookList.add(book);
								}
							break;

						case "staff" :

								if (book.getIssuedBy() != null){

							       if((inputValue.equalsIgnoreCase((book.getIssuedBy()).getEmail())) ||
							       	  (inputValue.equalsIgnoreCase((book.getIssuedBy()).getMobileNo())) || 
							       	  (inputValue.equalsIgnoreCase((book.getIssuedBy()).getName())) ){
							       		bookList.add(book);
							       }
								}


							break;
					}

				}

			}catch(Exception e){
				System.out.println("Library : searchBook: " + e);
			}

			return bookList;
	}


	public static Object[] getAllDetails(String inputType){

		Object []data = null;

		try{

			switch(inputType){
				case "book" :
						data = Library.books;
					break;
				case "staff" :
						data = Library.staffs;
					break;
				case "member" :
						data = Library.members;
					break ;

			}

		}catch(Exception e){
			System.out.println("Library : getAllDetails: " + e);
		}

		return data;
	}


	public static String issueBook(int bookId, int memberId, int staffId){

				Book book = null;
				Staff staff = null;
				Member member = null;

				String message = "";

			try{

				book = getBookDetails(bookId);
				staff = getStaffDetails(staffId);
				member = getMemberDetails(memberId);

				if(book != null){

					if(book.getIssuedTo() == null){

						if(member != null){
							if(staff != null){

									if(member.getNoOfBooksBorrowed() < member.getMaxNoOfBooks()){
										book.setIssuedTo(member);
										book.setIssuedBy(staff);
										member.setNoOfBooksBorrowed(member.getNoOfBooksBorrowed() + 1);
										staff.setNoOfIssued(staff.getNoOfIssued()+1);

										message = "Book :" + book.getBookName()+ " is successfully issued to " + memberId;

									}else{
										message = "Maximum of books can be borrowed exceed for this member : " + memberId;
									}
								

							}else{

								message = "No Staff available with this staffId : " +  staffId;

							}



						}else{
							message = "No members available with this memberId : " + memberId;
						}
					}else{
						message = "Book : " + book.getBookName()  + " is already issued to " +  member.getName();
					}



				}else{
					message = "No books available with this bookId : " + bookId;
				}




			}catch(Exception e){
				System.out.println("Library : getAllDetails: " + e);
			}
			return message;

		}	
    
	    public static String returnBook(int bookId, int memberId, int staffId) {
	    Book book = null;
	    Staff staff = null;
	    Member member = null;

	    String message = "";

	    try {
	        book = getBookDetails(bookId);
	        staff = getStaffDetails(staffId);
	        member = getMemberDetails(memberId);

	        if (book != null) {
	            if (book.getIssuedTo() != null && book.getIssuedTo().getId() == memberId) {

	                book.setIssuedTo(null); 
	                book.setIssuedBy(null); 


	                if (member != null) {
	                    
	                    member.setNoOfBooksBorrowed(member.getNoOfBooksBorrowed() - 1);
	                } else {
	                    message = "No members available with this memberId : " + memberId;
	                }

	                if (staff == null) {
	                    message = "No Staff available with this staffId : " + staffId;
	                }

	                message = "Book: " + bookId + " has been successfully returned.";
	            } else {
	                message = "Book: " + bookId + " is not issued to member: " + memberId;
	            }
	        } else {
	            message = "No books available with this bookId : " + bookId;
	        }
	    } catch (Exception e) {
	        System.out.println("Library : returnBook: " + e);
	    }

	    return message;

			
		}

}