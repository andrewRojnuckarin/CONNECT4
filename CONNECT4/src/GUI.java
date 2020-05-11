import java.awt.BorderLayout;
import java.awt.Component;
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
		Board C4 = new Board(6, 7);
		createWindow(6, 7, C4);
	
	}
	
	public static void createWindow(int a, int b, Board board) {
		JFrame frame = new JFrame ("Connect4");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationByPlatform(true);
		frame.setSize(500, 500);
		GridLayout layout = new GridLayout(a+1, b);
		frame.setLayout(layout);
		ImageIcon icon = new ImageIcon("BLANK.png");
		ImageIcon iconRed = new ImageIcon("RED.png");
		
		//BUTTONS
		for(int i = 0; i < b; i++) {
			int d = i+1;
			String c = ""+d;
			JButton button = new JButton(c);
			frame.add(button);
			button.addActionListener(new ActionListener(){  
			
				public void actionPerformed(ActionEvent e){  
					
					board.play(d-1);
					board.printBoard();
				}  
			});  
		}
		
		//LABELS
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b;j++) {
				Panel p = new Panel(board, i, j);
				frame.add(p);
			}
		}
		frame.setVisible(true);
	}
}