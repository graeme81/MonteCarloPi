package google1419;

import java.awt.*;

import javax.swing.*;

public class Form {
	
	JButton one = new JButton("One Point");
	JButton animate = new JButton("Animate");
	JButton reset = new JButton("Reset");
	JLabel num = new JLabel("Number of points: ");
	JLabel result = new JLabel("!--------------results here--------------!");
	JTextField in = new JTextField(4);
	
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
			   
			   gbc.gridx = 0;
			   gbc.gridy = 0;
			   gbc.anchor = GridBagConstraints.EAST;
			   p.add(num, gbc);
			   
			   gbc.gridx = 1;
			   gbc.gridy = 0;
			   gbc.anchor = GridBagConstraints.WEST;
			   p.add(in, gbc);
			   
			   gbc.gridx = 0;
			   gbc.gridy = 1;
			   gbc.anchor = GridBagConstraints.EAST;
			   p.add(one, gbc);
			   
			   gbc.gridx = 1;
			   gbc.gridy = 1;
			   gbc.anchor = GridBagConstraints.WEST;
			   p.add(animate, gbc);
			   
			   gbc.gridwidth = 2;
			   
			   gbc.gridx = 0;
			   gbc.gridy = 2;
			   gbc.anchor = GridBagConstraints.CENTER;
			   p.add(result, gbc);
			   
			   
			   gbc.weighty = 10;
			   gbc.insets = new Insets(50, 50, 50, 50);
			   
			   gbc.gridx = 0;
			   gbc.gridy = 3;
			   gbc.anchor = GridBagConstraints.FIRST_LINE_START;
			   p.add(reset, gbc);
		
		
		f.add(p);
		f.setVisible(true);
		
	}

}
