import java.io.*;
import java.util.*;

/**
 * 
 * @author Bandana Kaur
 *
 * purpose: This class is used to create an address book application. It will be
 * calling methods from other classes within this project.
 */

public class AddressBookApplication {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		// display the menu to the user
		Menu.displayMenu();
		System.out.println();
		
	
		String choice = "";
		
		// as long as the user doesn't wish to exit
		while(!choice.equalsIgnoreCase("f"))
		{	
			choice = sc.next();
			
			
			switch(choice) {
				case "A":
				case "a": AddressBook.load();
						Menu.displayMenu();
						break;
				case "B":
				case "b": AddressBook.initAddressBookApplication();
						Menu.displayMenu();
						break;
				case "C":
				case "c": AddressBook.remove();
						Menu.displayMenu();
						break;
				case "D":
				case "d": AddressBook.find();
						Menu.displayMenu();
						break;
				case "E":
				case "e": AddressBook.list();
						Menu.displayMenu();
						break;
				case "F":
				case "f": AddressBook.saveAndQuit();
						break; 
			} 
		}
	}
}
