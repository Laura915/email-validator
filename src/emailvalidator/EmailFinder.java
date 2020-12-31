package emailvalidator;

public class EmailFinder {

	public static void main(String[] args) {
		Users currUsers = new Users (5);
		currUsers.addUser("Maria@ex.com");
		currUsers.addUser("Luz@ex.com");
		currUsers.addUser("tom@ex.com");
		currUsers.addUser("Jose@ex.com");
		currUsers.addUser("pepita@ex.com");
		
		//Print Users
		currUsers.printUsers();
		
		
		
	}

}
