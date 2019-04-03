package google1419;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Form {
	
	JButton one = new JButton("One Point");
	JButton animate = new JButton("Animate");
	JButton reset = new JButton("Reset");
	JLabel info = new JLabel("Shots : 0  ---  Hit : 0" );
	JLabel num = new JLabel("Number of points: ");
	JLabel result = new JLabel("No points have been made");
	JTextField in = new JTextField(4);
	
	PiEstimate pe = new PiEstimate();
	
	public Form() {
		
		JFrame f = new JFrame("Monte Carlo Pi");
			   f.setSize(300, 300);
			   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			   
		JPanel p = new JPanel();
			   p.setLayout(new GridBagLayout());
			   
		GridBagConstraints gbc = new GridBagConstraints();
			   
			   gbc.fill = GridBagConstraints.HORIZONTAL;
			   gbc.insets = new Insets(5, 5, 5, 5);
			   gbc.weighty = 1;
			   
			   gbc.gridwidth = 2;
			   gbc.gridx = 0;
			   gbc.gridy = 0;
			   gbc.anchor = GridBagConstraints.CENTER;
			   p.add(info,gbc);
			   
			   gbc.gridwidth = 1;
			   gbc.gridx = 0;
			   gbc.gridy = 1;
			   gbc.anchor = GridBagConstraints.EAST;
			   p.add(num, gbc);
			   
			   gbc.gridx = 1;
			   gbc.gridy = 1;
			   gbc.anchor = GridBagConstraints.WEST;
			   p.add(in, gbc);
			   
			   gbc.gridx = 0;
			   gbc.gridy = 2;
			   gbc.anchor = GridBagConstraints.EAST;
			   p.add(one, gbc);
			   
			   gbc.gridx = 1;
			   gbc.gridy = 2;
			   gbc.anchor = GridBagConstraints.WEST;
			   p.add(animate, gbc);
			   
			   gbc.gridwidth = 2;
			   
			   gbc.gridx = 0;
			   gbc.gridy = 3;
			   gbc.anchor = GridBagConstraints.CENTER;
			   p.add(result, gbc);
			   
			   gbc.weighty = 10;
			   gbc.insets = new Insets(50, 0, 0, 0);
			   
			   gbc.gridx = 0;
			   gbc.gridy = 4;
			   gbc.anchor = GridBagConstraints.FIRST_LINE_START;
			   p.add(reset, gbc);
			   
			   one.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent e) {
					   setResult(pe.calculate(1));
				   }
			   });
			      
			   animate.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent event) {
					   try {
						   int x = Integer.parseInt(in.getText());
						   setResult(pe.calculate(x));
					   }catch(NumberFormatException exc) {
						   JOptionPane.showMessageDialog( p,
								   						 "A Number must be input!",
								   						 "Input Error", 
								   						 JOptionPane.ERROR_MESSAGE);
						   in.setText("");
					   } 
				   }
			   });
			   			   
			   reset.addActionListener(new ActionListener() {
				   public void actionPerformed(ActionEvent e) {
					   pe.resetCounts();
					   info.setText(pe.getInfo());
					   in.setText("");
					   result.setText("No points have been made.");
					   
				   }
			   });
			   
		f.add(p);
		f.setVisible(true);
	}
	
	public void setResult(double num) {
		
		num = Math.round(num * 1000.0) / 1000.0;  // rounding to 3 decimal places
		result.setText("Pi has been calculated to "+ num);
		info.setText(pe.getInfo());
	}
}