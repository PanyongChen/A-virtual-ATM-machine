package ATM;

import javax.swing.*;

import ATM.SavingsWidthDraw.WidthDrawMoney;

class CheckingAccount extends JFrame
{
	JButton widthDraw;
	JTextField amount;
	JButton dispense;
	CheckingAccount()
	{
		SavingsBalance.balance = 4000;
		JTabbedPane tabs = new JTabbedPane();
		tabs.add("Add Money", new SavingsAdd());
		tabs.add("Widthdraw",new SavingsWidthDraw());
		this.add(tabs);
		this.setTitle("Checking Account");
		this.setSize(400, 400);
		this.setVisible(true);
	}
}
