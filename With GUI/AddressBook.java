import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.awt.*;
/**
 * 
 * @author Gaurav Hooda
 *
 */
public class AddressBook extends JFrame
{
	
	private JButton Display;
	private JButton New;
	
	private static List<AddressEntry> addressBook; // making list from constructor
	//AddressBook AB = new AddressBook();
	
	
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
		
		super("the tittle bar");
		setLayout(new FlowLayout());
		//JLabel item = new JLabel("Press any button");
		//add(item);
		Display= new JButton("Display");
		New= new JButton("New");
		add(Display);
		add(New);
		HandlerClass handler = new HandlerClass();
		Display.addActionListener(handler);
		New.addActionListener(handler);
		
		Label l1,l2,l3,l4,l5,l6,l7,l8;
		TextField t1,t2,t3,t4,t5,t6,t7,t8;
		Button b1;
		
		l1=new Label("enter first name");
		l2=new Label("enter last name");
		l3=new Label("enter your address");
		l4=new Label("enter city");
		l5=new Label("enter state");
		l6=new Label("enter zip");
		l7=new Label("enter email id");
		l8=new Label("enter phone");
		t1=new TextField(" ");
		t2=new TextField(" ");
		t3=new TextField(" ");
		t4=new TextField(" ");
		t5=new TextField(" ");
		t6=new TextField(" ");
		t7=new TextField(" ");
		t8=new TextField(" ");
		b1=new Button("save");
		setLayout(null);
		l1.setBounds(100,50,100,30);

		l2.setBounds(100,100,100,30);
		l3.setBounds(100,150,200,30);
		l4.setBounds(100,200,100,30);
		l5.setBounds(100,250,100,30);
		l6.setBounds(100,300,100,30);
		l7.setBounds(100,350,150,30);
		l8.setBounds(100,400,150,30);
		
		t1.setBounds(300,50,150,30);
		t2.setBounds(300,100,150,30);
		t3.setBounds(300,150,250,30);
		t4.setBounds(300,200,200,30);
		t5.setBounds(300,250,200,30);
		t6.setBounds(300,300,200,30);
		t7.setBounds(300,350,200,30);
		t8.setBounds(300,400,200,30);
		b1.setBounds(200,500,100,50);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		add(t8);
		
		add(b1);
		
		b1.addActionListener(handler);
		
		
		

		addressBook = new LinkedList<AddressEntry>();
	}
	private class HandlerClass implements ActionListener{
		public void actionPerformed(ActionEvent event){
		
			

			JOptionPane.showMessageDialog(null,String.format("Saved Successfully",event.getActionCommand()));
			
			//save sv = new save();
			
			//JOptionPane.showInputDialog("Enter the details");
		
		}
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
