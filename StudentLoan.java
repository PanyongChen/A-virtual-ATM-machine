package ATM;

import javax.swing.*;

class StudentLoan extends JFrame
{
	StudentLoan()
	{
		SavingsBalance.balance = 75000;
		SavingsBalance.monthlyPay =250;
		JTabbedPane tabs = new JTabbedPane();
		tabs.add("Add Money", new SavingsAdd());
		tabs.add("Widthdraw",new SavingsWidthDraw());
		tabs.add("Pay Loan",new PaymentPanel());
		this.add(tabs);
		this.setTitle("Student Loan");
		this.setSize(400, 400);
		this.setVisible(true);
	}
}


class AutoLoan extends JFrame
{
	AutoLoan()
	{
		SavingsBalance.balance = 35000;
		SavingsBalance.monthlyPay =500;
		JTabbedPane tabs = new JTabbedPane();
		tabs.add("Add Money", new SavingsAdd());
		tabs.add("Widthdraw",new SavingsWidthDraw());
		tabs.add("Pay Loan",new PaymentPanel());
		this.add(tabs);
		this.setTitle("Auto Loan");
		this.setSize(400, 400);
		this.setVisible(true);
	}
}


class PersonalLoan extends JFrame
{
	PersonalLoan()
	{
		SavingsBalance.balance = 5000;
		SavingsBalance.monthlyPay =1000;
		JTabbedPane tabs = new JTabbedPane();
		tabs.add("Add Money", new SavingsAdd());
		tabs.add("Widthdraw",new SavingsWidthDraw());
		tabs.add("Pay Loan",new PaymentPanel());
		this.add(tabs);
		this.setTitle("Personal Loan");
		this.setSize(400, 400);
		this.setVisible(true);
	}
}