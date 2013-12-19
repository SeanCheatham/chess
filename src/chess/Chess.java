package chess;

public class Chess {
	public static void main(String[] args) {
		Board b = new Board(8,8);
		//White's back line
		b.squares[0][0] = new Location(0,0,new Piece(new Type("R"),0));
		b.squares[1][0] = new Location(1,0,new Piece(new Type("N"),0));
		b.squares[2][0] = new Location(2,0,new Piece(new Type("B"),0));
		b.squares[3][0] = new Location(3,0,new Piece(new Type("Q"),0));
		b.squares[4][0] = new Location(4,0,new Piece(new Type("K"),0));
		b.squares[5][0] = new Location(5,0,new Piece(new Type("B"),0));
		b.squares[6][0] = new Location(6,0,new Piece(new Type("N"),0));
		b.squares[7][0] = new Location(7,0,new Piece(new Type("R"),0));
		//White's front line
		b.squares[0][1] = new Location(0,1,new Piece(new Type("P"),0));
		b.squares[1][1] = new Location(1,1,new Piece(new Type("P"),0));
		b.squares[2][1] = new Location(2,1,new Piece(new Type("P"),0));
		b.squares[3][1] = new Location(3,1,new Piece(new Type("P"),0));
		b.squares[4][1] = new Location(4,1,new Piece(new Type("P"),0));
		b.squares[5][1] = new Location(5,1,new Piece(new Type("P"),0));
		b.squares[6][1] = new Location(6,1,new Piece(new Type("P"),0));
		b.squares[7][1] = new Location(7,1,new Piece(new Type("P"),0));
		//Black's front line
		b.squares[0][6] = new Location(0,6,new Piece(new Type("P"),1));
		b.squares[1][6] = new Location(1,6,new Piece(new Type("P"),1));
		b.squares[2][6] = new Location(2,6,new Piece(new Type("P"),1));
		b.squares[3][6] = new Location(3,6,new Piece(new Type("P"),1));
		b.squares[4][6] = new Location(4,6,new Piece(new Type("P"),1));
		b.squares[5][6] = new Location(5,6,new Piece(new Type("P"),1));
		b.squares[6][6] = new Location(6,6,new Piece(new Type("P"),1));
		b.squares[7][6] = new Location(7,6,new Piece(new Type("P"),1));
		//Black's back line
		b.squares[0][7] = new Location(0,7,new Piece(new Type("R"),1));
		b.squares[1][7] = new Location(1,7,new Piece(new Type("N"),1));
		b.squares[2][7] = new Location(2,7,new Piece(new Type("B"),1));
		b.squares[3][7] = new Location(3,7,new Piece(new Type("Q"),1));
		b.squares[4][7] = new Location(4,7,new Piece(new Type("K"),1));
		b.squares[5][7] = new Location(5,7,new Piece(new Type("B"),1));
		b.squares[6][7] = new Location(6,7,new Piece(new Type("N"),1));
		b.squares[7][7] = new Location(7,7,new Piece(new Type("R"),1));
		b.drawBoard();
		//b.listPieces();
		
		b.movePiece(b.squares[0][1], 0, 2);
		b.drawBoard();
	}
}
