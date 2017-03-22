
/**
 * purpose: The AddressEntry class is responsible for
 * declaring the variables which the entire 
 * program depends upon.
 * @author Bandana Kaur
 *
 */
public class AddressEntry {
	
	/**
	 * Field responsible to store the first name
	 */
	private String firstName;
	
	/**
	 * Field responsible to store the last name
	 */
	private String lastName;
	
	/**
	 * Field responsible to store the street name
	 */
	private String street;
	
	/**
	 * Field responsible to store the city name
	 */
	private String city;
	
	/**
	 * Field responsible to store the state name
	 */
	private String state;
	
	/**
	 * Field responsible to store the zip code
	 */
	private String zip;
	
	/**
	 * Field responsible to store the telephone number
	 */
	private String telephone;
	
	/**
	 * Field responsible to store the email address.
	 */
	private String email;
	
	
	/**
	 * Constructor to create AddressEntry object with all of the
	 * fields initialized by the user.
	 * @param firstName	A string entered for the first name by the user.
	 * @param lastName	A string entered for the last name by the user.
	 * @param street	A string entered for the street name by the user.
	 * @param city		A string entered for the city name by the user.
	 * @param state		A string entered for the state name by the user.
	 * @param zip		A string entered for the zip code by the user.
	 * @param telephone	A string entered for the telephone number by the user.
	 * @param email		A string entered for the email address by the user.
	 */
	public AddressEntry(String firstName, String lastName, String street, String city, String state, String zip, String telephone, String email) {
		setFirstName(firstName);
		setLastName(lastName);
		setStreet(street);
		setCity(city);
		setState(state);
		setZip(zip);
		setTelephone(telephone);
		setEmail(email);
	}
	
	/**
	 * Set method responsible to set the object's first name.
	 * @param firstName	String entered by user for first name.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Set method responsible to set the object's last name.
	 * @param lastName	String entered by user for last name.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Set method responsible to set the object's street name.
	 * @param street	String entered by user for street name.
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	
	/**
	 * Set method responsible to set the object's city name.
	 * @param city	String entered by user for city name.
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Set method responsible to set the object's state name.
	 * @param state	String entered by user for state name.
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * Set method responsible to set the object's zip code.
	 * @param zip	String entered by user for zip code.
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	/**
	 * Set method responsible to set the object's telephone number.
	 * @param telephone	String entered by user for telephone number.
	 */
	public void setTelephone(String telephone){
		this.telephone = telephone;
	}
	
	/**
	 * Set method responsible to set the object's email address.
	 * @param email	String entered by user for email address.
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Get method responsible to get the object's first name.
	 * @return	First name of object.
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Get method responsible to get the object's last name.
	 * @return	Last name of object.
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Get method responsible to get the object's street name.
	 * @return	Street name of object.
	 */
	public String getStreet() {
		return street;
	}
	
	/**
	 * Get method responsible to get the object's city name.
	 * @return	City name of object.
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Get method responsible to get the object's state name.
	 * @return	State name of object.
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * Get method responsible to get the object's zip code.
	 * @return	Zip code of object.
	 */
	public String getZip() {
		return zip;
	}
	
	/**
	 * Get method responsible to get the object's telephone number.
	 * @return	Telephone number of object.
	 */
	public String getTelephone() {
		return telephone;
	}
	
	/**
	 * Get method responsible to get the object's email address.
	 * @return	Email address of object.
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * The toString method is responsible
	 * for nicely formatting the string to print to console.
	 * @return A formatted string of all the variables the way 
	 * it is stored in a proper address book.
	 */
	public String toString() {
		String returnInfo = "";
		returnInfo = returnInfo +  getFirstName() + " ";
		returnInfo = returnInfo +  getLastName() + "\n";
		returnInfo = returnInfo +  getStreet() + "\n";
		returnInfo = returnInfo +  getCity() + ", ";
		returnInfo = returnInfo +  getState() + " ";
		returnInfo = returnInfo +  getZip() + "\n";
		returnInfo = returnInfo +  getTelephone() + "\n";
		returnInfo = returnInfo +  getEmail() + "\n";
		
		return returnInfo;
	}
	
	/**
	 * The toFile method is responsible
	 * for nicely formatting the string to save to the
	 * new file that the user wishes to save the updated address
	 * book to.
	 * @return A formatted string of all the variables the way
	 * it is stored in a proper address book.
	 */
	public String toFile() {
		String returnInfo = "";
		returnInfo = returnInfo  + getFirstName() + "\n";
		returnInfo = returnInfo  + getLastName() + "\n";
		returnInfo = returnInfo  + getStreet() + "\n";
		returnInfo = returnInfo  + getCity() + "\n";
		returnInfo = returnInfo  + getState() + "\n";
		returnInfo = returnInfo  + getZip() + "\n";
		returnInfo = returnInfo  + getTelephone() + "\n";
		returnInfo = returnInfo  + getEmail() + "\n";
		
		return returnInfo;
	}
	
}
