package ATM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MainFrame extends JFrame
{
	JPasswordField password;
	JPanel panel;
	JButton login;
	MainFrame()
	{
		panel = new JPanel();
		JPanel heading = new JPanel();
		heading.add(new JLabel("PIN"));
		panel.add(heading);
		password = new JPasswordField();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.add(password);
		login = new JButton("LOGIN");
		login.addActionListener(new Login());
		JPanel footer = new JPanel();
		footer.add(login);
		panel.add(footer);
		this.add(panel);
		this.setTitle("ATM");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(180,150);
	}
	class Login implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			@SuppressWarnings("deprecation")
			String passwd = password.getText().toString();
			int pin = 0;
			try
			{
				pin = Integer.parseInt(passwd);
				if(passwd.length()==4)
				{
					if(pin<1||pin>9999)
					{
						JOptionPane.showMessageDialog(null, "Password must be greater than 0001 and less than 9999");
					}
					else
					{
						// our next part
						new AccountSelection();
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Password length must be 4");
				}
			}
			catch(NumberFormatException e){System.out.println("Non numericals entered");}
		}
		
	}
}

public class Main {
public static void main(String[] args) {
	new MainFrame();
}
}
