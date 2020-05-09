
public class Board {

	private static final int RED = 1;
	private static final int EMPTY = 0;
	private static final int BLACK = -1;
	
	private int[][] array;
	private int turn;
	private int turnNum;
	
	public Board(int h, int w) {
		array = new int[h][w];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = EMPTY;
			}
		}
		turn = RED;
		turnNum = 0;
	}
	
	public boolean findWin(int i, int j) {
		int color = array[i][j];
//		for (int k = 0; k < 4; k++) {
//			if (i + k - 4)
//		}
		return false;
	}
	
	public void play(int col) {
		for (int i = array.length - 1; i > -1; i--) {
			if (array[i][col] == EMPTY) {
				array[i][col] = turn;
				i = -1;
			}
		}
		turn = turn * -1;
		turnNum++;
	}
	
	public void printBoard() {
		for (int i = 0; i < array[0].length; i++) {
			System.out.print(" " + i + " ");
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] == EMPTY) {
					System.out.print(" o ");
				} else if (array[i][j] == RED) {
					System.out.print(" R ");
				} else if (array[i][j] == BLACK) {
					System.out.print(" B ");
				}
			}
			System.out.println();
			System.out.println();
		}
	}
	
	public int getTurnNum() {
		return turnNum;
	}
	
	public int getBestMove() {
		return -1;
	}
}
