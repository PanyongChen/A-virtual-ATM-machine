package ATM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class AccountSelection extends JFrame
{
	JRadioButton savings,checking,loanPayment;
	JPanel mainPanel;
	JButton progress;
	AccountSelection()
	{
		mainPanel = new JPanel();
		savings = new JRadioButton("Savings account");
		checking = new JRadioButton("Checking account");
		loanPayment = new JRadioButton("Loan Payment account");
		ButtonGroup group = new ButtonGroup();
		group.add(savings);
		group.add(checking);
		group.add(loanPayment);
		mainPanel.add(savings);
		mainPanel.add(checking);
		mainPanel.add(loanPayment);
		progress = new JButton("Progress>>>");
		progress.addActionListener(new Progress());
		mainPanel.add(progress);
		mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
		this.add(mainPanel);
		this.setSize(400,400);
		this.setVisible(true);
	}
	class Progress implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(savings.isSelected()) // If savings option is selected
			{
				new SavingsAccount(); // anonymous objects
			}
			else if(checking.isSelected())// if checking option is selected
			{
				new CheckingAccount();
			}
			else // else is loan
			{
				new Loan();
			}
		}
		
	}
}
