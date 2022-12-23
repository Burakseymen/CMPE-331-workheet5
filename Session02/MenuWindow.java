/*
 * Stage: Development-01
 * @author: Umut Geyik, 120200145
 * @author: Gökay Tan, 122202114
 * @author: Burak Seymen, 117202076
 * @author: Nasser M.F. Sammoudi, 119202079
 *
 * Stage: Review
 * @author: Melike Zeynep Tapcı, 120200067
 * @author: Zuhair Muhammad Shahid , 121200168
 */

	/*Stage: Review:
	/*1st Question: Most of the curly brackets are aligned, indentations and white spaces written are correctly as well as the naming of the functions in the class. But some one line comments could be written instead of multiple line comments */
	/* 2nd Question: Buttons are working correctly and it accepts each input in the text fields and it displays the result screen as expected. */

import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuWindow extends JFrame implements ActionListener {

	/*
	 * Graphical User Interface (GUI) Elements
	 *
	 * ! PLEASE RENAME THE OBJECTS ACCORDING TO THEIR PURPOSES ! ! YOU CAN ADD MORE
	 * ELEMENTS IF IT IS NECESSARY !
	 */
	private JButton btnAddCart, btnExit;
	private JLabel lblBookName, lblAuthorName;
	private JTextField txtBookName, txtBookAuthorName;

	// Constructor
	public MenuWindow() {

		this.initializeGUI();
		this.setWindowProperties(3, 2);
		this.addGUIElementsToFrame();

	}

	/**
	 * Initialize GUI elements. If it is necessary, you can add more elements.
	 */
	public void initializeGUI() {
		lblBookName = new JLabel("Book Name:", SwingConstants.CENTER); // Label-01 -> User ID:
		lblAuthorName = new JLabel("Book Author:", SwingConstants.CENTER); // Label-02 -> User Password:

		txtBookName = new JTextField(""); // TextField-01 -> Input for User ID
		txtBookAuthorName = new JTextField(""); // TextField-02 -> Input for User Password

		txtBookName.setHorizontalAlignment(SwingConstants.CENTER);
		txtBookAuthorName.setHorizontalAlignment(SwingConstants.CENTER);

		btnAddCart = new JButton("Add to Cart"); // Button-01 -> Login
		btnExit = new JButton("Exit"); // Button-02 -> Exit

		btnAddCart.addActionListener(this);
		btnExit.addActionListener(this);
	}

	/**
	 * Set the necessary properties for the window
	 *
	 * @param numRow number of row for GUI elements
	 * @param numCol number of column for GUI elements
	 */
	public void setWindowProperties(int numRow, int numCol) {
		this.setLayout(new GridLayout(numRow, numCol));
		this.setSize(800, 800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	/**
	 * Add GUI elements to the layout of the frame. If it is necessary, you can add
	 * more elements.
	 */
	public void addGUIElementsToFrame() {
		this.add(lblBookName);
		this.add(txtBookName);

		this.add(lblAuthorName);
		this.add(txtBookAuthorName);

		this.add(btnAddCart);
		this.add(btnExit);
	}

	/**
	 * Add margin to the frame.
	 */
	@Override
	public Insets getInsets() {
		return new Insets(100, 50, 100, 50);
	}

	/**
	 * Action listener for the buttons. If e.getSource() is from one of the buttons,
	 * apply the related operation.
	 *
	 * @param e action event for detecting which button is clicked
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		// If login button has clicked, checked given information from user whether they
		// are correct
		// If exit button has clicked, simply close the program

		if (e.getSource() == btnAddCart) { 
			JOptionPane.showMessageDialog(this, txtBookName.getText() + " written by " + txtBookAuthorName.getText() + " added to your cart!");
		}
			

		if (e.getSource() == btnExit)
			System.exit(0);
	}

}
