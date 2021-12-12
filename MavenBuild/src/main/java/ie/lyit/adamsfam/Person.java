/**
 * 
 */

/**
 * @author L00143787
 *
 */
public class Person {
	// name for Person
	private String name;
	// age for person
	private int age;

//constructor for person 
	public Person(String nameIn, int ageIn) {
		this.name = nameIn;
		this.age = ageIn;
	}

	// return name of object
	public String getName() {
		return this.name;
	}

//return age of object
	public int getAge() {
		return this.age;
	}

//set name of object
	public void setName(String nameIn) {
		this.name = nameIn;
	}

//set age of object
	public void setAge(int ageIn) {
		this.age = ageIn;

	}

//equals method for 2 objects
	public boolean equals(Person p) {
		if (this.name.equals(p.name) && (p.age == this.age))
			return true;
		else
			return false;

	}

//toString method for object
	public String toString() {
		return "Name : " + this.name + "Age : " + this.age;
	}

}
