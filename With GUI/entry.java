import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.sql.Statement;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
public class entry {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void entry() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					entry window = new entry();
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
	public entry() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 871, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.setBounds(142, 127, 98, 29);
		
		
		
		
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			
			try {
				
					Class.forName ("oracle.jdbc.OracleDriver"); // toad table calling code start
					Connection conn = 
							DriverManager.getConnection("jdbc:oracle:thin:be9248/xRXp5_17@mcsdb1.sci.csueastbay.edu:1521/MCSDB1");
					Statement stmt = conn.createStatement ();
					
										

					 

					// Select the all (*) from the table JAVATEST

					ResultSet rset = stmt.executeQuery("SELECT * FROM ADDRESSENTRYTABLE");
					table.setModel(DbUtils.resultSetToTableModel(rset));
					

				}
			catch(Exception e2){

					throw new RuntimeException(e2);

				}
				
				
				
				
				
			}
			
			
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnDisplay);
		
		JButton btnNew = new JButton("New");
		
		
		
		btnNew.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
						
												//click the new button to add the new entry
				New n=new New();
				n.New();
			}
		});
		btnNew.setBounds(50, 127, 77, 29);
		frame.getContentPane().add(btnNew);
		
		
JButton btnExit = new JButton("Exit");
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();	
			}
		});
		btnExit.setBounds(260, 227, 89, 29);
		frame.getContentPane().add(btnExit);
		
		
		
		
		JButton btnRemove = new JButton("Remove");
		
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Delete dl=new Delete();
				dl.Delete();
			}
		});
		btnRemove.setBounds(260, 127, 89, 29);
		frame.getContentPane().add(btnRemove);
		
		

		table = new JTable();
		table.setBounds(407, 16, 409, 436);
		frame.getContentPane().add(table);
	}
}
