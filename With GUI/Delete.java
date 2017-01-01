import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.lang.Object;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Delete {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void Delete() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete window = new Delete();
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
	public Delete() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 758, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterTheLast = new JLabel("Enter the last name to remove a record");
		lblEnterTheLast.setBounds(50, 100, 319, 20);
		frame.getContentPane().add(lblEnterTheLast);
		
		textField = new JTextField();
		textField.setBounds(414, 94, 146, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnRemove = new JButton("Remove");
	
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
	
				

				try {
					
						Class.forName ("oracle.jdbc.OracleDriver"); // toad table calling code start
						Connection conn = 
								DriverManager.getConnection("jdbc:oracle:thin:be9248/xRXp5_17@mcsdb1.sci.csueastbay.edu:1521/MCSDB1");
						JOptionPane.showConfirmDialog(null, "Connection Successful");
						
						String query="delete from ADDRESSENTRYTABLE where LAST_NAME='"+textField.getText()+"'";
						PreparedStatement pst= conn.prepareStatement(query);
						ResultSet rset=pst.executeQuery();
						JOptionPane.showMessageDialog(null,"Record deleted");
						

					}
				catch(Exception e2){

						throw new RuntimeException(e2);
					

					}
					
				
			}
			});
				
				
				btnRemove.setBounds(254, 220, 115, 29);
		frame.getContentPane().add(btnRemove);
	}
}
