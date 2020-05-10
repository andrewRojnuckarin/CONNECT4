import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GUI{

	public static void main(String[] args) {
		createWindow(6, 7);
		Board C4 = new Board(6, 7);
		C4.printBoard();
		C4.play(0);
		C4.printBoard();
		C4.play(0);
		C4.printBoard();
		System.out.println("Will wins");
		
	}
	
	public static void createWindow(int a, int b) {
		JFrame frame = new JFrame ("Connect4");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationByPlatform(true);
		frame.setSize(1000, 500);
		GridLayout layout = new GridLayout(a+1, b);
		frame.setLayout(layout);
		ImageIcon icon = new ImageIcon("BLANK.png");
		ImageIcon iconRed = new ImageIcon("RED.png");
		
		
		for(int i = 0; i < b; i++) {
			int d = i+1;
			String c = ""+d;
			JButton button = new JButton(c);
			frame.add(button);
		}
		
		for(int i = 0; i < a*b; i++) {
			JLabel button2 = new JLabel(icon);
			frame.add(button2);
			
			
		}
		
		
		frame.setVisible(true);


	
	
	}
	
	
	

}


