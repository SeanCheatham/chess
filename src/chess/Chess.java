package chess;

public class Chess {
	public static void main(String[] args) {
		Board b = new Board(8,8);
		//White's back line
		b.squares[0][0].setOccupant(new Piece(new Type(eType.ROOK),0,b));
		b.squares[1][0].setOccupant(new Piece(new Type(eType.KNIGHT),0,b));
		b.squares[2][0].setOccupant(new Piece(new Type(eType.BISHOP),0,b));
		b.squares[3][0].setOccupant(new Piece(new Type(eType.QUEEN),0,b));
		b.squares[4][0].setOccupant(new Piece(new Type(eType.KING),0,b));
		b.squares[5][0].setOccupant(new Piece(new Type(eType.BISHOP),0,b));
		b.squares[6][0].setOccupant(new Piece(new Type(eType.KNIGHT),0,b));
		b.squares[7][0].setOccupant(new Piece(new Type(eType.ROOK),0,b));
		//White's front line
        b.squares[0][1].setOccupant(new Piece(new Type(eType.PAWN),0,b));
        b.squares[1][1].setOccupant(new Piece(new Type(eType.PAWN),0,b));
        b.squares[2][1].setOccupant(new Piece(new Type(eType.PAWN),0,b));
        b.squares[3][1].setOccupant(new Piece(new Type(eType.PAWN),0,b));
        b.squares[4][1].setOccupant(new Piece(new Type(eType.PAWN),0,b));
        b.squares[5][1].setOccupant(new Piece(new Type(eType.PAWN),0,b));
        b.squares[6][1].setOccupant(new Piece(new Type(eType.PAWN),0,b));
        b.squares[7][1].setOccupant(new Piece(new Type(eType.PAWN),0,b));
		//Black's front line
        b.squares[0][6].setOccupant(new Piece(new Type(eType.PAWN),1,b));
        b.squares[1][6].setOccupant(new Piece(new Type(eType.PAWN),1,b));
        b.squares[2][6].setOccupant(new Piece(new Type(eType.PAWN),1,b));
        b.squares[3][6].setOccupant(new Piece(new Type(eType.PAWN),1,b));
        b.squares[4][6].setOccupant(new Piece(new Type(eType.PAWN),1,b));
        b.squares[5][6].setOccupant(new Piece(new Type(eType.PAWN),1,b));
        b.squares[6][6].setOccupant(new Piece(new Type(eType.PAWN),1,b));
        b.squares[7][6].setOccupant(new Piece(new Type(eType.PAWN),1,b));
		//Black's back line
		b.squares[0][7].setOccupant(new Piece(new Type(eType.ROOK),1,b));
		b.squares[1][7].setOccupant(new Piece(new Type(eType.KNIGHT),1,b));
		b.squares[2][7].setOccupant(new Piece(new Type(eType.BISHOP),1,b));
		b.squares[3][7].setOccupant(new Piece(new Type(eType.QUEEN),1,b));
		b.squares[4][7].setOccupant(new Piece(new Type(eType.KING),1,b));
		b.squares[5][7].setOccupant(new Piece(new Type(eType.BISHOP),1,b));
		b.squares[6][7].setOccupant(new Piece(new Type(eType.KNIGHT),1,b));
		b.squares[7][7].setOccupant(new Piece(new Type(eType.ROOK),1,b));
		b.drawBoard();
		//b.listPieces();
		
		/*b.movePiece(b.squares[0][1], 0, 2);
		b.drawBoard();*/
		
		//Location to check
		b.squares[7][6].printAllowableMoves();
		
	}
}
