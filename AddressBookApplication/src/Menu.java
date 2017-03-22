import java.util.*;

/**
 * purpose: This class is responsible for displaying the menu of selections to the user.
 * It includes methods to prompt for inputs.
 * @author Bandana Kaur
 *
 */
public class Menu {
	/**
	 * Display the selection menu to the user.
	 */
	public static void displayMenu()
	{
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Please enter in your menu selection");
		System.out.println("a) Loading From File");
		System.out.println("b) Addition");
		System.out.println("c) Removal");
		System.out.println("d) Find");
		System.out.println("e) Listing");
		System.out.println("f) Save and Quit");
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>");
		
	}
	
	/**
	 * Method to prompt for first name.
	 * @return A string asking for the first name.
	 */
	static String prompt_FirstName()
	{	return "First Name: ";	}
	
	
	/**
	 * Method to prompt for last name.
	 * @return A string asking for the last name.
	 */
	static String prompt_LastName()
	{	return "Last Name: ";	}
	
	
	/**
	 * Method to prompt for street address.
	 * @return A string asking for the street address.
	 */
	static String prompt_Street()
	{	return "Street: ";	}
	
	
	/**
	 * Method to prompt for city name.
	 * @return A string asking for the city name.
	 */
	static String prompt_City()
	{	return "City: ";	}
	
	
	/**
	 * Method to prompt for state name.
	 * @return A string asking for the state name.
	 */
	static String prompt_State()
	{	return "State: ";	}
	
	
	/**
	 * Method to prompt for zip code.
	 * @return A string asking for the zip code.
	 */
	static String prompt_Zip()
	{	return "Zip: ";	}
	
	
	/**
	 * Method to prompt for telephone number.
	 * @return A string asking for the telephone number.
	 */
	static String prompt_Telephone()
	{	return "Telephone: ";	}
	
	
	/**
	 * Method to prompt for email address.
	 * @return A string asking for the email address.
	 */
	static String prompt_Email()
	{	return "Email: ";	}
}
