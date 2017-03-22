import java.io.*;
import java.util.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JList;

public class AddressBookApplicationGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddressBookApplicationGUI window = new AddressBookApplicationGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		AddressBook book = new AddressBook();
		
/*Scanner sc = new Scanner(System.in);
		
		// display the menu to the user
		Menu.displayMenu();
		System.out.println();
		
	
		String choice = "";
		
		// as long as the user doesn't wish to exit
		while(!choice.equalsIgnoreCase("f"))
		{	
			choice = sc.next();
			
			// to launch the GUI window
			JunkGUI.main(args);
			
			switch(choice) {
				case "A":
				case "a": AddressBook.load();
						Menu.displayMenu();
						break;
				case "B":
				case "b": AddressBook.initAddressBookApplication();
						Menu.displayMenu();
						break;
				case "C":
				case "c": AddressBook.remove();
						Menu.displayMenu();
						break;
				case "D":
				case "d": AddressBook.find();
						Menu.displayMenu();
						break;
				case "E":
				case "e": AddressBook.list();
						Menu.displayMenu();
						break;
				case "F":
				case "f": AddressBook.saveAndQuit();
						break; 
			} 
		} */
	}

	/**
	 * Create the application.
	 */
	public AddressBookApplicationGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		
		
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.setBounds(20, 56, 89, 23);
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Bandana Kaur \n3312 Wildrose Cir \nPinole CA, 94546 \n510-222-1232 \n" 
						+ "b@gmail.com");
			}
		}); 
		panel_1.setLayout(null);
		panel_1.add(btnDisplay);
		
		JButton btnNew = new JButton("New");
		btnNew.setBounds(20, 90, 89, 23);
		panel_1.add(btnNew);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(20, 124, 89, 23);
		panel_1.add(btnRemove);
		
		JLabel lblAddressBook = new JLabel("Address Book");
		lblAddressBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddressBook.setFont(new Font("Vladimir Script", Font.BOLD, 25));
		lblAddressBook.setBounds(142, 11, 138, 23);
		panel_1.add(lblAddressBook);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(407, 11, 17, 239);
		panel_1.add(scrollBar);
		
		/*DefaultListModel model = new DefaultListModel();
		JList list = new JList(model);
		list.setBounds(180, 45, 198, 187);
		frame.getContentPane().add(list);
		panel_1.add(list); */
	}
}
