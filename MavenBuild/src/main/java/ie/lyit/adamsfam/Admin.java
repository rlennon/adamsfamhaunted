/**package DevOps
 * 
 */

/**
 * @author L00143787
 *
 */
public class Admin extends Person {
	// Passowrd for admin
	private String password;

	// boolean for admin
	private boolean admin;

	/**
	 * @param nameIn
	 * @param ageIn
	 */

	// constructor
	public Admin(String nameIn, int ageIn, String passwordIn, boolean adminIn) {
		// call Person constructor
		super(nameIn, ageIn);
		// set password
		this.password = passwordIn;
		// set admin
		this.admin = adminIn;

	}

	// return password of object
	public String getPassword() {
		return this.password;
	}

	// return admin of object
	public boolean getAdmin() {
		return admin;
	}

	// set password of object
	public void setPassword(String passwordIn) {
		this.password = passwordIn;
	}

	// set admin of object
	public void setAdmin(boolean adminIn) {
		this.admin = adminIn;
	}

	// toString method for object
	public String toString() {
		return "Name : " + this.getName() + " Age : " + this.getAge() + " Password : " + this.password + " Admin : "
				+ this.admin;
	}

	// equals method for object
	public boolean equals(Admin p) {
		if (super.equals(p) && (p.getPassword().equals(this.password)) && p.getAdmin() == this.admin)
			return true;
		else
			return false;

	}

}
