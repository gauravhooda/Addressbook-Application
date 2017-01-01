import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
/**
 * @author Gaurav Hooda         
 * @since October,2016
 * It represents AddressBook Console Application
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.sql.*;

public class AddressBookApplication{
	private static Scanner abapp; // to get the input in console application

	public static AddressBook book = new AddressBook(); // makes new instance of AddressBook

	/**
	 * 
	 * @param args
	 * @throws IOException
	 * Main of the whole console
	 */
	
			

		
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		
		Class.forName ("oracle.jdbc.OracleDriver"); // toad table calling code start
		Connection conn = 
				DriverManager.getConnection("jdbc:oracle:thin:be9248/xRXp5_17@mcsdb1.sci.csueastbay.edu:1521/MCSDB1");
		Statement stmt = conn.createStatement ();
		ResultSet rset = stmt.executeQuery("SELECT * FROM ADDRESSENTRYTABLE");
		System.out.println(rset);
		while (rset.next ()) //get next row of table returned

		{         for(int i=1; i<=rset.getMetaData().getColumnCount(); i++) //visit each column

		System.out.print(rset.getString(i) + " | ");

		System.out.println(" ");

		System.out.println("========================================");

		}
		rset.close();

		stmt.close();

		conn.close();  //toad code ends

		/*AddressBook AB = new AddressBook();
			
		AB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AB.setSize(500,500);
		AB.setVisible(true);
*/	
		entry e=new entry();
		e.entry();

    Menu();
	}

	int total = 0;
	public static String FileName = "abapp.txt"; // setting a FileName by default

	/**
	 * 
	 * @param FileName
	 * @throws IOException
	 * Menu method to handle all the menu option for user.
	 */
	public static void Menu() 
	{ 

		Menu menu = new Menu();

		System.out.println(menu.prompt_Menu());
		abapp = new Scanner(System.in);
		String Choice = abapp.nextLine();
		System.out.println("You selected : " +Choice);
		//switch Choice to select from the given menu
		
		String path= new Scanner(System.in).next();
		
		switch (Choice)
		{
		case "A":
			
			File file = new File("abapp.txt");
			String contents = null;
			try {
				contents = new Scanner(file).useDelimiter("\\Z").next();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(contents);
			
			Menu();
			break;
		case "B":
			Add();
			System.out.print("Heyy!!! the following contact has been added to your address book.\n");
			Menu();
			break;
		case "C":
			System.out.println("Enter in First Name of contact to remove: \n");
			String removestr=abapp.nextLine();
			System.out.println("You want to remove: " + removestr+ " Press Y to remove the following entry or N to return to main menu:");
			String selection1= abapp.nextLine();
			System.out.println("You have selected " + selection1);
			if(selection1.equals("Y"))
			{
				book.remove(removestr);
			}
			
			Menu();
			break;
		case "D":
			System.out.println("Enter the full name or the begining of the First Name of the contact you wish to find: \n");
			String FirstName = abapp.nextLine();
			book.find(FirstName);
			Menu();
			break;
		case "E":
			book.listbyFirstName();
			Menu();
			break;
		  case "F":
			  System.out.println("Good Bye!");
			  System.exit(1) ;
			 
			break;
		default:
			System.out.println("Invalid Menu..!!");
			Menu();
			break;
		}

	}

	private static void init(String absolutePath) {
		// TODO Auto-generated method stub
		
	}

	
	/**
	 * this method is created to add the entry for users
	 */
	public static void Add() {
		abapp = new Scanner(System.in);
		String FirstName;
		String LastName;
		String Street;
		String City;
		String State;
		String Zip;
		String Email;
		String Phone;
		Menu menu = new Menu();
		System.out.println(menu.prompt_FirstName());
		FirstName = abapp.nextLine();

		System.out.print(menu.prompt_LastName());
		LastName = abapp.nextLine();

		System.out.print(menu.prompt_Street());
		Street = abapp.nextLine();

		System.out.print(menu.prompt_City());
		City = abapp.nextLine();

		System.out.print(menu.prompt_State());
		State = abapp.nextLine();

		System.out.print(menu.prompt_Zip());
		Zip = abapp.nextLine();

		System.out.print(menu.prompt_Email());
		Email = abapp.nextLine();

		System.out.print(menu.prompt_Telephone());
		Phone = abapp.nextLine();
		AddressEntry entry = new AddressEntry(FirstName, LastName, Street, City, State, Zip, Email, Phone); // making a new instance after adding the entry
																											
																											
																																																					
																											
																											
																											
		book.Add(entry);// Adding the entry to the book

	}

	/**
	 * 
	 * @param filename
	 */
	
}
