package ATM;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Loan extends JFrame
{
	JRadioButton mortage,personal,student,autoLoan;
	JButton proceed;
	Loan()
	{
		ButtonGroup group = new ButtonGroup();
		mortage = new JRadioButton("Mortgage Loan");
		personal = new JRadioButton("Personal Loan");
		student = new JRadioButton("Student Loan");
		autoLoan = new JRadioButton("Auto Loan");
		group.add(mortage);
		group.add(student);
		group.add(personal);
		group.add(autoLoan);
		this.add(mortage);
		this.add(personal);
		this.add(student);
		this.add(autoLoan);
		proceed = new JButton("Proceed");
		proceed.addActionListener(new Proceed());
		this.add(proceed);
		this.setTitle("Bank - Department of Loan Lending");
		this.setLayout(new GridLayout(5,1));
		this.setSize(400, 400);
		this.setVisible(true);
	}
	class Proceed implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(mortage.isSelected())
			{
				new MortageLoan();
			}
			else if(student.isSelected())
			{
				new StudentLoan();
			}
			else if(personal.isSelected())
			{
				new PersonalLoan();
			}
			else
			{
				new AutoLoan();
			}
		}
		
	}
}
