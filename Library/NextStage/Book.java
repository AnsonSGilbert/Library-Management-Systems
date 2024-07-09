package con.lms.dto;

public class Book{
	private int bookId;
	private String bookName;
	private String authorName;
	private boolean status;
	private Member issuedTo;
	private String category;
	private Staff issuedBy;
	private Staff receivedBy;

	public Book(){

	}
	
	
	public Book(int bookId,String bookName,String authorName,String category){
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.category = category;
		this.status = true;


	}

	public int getBookId(){
		return bookId;
	}

	

	public void setBookId(int bookId){
		this.bookId = bookId;
	}
	

	public String getBookName(){
		return bookName;
	}

	public void setBookName(String bookName){
		this.bookName = bookName;
	}
	public String getAuthorName(){
		return authorName;
	}
	public void setAuthorName(String authorName){
		this.authorName = authorName;
	}
	public String getCategory(){
		return category;
	}
	public void setCategory(String category){
		this.category = category;
	}
	public boolean getStatus(){
		return status;
	}
	public void setStatus(boolean status){
		this.status = status;
	}

	public Member getIssuedTo(){
	return issuedTo;
	}
	public void setIssuedTo(Member issuedTo){
		this.issuedTo = issuedTo;
	}
	public Staff getIssuedBy(){
	return issuedBy;
	}
	public void setIssuedBy(Staff issuedBy){
		this.issuedBy = issuedBy;
	}
	public Staff getReceivedBy(){
	return receivedBy;
	}
	public void setReceivedBy(Staff receivedBy){
		this.receivedBy = receivedBy;
	}



	public String getStatusByBookName(){

		String status = "";
		return status;
	}


	public  String toString(){
		String output = "";
		String issuedTo = (getIssuedTo() != null) ? (getIssuedTo()).getName() : "not issued";
		String issuedBy = (getIssuedBy() != null) ? (getIssuedBy()).getName() : " not issued";
		String receivedBy = (getReceivedBy() != null) ? (getReceivedBy()).getName() : "not received";
		output += "Book Id : " + getBookId() + "\n";
		output += "Book Name : " + getBookName() + "\n";
		output += "Book Author Name : " + getAuthorName() + "\n";
		output += "Book Category : " + getCategory() + "\n";
		output += "Book status : " + getStatus() + "\n";
		output += "Book issuedTo : " + issuedTo + "\n";
		output += "Book issuedBy : " + issuedBy + "\n";
		output += "Book receivedBy : " + receivedBy + "\n";

		return output;
	}






}