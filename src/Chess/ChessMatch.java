package Chess;

import Chess.pieces.King;
import Chess.pieces.Rook;
import boardgame.Board;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetUp();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	public void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetUp() {
		placeNewPiece('b', 6,  new Rook(board, Color.WHITE));
		placeNewPiece('e', 8,  new King(board, Color.BLACK));
		placeNewPiece('e', 1,  new King(board, Color.BLACK));

	}
}
