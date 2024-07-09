package con.lms.dto;
public class Staff extends Person{
	private int noOfIssued;
	private int noOfReceived;
	private int renumuration;



	public Staff(){

	}

	public Staff(int id, String name,String email,String mobileNo){
		super(id,name,email,mobileNo);
	}
	public Staff(int noOfIssued, int noOfReceived,int renumuration){
		this.noOfIssued = noOfIssued;
		this.noOfReceived = noOfReceived;
		this.renumuration = renumuration;

	}

	public int getNoOfIssued(){
		return noOfIssued;
	}
    public void setNoOfIssued(int noOfIssued){
		this.noOfIssued = noOfIssued;
	}
	public int getNoOfReceived(){
		return noOfReceived;
	}

	public void setNoOfReceived(int noOfReceived){
		this.noOfReceived = noOfReceived;
	}
	public int getRenumuration(){
		return renumuration;
	}

	public void setRenumuration(int renumuration){
		this.renumuration = renumuration;
	}
	

	public  String toString(){
		String output = "";
		output += "Staff Id : " + getId() + "\n";
		output += "Staff Name : " + getName() + "\n";
		output += "Staff Mobile No : " + getMobileNo() + "\n";
		output += "Staff Email : " + getEmail() + "\n";
		output += "No Of Issued for staffs : " + getNoOfIssued() + "\n";
		output += "No Of Received for staffs: " + getNoOfReceived() + "\n";
		output += "Renumuration : " + getRenumuration() + "\n";
		
		return output;
	}

}
