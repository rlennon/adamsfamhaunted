package ie.lyit.adamsfam;

public class User {

	//first name of user
	private String fname;
	
	//second name of th user
	private String sname; 
	
	//the constructor
	public User(String fname, String sname) {
		this.fname = fname;
		this.sname = sname; 
	}
	
	//get fname of the object
	public String getFname() {
		return this.fname;
	}
	
	//get the second name 
	public String getSname() {
		return this.sname;
	}
	
	
	
}
