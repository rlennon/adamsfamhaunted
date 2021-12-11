package ie.lyit.adamsfam;

public class User {

	
	//the userId
	private int userId; 

	//the user name of the user
	private String username; 

	//the booking id
	private String bookingId;

	//the email of the user 
	private String email;

	//first name of user
	private String fname;
	
	//second name of th user
	private String sname; 

	//the password
	private String password;


	//the custom constructor
	public User(String fname, String sname, String username, String password, String bookingId, String email, int userId) {
		
		//Assign the first name
		this.fname = fname;
		
		//Assign the second name
		this.sname = sname; 

		//Assign the user name
		this.username = username;

		//Assign the booking id
		this.bookingId = bookingId;
		
		//Assign the email
		this.email = email;

		//Assign the userId
		this.userId = userId; 

		//Assign the password
		this.password = password; 
	}
	
	//get fname of the object
	public String getFname() {
		return this.fname;
	}
	
	//get the second name 
	public String getSname() {
		return this.sname;
	}

	//get Full Name
	public String getFullName(){
		//return the full name of the user
		return this.fname + " " + this.sname; 
	}

	//get the user name
	public String getUsername(){
		//return the user name of the user
		return this.username; 
	}

	//get the email
	public String getEmail(){
		//return the user name of the user
		return this.email; 
	}

	//get the bookingId
	public String getBookingId(){
		//return the user name of the user
		return this.bookingId; 
	}

	//get the userId
	public String getUserId(){
		//return the user name of the user
		return this.userId; 
	}

	//the two string method
	@Override
	public String toString(){
		return "Username: " + this.username
			   "Email: " + this.email
			   "Fullname: "+ this.getFullName()
			   "BookingId : " +  this.bookingId;
	}

	//the equals method
	@Override
	public boolean equals(User otherUsr){

		//check if the other object is an instance of user 
		if(otherUsr instanceof User)
		{
			//do nothing

		} 
		else{

			//the object is not the same instance 
			return false; 
			

		}

		//check if certians varibles are the same (Username, Email, UserID)
		if((this.username.equals(otherUsr.username)) || (this.email.equals(otherUsr.email))  || (this.UserID.equals(otherUsr.UserID)){
			//return true
			return true;

		}

		else{
			//return false
			return false;
		}



	}

	
	
	
}
