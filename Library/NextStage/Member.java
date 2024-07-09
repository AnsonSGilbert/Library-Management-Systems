package con.lms.dto;
public class Member extends Person{
	private int maxNoOfBooks;
	private int noOfBooksBorrowed;



	public Member(){

	}
	public Member(int id, String name,String email,String mobileNo,int maxNoOfBooks){
		

        super(id,name,email,mobileNo);	
		
		this.maxNoOfBooks = maxNoOfBooks;
		
	}

	public Member(int maxNoOfBooks,int noOfBooksBorrowed){
		this.noOfBooksBorrowed = noOfBooksBorrowed;
		
		
	}

	public int getMaxNoOfBooks(){
		return maxNoOfBooks;
	}
    public void setMaxNoOfBooks(int maxNoOfBooks){
		this.maxNoOfBooks = maxNoOfBooks;
	}
	public int getNoOfBooksBorrowed(){
		return noOfBooksBorrowed;
	}

	public void setNoOfBooksBorrowed(int noOfBooksBorrowed){
		this.noOfBooksBorrowed = noOfBooksBorrowed;
	}
	

	public  String toString(){
		String output = "";
		output += "Member Id : " + getId() + "\n";
		output += "Member Name : " + getName() + "\n";
		output += "Member Mobile No : " + getMobileNo() + "\n";
		output += "Member Email : " + getEmail() + "\n";
		output += "Max No Of Books : " + getMaxNoOfBooks() + "\n";
		output += "No Of Books Borrowed : " + getNoOfBooksBorrowed() + "\n";
		
		return output;
	}

}
