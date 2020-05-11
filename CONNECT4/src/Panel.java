import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private Board b;
	private int i;
	private int j;
	
	public Panel(Board b, int i, int j) {
		this.b = b;
		this.i = i;
		this.j = j;
	}
	
	public void paint(Graphics g) {
		//System.out.println("drods cock");
		int color = b.getArray()[i][j];
		if(color == -1) {
			g.setColor(Color.BLACK);
			g.fillOval(getWidth()/2, getHeight()/2, getWidth()/2, getHeight()/2);
		}
		
		else if(color == 1) {
			g.setColor(Color.RED);
			g.fillOval(getWidth()/2, getHeight()/2, getWidth()/2, getHeight()/2);
		}
		
		else {
			g.setColor(Color.BLACK);
			g.drawOval(getWidth()/2, getHeight()/2, getWidth()/2, getHeight()/2);
		}
		repaint();
	}
}
