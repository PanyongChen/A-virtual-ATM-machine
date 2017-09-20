package ATM;
import javax.swing.*;

class MortageLoan extends JFrame
{
	MortageLoan()
	{
		SavingsBalance.balance = 350000; // the balance only varies for mortgage loan
		SavingsBalance.monthlyPay = 3500;
		JTabbedPane tabs = new JTabbedPane();
		tabs.add("Add Money", new SavingsAdd());
		tabs.add("Widthdraw",new SavingsWidthDraw());
		tabs.add("Pay Loan",new PaymentPanel());
		this.add(tabs);
		this.setTitle("Mortgage Loan");
		this.setSize(400, 400);
		this.setVisible(true);
	}
}
