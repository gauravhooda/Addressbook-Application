
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author Gaurav Hooda
 *
 */
public class AddressBook 
{
	private static List<AddressEntry> addressBook; // making list from constructor

	/**
	 * 
	 * @return AddressBook
	 */
	public List<AddressEntry> getAddressBook()
	{  // it returns the list from addressBook
		return addressBook;
	}

	/**
	 * 
	 * @param addressBook
	 */
	public void setAddressBook(List<AddressEntry> addressBook)
	{
		AddressBook.addressBook = addressBook;
	}

	/**
	 * making a new instance of a list
	 */
	public AddressBook()
	{

		addressBook = new LinkedList<AddressEntry>();
	}

	/**
	 * 
	 * @param addressBook
	 */
	public AddressBook(List<AddressEntry> addressBook)
	{
		this.addressBook = addressBook;
	}

	/**
	 * 
	 * @param book
	 */
	public void Add(AddressEntry book) {
		addressBook.add(book);
	}

	public void initAddressBookExercise()
	{
		AddressEntry entry = new AddressEntry("Gaurav", "Hooda", "26381 whitman st", "Hayward", "CA", "94544",
				"gauravhooda@gmail.com", "7404243221");
		addressBook.add(entry);
		AddressEntry entry1 = new AddressEntry("Naveen", "Panghal", "928 Sector 3", "Rohtak", "Haryana", "124001",
				"naveen@gmail.com", "9468451576");
		addressBook.add(entry1);
		list();
	}

	public void list()
	{
		for (AddressEntry addressEntry : addressBook) {
			System.out.println(addressEntry.toString());
		}
	}

	public void find(String FirstName)
	{
		List<String> addrss = new ArrayList<String>();
		for (AddressEntry addressEntry : addressBook) 
		{
			if (addressEntry.getFirstName().toLowerCase().matches(FirstName.toLowerCase() + ".*"))
			{
				addrss.add(addressEntry.getFirstName());
				System.out.println(addressEntry.toString());
			}
		}
	}

	/**
	 * 
	 * @param FirstName
	 */

	public void remove(String FirstName)
	{
		int i = 0;
		for (AddressEntry addressEntry : addressBook) 
		{
			if (addressEntry.getFirstName().equalsIgnoreCase(FirstName)) 
			{
				i++;
				addressBook.remove(addressEntry);
				System.out.println("You have successfuly removed this entry\n" + addressEntry.toString());
			}
		}
		if (i == 0) 
		{
			System.out.println("First Name not found..!!");

		}
	}

	/**
	 * compareTo is used to compare lastNames so as to sort them
	 * It lists the address from the addressBook in order of their sorted lastName
	 */
	public void listbyFirstName()
	{
		for (Object address : addressBook.stream().sorted((e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()))
				.toArray()) 
		{
			AddressEntry address1 = (AddressEntry) address;
			System.out.println(address1.toString());
		}
	}
}
