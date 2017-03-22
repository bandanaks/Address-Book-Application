import java.util.*;
import java.io.Serializable;
import java.io.*;
import javax.swing.*;

/**
 * purpose: This class is responsible for handling all the functions called by the
 * AddressBookApplication class. The functions called depend on the selection
 * the user makes when the menu is displayed.
 * @author Bandana Kaur
 *
 */
public class AddressBook implements Serializable {
	
	// TreeMap is made to store address book entries.
	static TreeMap<String, AddressEntry> aeList = new TreeMap<String, AddressEntry>();

	/**
	 * The newEntry method is responsible for taking the parameters and creating an AddressEntry
	 * object. It pushes the object on to the TreeMap, which keeps all entries sorted in 
	 * alphabetical order, by last names.
	 * @param firstName	Is the first name entered by the user.
	 * @param lastName	Is the last name entered by the user.
	 * @param street	Is the street name entered by the user.
	 * @param city		Is the city name entered by the user.
	 * @param state		Is the state name entered by the user.
	 * @param zip 		Is the zip code entered by the user.
	 * @param telephone Is the telephone number entered by the user.
	 * @param email 	Is the email address entered by the user.
	 */
	public void newEntry(String firstName, String lastName, String street, String city, String state, String zip, String telephone, String email){
	
		
		AddressEntry personInfo = new AddressEntry(firstName, lastName, street, city, state, zip, telephone, email);
		
		
		String theKey = lastName;
		theKey.toLowerCase();
		aeList.put(theKey, personInfo);
	} 
	
	
	
	/**
	 * The load method is responsible for getting the file name
	 * from the user and loading the file. It is to load and print 
	 * the address book entries within the file.
	 * @throws IOException	To handle any exceptions when an error
	 * occurs when the file is loaded.
	 */
	public static void load() throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in FileName(with path):");
		String file_name = sc.next();
		Scanner reader = new Scanner(new FileInputStream(file_name));
		ReadFile file = new ReadFile(file_name); 
		
		System.out.println("Loaded " + file.getLines() + " lines.");
		
		System.out.println("Reading address book data...");
		while (reader.hasNext()){
			String entry = reader.nextLine();
			System.out.println(entry);
		} 
		System.out.println();
	}
	
	
	
	/**
	 * The initAddressBookApplication method is responsible for adding new
	 * entries to the address book (TreeMap) after getting all needed information 
	 * from the user.
	 * 
	 */
	public static void initAddressBookApplication(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println(Menu.prompt_FirstName());
		String firstname = sc.nextLine();
		
		System.out.println(Menu.prompt_LastName());
		String lastname = sc.nextLine();
		
		System.out.println(Menu.prompt_Street());
		String street = sc.nextLine();
		
		System.out.println(Menu.prompt_City());
		String city = sc.nextLine();
		
		System.out.println(Menu.prompt_State());
		String state = sc.next();
		
		System.out.println(Menu.prompt_Zip());
		String zip = sc.next();
		
		System.out.println(Menu.prompt_Telephone());
		String telephone = sc.next();
		
		System.out.println(Menu.prompt_Email());
		String email = sc.next();
		
		
		AddressBook addBook = new AddressBook();
		addBook.newEntry(firstname, lastname, street, city, state, zip, telephone, email);
		AddressEntry a1 = new AddressEntry(firstname, lastname, street, city, state, zip, telephone, email);
		
		System.out.println("Thank you the following contact has been added to your address book:\n");
		System.out.println(a1.toString());
	}
	
	
	/**
	 * The remove method is responsible for deleting an address book 
	 * entry from the TreeMap which has been specified by the user.
	 * It gets the last name of the person whose entry is to be deleted
	 * and finds it within the book. 
	 */
	public static void remove() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter in the last name of the contact you wish to remove: ");
		String removalName = sc.nextLine();
		
		if (aeList.containsKey(removalName)) {
	
			System.out.println("Hit y to remove the following entry or n to return to main menu:");
			System.out.println();
			
			System.out.println(aeList.get(removalName));
			
			// Object of AddressEntry made in order to access the first
			// and last name of the contact through the get methods. 
			// Need this to print the names when printing the successful
			// deletion statement of contact.
			AddressEntry a1 = aeList.get(removalName);
			String firstname = a1.getFirstName();
			String lastname = a1.getLastName();
			
			// user input of whether he wishes to continue with removal of
			// contact or go back to the main menu
			String wishToRemove = sc.nextLine();
			
			
			if (wishToRemove.equalsIgnoreCase("y")) {
				aeList.remove(removalName);	
				System.out.println("You have successfully removed the " + firstname + " " + lastname + " contact.");
			}
		
			else if (wishToRemove.equalsIgnoreCase("n")) {
				System.out.println("Main Menu:");
			}
	
		}
	}
	
	
	/**
	 * The find method is responsible for looking up the entry
	 * the user wishes to see. It gets the last name of the person 
	 * and searches the address book for full contact information.
	 */
	public static void find() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in all or the beginning of the last name of the contact you wish to find: ");
		String findName = sc.nextLine();
		
		if(aeList.containsKey(findName)) {
			System.out.println("The following entries were found in the address book for a last name starting with '" + findName + "':");
			System.out.println(aeList.get(findName));
		}
		else {
			System.out.println("Contact does not exist.");
		}
	} 

	
	
	/**
	 * The list method is responsible for printing out all the entries,
	 * in alphabetical order, in the address book (TreeMap) to the user.
	 */
	public static void list(){
		
		// Loops through each key
		for(String key : aeList.keySet()){
			AddressEntry returnInfo = aeList.get(key);
			System.out.println(returnInfo.toString());
		}
	}
	
	
	/**
	 * The saveAndQuit method is responsible for asking the
	 * user the name of the file he/she wishes to save the
	 * updated address book to. It saves the new address book
	 * and quits the program.
	 * @throws IOException	To handle any exceptions when an error
	 * occurs when saving to the file.
	 */
	public static void saveAndQuit() throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter in file name of the file you wish to save your AddressBook to: ");
		String file_name = sc.nextLine();
		
		WriteFile f = new WriteFile(file_name, true);
		
		for(String key : aeList.keySet()){
			AddressEntry putInfo = aeList.get(key);
			String adrsEntry = putInfo.toFile();
			f.writeToFile(adrsEntry);
		}
		
		System.out.println("Thank you, your AddressBook has been backed up to the file '" +
		file_name + "' file. Goodbye!");
	}

}
