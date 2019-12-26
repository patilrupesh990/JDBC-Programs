package userlogin;
/********************************************************************************************************************************************************
 * @author Rupesh Patil
 * @version 1.0
 * @since26/12/2019
 * 
 * Purpose:Data Model For Register or Login process of user this class will work as intermediate between Application and Database
 *		   it will Store User data temporary based and store data object into database.it's also called as DTO(Data Transfer Object)
 *		   this layer should contain a simple class called Data Transfer Object(DTO) this object is just a simple mapping to the table, 
 *		   every column in the table would be a member variable in the class.main aim is to order this layer to create, modify, delete 
 *		   or search for an entity Using simple java objects rather than dealing with SQL statements and other database related commands.
 *         We want to map this table to our java code, we can do so by creating a simple class(bean) that contains the same fields.
 * 
 *  	Field:
 *  			-String First Name
 *  			-String Last Name
 *  			-String User Name
 *  			-String Last Name
 *  			-String User Name
 *  			-String Gender
 *  			-String Password
 *  			-String Address
 *  			-String City
 *  			-String State
 *  			-String PinCode
 *  			-String Contact
 ********************************************************************************************************************************************************/
public class UserDTO 
{
	private String fName;
	private String lName;
	private String uName;
	private String gender;
	private String password;
	private String address;
	private String city;
	private String state;
	private int pincode;
	private long contact;
	/**To Get Contact Of User from Object*/
	public long getContact() {
		return contact;
	}
	
	/**To Set Contact Of User*/
	public void setContact(long contact) {
		this.contact = contact;
	}
	
	/**To get Fist Name Of User*/

	public String getfName() {
		return fName;
	}
	
	/**To set Last Name Of User*/

	public void setfName(String fName) {
		this.fName = fName;
	}
	
	/**To get Last Name of User*/
	public String getlName() {
		return lName;
	}
	
	/**To Set Last Name of User*/
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	/**To get User Name of User*/
	public String getuName() {
		return uName;
	}
	
	/**To get User Name of User*/
	public void setuName(String uName) {
		this.uName = uName;
	}
	
	/**To get Gender Of User*/
	public String getGender() {
		return gender;
	}
	
	/**To set Gender Of User*/
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**To get password Of User from Object*/
	public String getPassword() {
		return password;
	}
	
	/**To	Set Password*/

	public void setPassword(String password) {
		this.password = password;
	}
	
	/**To	get 	Password*/
	public String getAddress() {
		return address;
	}
	
	/**To	Set Address*/
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**To	get City*/
	public String getCity() {
		return city;
	}
	
	/**To	Set City*/

	public void setCity(String city) {
		this.city = city;
	}
	
	/**To	get State*/

	public String getState() {
		return state;
	}
	
	/**To	Set State*/
	public void setState(String state) {
		this.state = state;
	}
	
	/**To	get PinCode*/
	public int getPincode() {
		return pincode;
	}
	
	/**To	Set PinCode*/
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
