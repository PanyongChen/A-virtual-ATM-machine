
package ATM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class PaymentPanel extends JPanel
{
	JButton payBill;
	PaymentPanel()
	{
		payBill = new JButton("Pay Loan");
		payBill.addActionListener(new Payment());
		this.add(payBill);
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
	}
	
	class Payment implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(SavingsBalance.monthlyPay>SavingsBalance.balance)
			{
				JOptionPane.showMessageDialog(null,"You cannot pay the loan, you do not have suffcient funds!");
			}
			else
			{
				SavingsBalance.balance-=SavingsBalance.monthlyPay;
				JOptionPane.showMessageDialog(null,"Loan paid successfully! Balance: "+SavingsBalance.balance+"$");
			}
			if(SavingsBalance.balance<200)
			{
				JOptionPane.showMessageDialog(null,"Your balance is below 200$, current balance: "+SavingsBalance.balance+"$");
			}
		}
		
	}
}
