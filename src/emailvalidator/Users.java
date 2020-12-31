package emailvalidator;

public class Users {
	//Array of users  	
	String [] users;
	
	int nextIndex= 0;
	int arraySize= 0;
	
	//Constructor 		
	public Users(int size) {
		this.arraySize=size;
		//initializes users		
		this.users = new String[size];
		
	}
	
	// Add User method	
	public void addUser(String user) { 
		//adds users	
		this.users[this.nextIndex]=user; 
		this.nextIndex++;
		
		//not in range 
		if (this.nextIndex >= this.arraySize) {
			this.nextIndex = 0;	
			
		}
	}
	
	// Prints users method
	public void printUsers(){
		for (int i=0; i<users.length; i++) {
			System.out.println(this.users[i]);
		}
	}
	
}
