package emailvalidator;

import java.util.Scanner;

public class EmailFinder {

	public static void main(String[] args) {
		//Users IDs		
		Users currUsers = new Users (20);
		currUsers.addUser("Maria");
		currUsers.addUser("Luz");
		currUsers.addUser("tom");
		currUsers.addUser("Jose");
		currUsers.addUser("pepita");
				
		System.out.println("Provide a name to search for");
		Scanner scanner = new Scanner (System.in);
		String searchFor= scanner.nextLine();
		
		//Find a match
		boolean foundMatch = currUsers.foundMatch(searchFor);
		if (foundMatch) {
			System.out.println(searchFor +" is indeed a user");		
			
		}else {
			System.out.println(searchFor +" is not a user");	
		}	
			
	}

}
