import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JDialog;

//Andrew Rojnuckarin
//William Baron
public class Driver {

	public static void main(String[] args) {
		Board C4 = new Board(6, 7);
		createWindow(6, 7, C4);
	}

	public static void createWindow(int a, int b, Board board) {
		JFrame frame = new JFrame("Connect Four");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		GridLayout layout = new GridLayout(a + 1, b);
		frame.setLayout(layout);

		// buttons
		for (int i = 0; i < b; i++) {
			int d = i + 1;
			String l = "" + d;
			JButton button = new JButton(l);
			frame.add(button);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String win = board.play(d - 1);
					board.printBoard();
					if (win != null) {
						JDialog winFrame = new JDialog(frame, "Congratulations!");
						winFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						winFrame.setSize(200, 100);
						JButton label = new JButton(win + " wins!");
						label.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								System.exit(0);
							}
						});
						winFrame.add(label);
						winFrame.setLocationRelativeTo(frame);
						winFrame.setVisible(true);
					}
				}
			});
		}

		// holes
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				Panel p = new Panel(board, i, j);
				frame.add(p);
			}
		}
		frame.setVisible(true);
	}
}