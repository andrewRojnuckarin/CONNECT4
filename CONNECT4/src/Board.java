//Andrew Rojnuckarin
//William Baron
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
		boolean win = false;
		// horizontal
		for (int k = 0; k < 4; k++) {
			if (j + k - 3 > -1) {
				if (j + k < array[0].length) {
					if (array[i][j + k - 3] == color && array[i][j + k - 2] == color && array[i][j + k - 1] == color
							&& array[i][j + k] == color) {
						win = true;
					}
				}
			}
		}
		// vertical
		for (int k = 0; k < 4; k++) {
			if (i + k - 3 > -1) {
				if (i + k < array.length) {
					if (array[i + k - 3][j] == color && array[i + k - 2][j] == color && array[i + k - 1][j] == color
							&& array[i + k][j] == color) {
						win = true;
					}
				}
			}
		}
		// diagonal (/)
		for (int k = 0; k < 4; k++) {
			if (i - k + 3 < array.length && j + k - 3 > -1) {
				if (i - k > -1 && j + k < array[0].length) {
					if (array[i - k + 3][j + k - 3] == color && array[i - k + 2][j + k - 2] == color
							&& array[i - k + 1][j + k - 1] == color && array[i - k][j + k] == color) {
						win = true;
					}
				}
			}
		}
		// diagonal (\)
		for (int k = 0; k < 4; k++) {
			if (i - k + 3 < array.length && j - k + 3 < array[0].length) {
				if (i - k > -1 && j - k > -1) {
					if (array[i - k + 3][j - k + 3] == color && array[i - k + 2][j - k + 2] == color
							&& array[i - k + 1][j - k + 1] == color && array[i - k][j - k] == color) {
						win = true;
					}
				}
			}
		}
		return win;
	}

	public String play(int col) {
		int loc = -1;
		for (int i = array.length - 1; i > -1; i--) {
			if (array[i][col] == EMPTY) {
				array[i][col] = turn;
				loc = i;
				i = -1;
			}
		}
		if (loc != -1 && findWin(loc, col)) {
			if (turn == RED) {
				return "Red";
			} else if (turn == BLACK) {
				return "Black";
			}
		}
		turn = turn * -1;
		turnNum++;
		return null;
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

	public int[][] getArray() {
		return array;
	}
}
