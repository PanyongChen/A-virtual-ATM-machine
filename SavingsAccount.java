package ATM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class SavingsBalance
{
	public static int balance; // static field will initialize to 0
	public static int monthlyPay; 
}

class SavingsAdd extends JPanel
{
	JPanel main;
	JTextField addAmount;
	JButton add;
	SavingsAdd()
	{
		main = new JPanel();
		main.add(new JLabel("Enter the money to add here"));
		addAmount = new JTextField();
		this.add(main);
		this.add(addAmount);
		add = new JButton("Add Amount");
		add.addActionListener(new AddMoney());
		this.add(add);
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
	}
	class AddMoney implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String amount = addAmount.getText().toString();
			try
			{
				int amnt = Integer.parseInt(amount);
				SavingsBalance.balance+=amnt;
				JOptionPane.showMessageDialog(null, "BALANCE is "+SavingsBalance.balance+"$");
				if(SavingsBalance.balance<200)
				{
					JOptionPane.showMessageDialog(null,"Your balance is below 200$, current balance: "+SavingsBalance.balance+"$");
				}
			}
			catch(NumberFormatException e)
			{
				e.printStackTrace(); // This prevents abnormal input like alphabetical characters
			}
		}
		
	}
}

class SavingsWidthDraw extends JPanel
{
	JButton widthDraw;
	JTextField amount;
	JButton dispense;
	SavingsWidthDraw()
	{
		JPanel panel = new JPanel();
		panel.add(new JLabel("Enter the amount to widthdraw"));
		amount = new JTextField();
		this.add(panel);
		this.add(amount);
		dispense = new JButton("Dispense Cash");
		dispense.addActionListener(new WidthDrawMoney());
		this.add(dispense);
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		this.setSize(400,400);
		this.setVisible(true);
	}
	class WidthDrawMoney implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String amnt = amount.getText().toString();
			try
			{
				int current = Integer.parseInt(amnt);
				if(current>SavingsBalance.balance)
				{
					JOptionPane.showMessageDialog(null, "Insufficient funds");
				}
				else
				{
					SavingsBalance.balance-=current;
					JOptionPane.showMessageDialog(null,"Widthdrawn! Current balance: "+SavingsBalance.balance);
				}
				if(SavingsBalance.balance<200)
				{
					JOptionPane.showMessageDialog(null,"Your balance is below 200$, current balance: "+SavingsBalance.balance+"$");
				}
			}
			catch(NumberFormatException e)
			{
				e.printStackTrace();
			}
		}
		
	}
}

class SavingsAccount extends JFrame
{
	SavingsAccount()
	{
		SavingsBalance.balance = 4000;
		JTabbedPane tabs = new JTabbedPane();
		tabs.add("Add Money", new SavingsAdd());
		tabs.add("Widthdraw",new SavingsWidthDraw());
		this.add(tabs);
		this.setTitle("Savings Account");
		this.setSize(400, 400);
		this.setVisible(true);
	}
}
