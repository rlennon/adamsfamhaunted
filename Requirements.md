# Requirements 



## The list of Requiremnts


### General Requirments

* The system should take the details of the customer (first_name, last_name, email, password).

* The customer must be mapped to what they booked into houses, suites, or haunted houses.

* Details of the client should not be changed once entered by the client. 

* Admin page - where the admin can go into and perform CRUD operations on the database. 

* The customer can check what houses, suites or houses are available to them. 

* The user should not be able to input malformed data into the system (User Validation). 

* The client can log or Admin can log into the system. 

* The user when logged in they should only be able to view that data (Least Privilege).

* If the customer is new they can sign-up to the system. 

* The program should not crash if the user does not enter details.

* The program should not crash if malformed data is entered. 

* If the program cannot connect to the database the user should be notified until it establishes a connection.

* The password field should be hidden to prevent shoulder surfing. 


### Datbase Requirments

* The users in the database should have the of least privilege. 

* The database should also validate the user input for an additional layer of security. 

*  The passwords in the database should be hashed with SHA-256 and salted and must not be in plain text. 

* Relationships between tables should be set up either PK or FK.

* Database should be normalised to reduce redundancy and improve integrity. 

* The tables of the database customer, houses, suites, houses and admin.

* The output from the database or program should be escaped to add an extra layer of security Defence in Depth (DID).




