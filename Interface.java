import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Interface {
	public Interface(){
		final JFrame frame;
		JPanel panel;

		frame = new JFrame("Login");
		frame.setSize(400, 150);
    
		JLabel userLabel = new JLabel("Username");
		userLabel.setBounds(10, 10, 80, 25);
		

		final JTextField userText = new JTextField(25);

		JLabel passwordLabel = new JLabel("Password");		

		final JPasswordField passwordText = new JPasswordField(25);
		passwordText.setBounds(100, 40, 160, 25);
		
	      // Create a panel and add the buttons to it.
	      panel = new JPanel();
	      panel.add(userLabel);
	      panel.add(userText);
	      panel.add(passwordLabel);
	      panel.add(passwordText);
	      RegButton regButton = new RegButton(panel, frame, userText, passwordText);
	      LoginButton loginButton = new LoginButton(panel, frame, userText, passwordText);
	      
	      

	      // Add the panel to the content pane.
	      frame.add(panel);

	      // Display the window.
	      frame.setVisible(true);

	            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
