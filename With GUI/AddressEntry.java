/**
 * 
 * @author Gaurav Hooda
 *Declaration of variables
 */
public class AddressEntry
{

	private String FirstName;
	private String LastName;
	private String Street;
	private String City;
	private String State;
	private String Zip;
	private String Email;
	private String Phone;

	/**
	 * 
	 * @return FirstName
	 */
	public String getFirstName() 
	{
		return FirstName;
	}
/**
 * 
 * @param firstName
 */
	public void setFirstName(String firstName)
	{
		this.FirstName = firstName;
	}
/**
 * 
 * @return LastName
 */
	public String getLastName()
	{
		return LastName;
	}
/**
 * 
 * @param lastName
 */
	public void setLastName(String lastName) 
	{
		this.LastName = lastName;
	}
/**
 * 
 * @return Street
 */
	public String getStreet() 
	{
		return Street;
	}
/**
 * 
 * @param street
 */
	public void setStreet(String street) 
	{
		this.Street = street;
	}
/**
 * 
 * @return City
 */
	public String getCity() 
	{
		return City;
	}
/**
 * 
 * @param city
 */
	public void setCity(String city) 
	{
		this.City = city;
	}
/**
 * 
 * @return State
 */
	public String getState() 
	{
		return State;
	}
/**
 * 
 * @param state
 */
	public void setState(String state)
	{
		this.State = state;
	}
/**
 * 
 * @return Zip
 */
	public String getZip()
	{
		return Zip;
	}
/**
 * 
 * @param zip
 */
	public void setZip(String zip)
	{
		this.Zip = zip;
	}
	/**
	 * 
	 * @return email
	 */
	public String getEmail() 
	{
		return Email;
	}
	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) 
	{
		this.Email = email;
	}
	/**
	 * 
	 * @return phone
	 */
	public String getPhone() 
	{
		return Phone;
	}
	/**
	 * 
	 * @param phone
	 */
	public void setPhone(String phone) 
	{
		this.Phone = phone;
	}
	/**
	 * 
	 * @param FirstName
	 * @param LastName
	 * @param Street
	 * @param City
	 * @param State
	 * @param Zip
	 * @param Email
	 * @param Phone
	 */
	public AddressEntry(String firstName, String lastName, String street, String city, String state, String zip,
			String email, String phone) 
	{
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Street = street;
		this.City = city;
		this.State = state;
		this.Zip = zip;
		this.Email = email;
		this.Phone = phone;
	}
	
	
	public AddressEntry() {
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		String result = FirstName + " " + LastName + "\n" + Street + "\n" + City + "," + State + " " + Zip + "\n"
				+ Email + "\n" + Phone + "\n";
		return result;
	}
	/**
	 * 
	 * @return result 
	 * it returns the final result
	 */
	public String toStringFile() 
	{
		String result = FirstName + "\n" +  LastName + "\n" + Street + "\n" + City + "\n" +  State + "\n" + Zip + "\n"
				+ Email + "\n" + Phone + "\n";
		return result;
	}
}
