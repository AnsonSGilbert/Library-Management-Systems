package con.lms.dto;

public class Person{
	private int id;
	private String name;
	private String mobileNo;
	private String email;
	
	


	public Person(){

	}

	public Person(int id,String name,String mobileNo,String email){
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
		this.email = email;
		

	}

	public int getId(){
		return id;
	}
    public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getMobileNo(){
		return mobileNo;
	}
	public void setMobileno(String mobileno){
		this.mobileNo = mobileNo;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}


	public  String toString(){
		String output = "";
		output += "Book Id : " + getId() + "\n";
		output += "Book Name : " + getName() + "\n";
		output += "Book Mobile No : " + getMobileNo() + "\n";
		output += "Book Email : " + getEmail() + "\n";
	
		

		return output;
	}

}