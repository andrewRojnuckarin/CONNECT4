import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

//Andrew Rojnuckarin
//William Baron
public class Panel extends JPanel {

	private static final long serialVersionUID = 1L;
	private Board b;
	private int i;
	private int j;

	public Panel(Board b, int i, int j) {
		this.b = b;
		this.i = i;
		this.j = j;
	}

	public void paint(Graphics g1) {
		Graphics2D g = (Graphics2D) g1;
		g.setStroke(new BasicStroke(3));
		int color = b.getArray()[i][j];
		if (color == -1) {
			g.fillOval(getWidth() / 8, getHeight() / 8, (int) (getWidth() * (0.75)), (int) (getHeight() * (0.75)));
		}

		else if (color == 1) {
			g.setColor(Color.RED);
			g.fillOval(getWidth() / 8, getHeight() / 8, (int) (getWidth() * (0.75)), (int) (getHeight() * (0.75)));
			g.setColor(Color.BLACK);
			g.drawOval(getWidth() / 8, getHeight() / 8, (int) (getWidth() * (0.75)), (int) (getHeight() * (0.75)));
		}

		else {
			g.drawOval(getWidth() / 8, getHeight() / 8, (int) (getWidth() * (0.75)), (int) (getHeight() * (0.75)));
		}
		repaint();
	}
}