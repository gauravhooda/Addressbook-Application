/**
 * 
 * @author Gaurav Hooda
 *class menu prompts the user for firstName,lastName,full address and phone number
 */
public class Menu {
	public String prompt_FirstName() {
		return "Enter First Name:";
	}

	public String prompt_LastName() {
		return "Enter lastName:";
	}

	public String prompt_Street() {
		return "Enter Street:";
	}

	public String prompt_City() {
		return "Enter city:";

	}

	public String prompt_State() {
		return "Enter state:";
	}

	public String prompt_Zip() {
		return "Enter zip:";
	}

	public String prompt_Telephone() {
		return "Enter phone:";
	}

	public String prompt_Email() {
		return "Enter email:";
	}
	
	/**
	 * 
	 * @return menu options for user
	 */
	public String prompt_Menu()
	{
		return "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n"
				+"Please enter in your menu selection.\n" + "A) Loading of entries from a file."
	+"\n"+
	"B) Addition "
	+"\n"+
	"C) Removal"
	+"\n"+
	"D) Find"
	+"\n"+
	 "E) Listing" 
	+"\n"+
	"F) Quit \n"+ "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ \t\t\n";
	}
	
 
}
