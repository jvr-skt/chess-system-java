package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	protected Board getBoard() {
		return board;
	}
	
	public Piece pieces(int row, int column) {
		return pieces [board.getRows()][board.getColumns()];
	}
	
	public Piece piece(Position position) {
		return pieces [position.getRow()][position.getColumn();
	}
	
}
