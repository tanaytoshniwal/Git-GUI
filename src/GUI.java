import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

public class GUI extends JFrame{
	JLabel lbl1;
	JTextField tf1;
	JPanel pan;
	JButton btn;
	public GUI(String str) {
		//Frame settings
		super(str);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		setResizable(false);
		
		//initializing objects and components
		lbl1 = new JLabel("Input GIT Directory Path:");
		tf1 = new JTextField(12);
		pan = new JPanel();
		btn = new JButton("Next");
		
		//setting positional bounds
		lbl1.setBounds(70, 10, 150, 20);
		tf1.setBounds(220, 10, 150, 20);
		
		//object properties
		pan.setLayout(null);
		
		//adding objects to panel
		pan.add(lbl1);
		pan.add(tf1);
		
		//adding objects to main frame
		add(pan);
	}
	public static void main(String[] args) throws Exception {
		new GUI("Git-GUI").setVisible(true);
	}
}
