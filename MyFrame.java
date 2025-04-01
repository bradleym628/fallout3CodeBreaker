import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame() {
		this.setTitle("Fallout Terminal Hacker");
		this.setSize(new Dimension(600,600));
		this.getContentPane().setBackground(Color.decode("#073605"));
		this.setFocusable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

}
