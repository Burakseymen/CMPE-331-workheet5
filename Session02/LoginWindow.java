/*
 * Stage: Development-01
 * @author: Umut Geyik, 120200145
 * @author: Gökay Tan, 122202114
 * @author: Burak Seymen, 117202076
 * @author: Nasser M.F. Sammoudi, 119202079
 *
 */

import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginWindow extends JFrame implements ActionListener {

	// main method for testing the application
	public static void main(String[] args) {
		new LoginWindow();
	}

	// Customized user ID and password for checking the functionality
	String user_name = "gokaytan";
	String user_pass = "122202114";

	/*
	 * Graphical User Interface (GUI) Elements
	 *
	 * ! PLEASE RENAME THE OBJECTS ACCORDING TO THEIR PURPOSES ! ! YOU CAN ADD MORE
	 * ELEMENTS IF IT IS NECESSARY !
	 */
	private JButton btnLogin, btnExit;
	private JLabel lblUserID, lblUserPwd;
	private JTextField txtUID, txtUPWD;

	// Constructor
	public LoginWindow() {

		this.initializeGUI();
		this.setWindowProperties(3, 2);
		this.addGUIElementsToFrame();

	}

	/**
	 * Initialize GUI elements. If it is necessary, you can add more elements.
	 */
	public void initializeGUI() {
		lblUserID = new JLabel("User ID:", SwingConstants.CENTER); // Label-01 -> User ID:
		lblUserPwd = new JLabel("User Password:", SwingConstants.CENTER); // Label-02 -> User Password:

		txtUID = new JTextField(""); // TextField-01 -> Input for User ID
		txtUPWD = new JTextField(""); // TextField-02 -> Input for User Password

		txtUID.setHorizontalAlignment(SwingConstants.CENTER);
		txtUPWD.setHorizontalAlignment(SwingConstants.CENTER);

		btnLogin = new JButton("Login"); // Button-01 -> Login
		btnExit = new JButton("Exit"); // Button-02 -> Exit

		btnLogin.addActionListener(this);
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
		this.add(lblUserID);
		this.add(txtUID);

		this.add(lblUserPwd);
		this.add(txtUPWD);

		this.add(btnLogin);
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

		if (e.getSource() == btnLogin) {
			if (txtUID.getText().equals(user_name) && txtUPWD.getText().equals(user_pass)) {
				JOptionPane.showMessageDialog(this, "Welcome back, " + user_name + "!");
				this.dispose();
				new MenuWindow();
			} else
				JOptionPane.showMessageDialog(this, "User ID or password incorrect!");
		}

		if (e.getSource() == btnExit)
			System.exit(0);
	}

}
