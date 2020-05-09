
public class Board {

	private static final boolean RED = true;
	private static final boolean BLACK = false;
	
	private boolean[][] array;
	private boolean turn;
	private int turnNum;
	
	public Board() {
		array = new boolean[7][6];
		turn = RED;
		turnNum = 0;
	}
	
	public boolean redWin() {
		return false;
	}
	
	public boolean blackWin() {
		return false;
	}
	
	public void play(int col) {
		
	}
	
	public void printBoard() {
		
	}
	
	public int getBestMove() {
		return -1;
	}
}
