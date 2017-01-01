import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class New {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	/*private String FIRST_NAME;
	private String LAST_NAME;
	private String STREET;
	private String CITY;
	private String STATE;
	private String ZIP;
	private String EMAIL;
	private String PHONE;
	private String ID;*/
	/**
	 * Launch the application.
	 */
	public static void New() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New window = new New();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public New() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 735, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("FIRST_NAME");
		lblName.setBounds(67, 64, 120, 20);
		frame.getContentPane().add(lblName);
		
		JLabel lblAddress = new JLabel("LAST_NAME");
		lblAddress.setBounds(67, 100, 120, 20);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblEmail = new JLabel("STREET");
		lblEmail.setBounds(67, 136, 120, 20);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPhone = new JLabel("CITY");
		lblPhone.setBounds(67, 175, 120, 20);
		frame.getContentPane().add(lblPhone);
		
		textField = new JTextField();
		textField.setBounds(337, 61, 146, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(337, 97, 146, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(337, 133, 146, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(337, 172, 146, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		
		
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
		
			Connection conn = 
					DriverManager.getConnection("jdbc:oracle:thin:be9248/xRXp5_17@mcsdb1.sci.csueastbay.edu:1521/mcsdb1");
		
			String query="INSERT INTO ADDRESSENTRYTABLE(FIRST_NAME,LAST_NAME,STREET,CITY,STATE,ZIP,PHONE,EMAIL,ID) values(?,?,?,?,?,?,?,?,?)";
				
				PreparedStatement pst=conn.prepareStatement(query);
				
				// pst.setString(0, "123456"); 
				
				pst.setString(1,textField.getText());
				pst.setString(2,textField_1.getText());
				pst.setString(3,textField_2.getText());
				pst.setString(4,textField_3.getText());
				pst.setString(5,textField_4.getText());
				pst.setString(6,textField_5.getText());
				pst.setString(7,textField_6.getText());
				pst.setString(8,textField_7.getText());
				pst.setString(9, textField_8.getText());
				
				//pst.setInt(9,textField_8.getText());
				//pst.setInt(9, Integer.parseInt(textField_8.getText()));
				
				
				ResultSet rst=pst.executeQuery();
				 
				JOptionPane.showMessageDialog(null,"data saved");
				pst.close();
			rst.close();
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		
				
						}	
			
		});
		btnSave.setBounds(197, 429, 85, 29);
		frame.getContentPane().add(btnSave);
		
		JLabel lblState = new JLabel("STATE");
		lblState.setBounds(67, 217, 120, 20);
		frame.getContentPane().add(lblState);
		
		JLabel lblZip = new JLabel("ZIP");
		lblZip.setBounds(67, 250, 69, 20);
		frame.getContentPane().add(lblZip);
		
		JLabel lblEmail_1 = new JLabel("EMAIL");
		lblEmail_1.setBounds(67, 286, 69, 20);
		frame.getContentPane().add(lblEmail_1);
		
		JLabel lblPhone_1 = new JLabel("PHONE");
		lblPhone_1.setBounds(67, 325, 69, 20);
		frame.getContentPane().add(lblPhone_1);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(67, 361, 69, 20);
		frame.getContentPane().add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setBounds(337, 211, 146, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(337, 250, 146, 26);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(337, 286, 146, 26);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(337, 319, 146, 26);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(337, 355, 146, 26);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
	}
}
