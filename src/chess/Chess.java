package chess;

public class Chess {
	public static void main(String[] args) {
		Board b = new Board(8,8);
		//White's back line
		b.squares[0][0] = new Location(0,0,new Piece(new Type("R"),0));
		b.squares[0][1] = new Location(0,1,new Piece(new Type("N"),0));
		b.squares[0][2] = new Location(0,2,new Piece(new Type("B"),0));
		b.squares[0][3] = new Location(0,3,new Piece(new Type("Q"),0));
		b.squares[0][4] = new Location(0,4,new Piece(new Type("K"),0));
		b.squares[0][5] = new Location(0,5,new Piece(new Type("B"),0));
		b.squares[0][6] = new Location(0,6,new Piece(new Type("N"),0));
		b.squares[0][7] = new Location(0,7,new Piece(new Type("R"),0));
		//White's front line
		b.squares[1][0] = new Location(1,0,new Piece(new Type("P"),0));
		b.squares[1][1] = new Location(1,1,new Piece(new Type("P"),0));
		b.squares[1][2] = new Location(1,1,new Piece(new Type("P"),0));
		b.squares[1][3] = new Location(1,1,new Piece(new Type("P"),0));
		b.squares[1][4] = new Location(1,1,new Piece(new Type("P"),0));
		b.squares[1][5] = new Location(1,1,new Piece(new Type("P"),0));
		b.squares[1][6] = new Location(1,1,new Piece(new Type("P"),0));
		b.squares[1][7] = new Location(1,1,new Piece(new Type("P"),0));
		//Black's front line
		b.squares[6][0] = new Location(6,0,new Piece(new Type("P"),1));
		b.squares[6][1] = new Location(6,1,new Piece(new Type("P"),1));
		b.squares[6][2] = new Location(6,1,new Piece(new Type("P"),1));
		b.squares[6][3] = new Location(6,1,new Piece(new Type("P"),1));
		b.squares[6][4] = new Location(6,1,new Piece(new Type("P"),1));
		b.squares[6][5] = new Location(6,1,new Piece(new Type("P"),1));
		b.squares[6][6] = new Location(6,1,new Piece(new Type("P"),1));
		b.squares[6][7] = new Location(6,1,new Piece(new Type("P"),1));
		//Black's back line
		b.squares[7][0] = new Location(7,0,new Piece(new Type("R"),1));
		b.squares[7][1] = new Location(7,1,new Piece(new Type("N"),1));
		b.squares[7][2] = new Location(7,2,new Piece(new Type("B"),1));
		b.squares[7][3] = new Location(7,3,new Piece(new Type("Q"),1));
		b.squares[7][4] = new Location(7,4,new Piece(new Type("K"),1));
		b.squares[7][5] = new Location(7,5,new Piece(new Type("B"),1));
		b.squares[7][6] = new Location(7,6,new Piece(new Type("N"),1));
		b.squares[7][7] = new Location(7,7,new Piece(new Type("R"),1));
		b.drawBoard();
		//b.listPieces();
		
		b.movePiece(b.squares[1][0], b.squares[2][0]);
		b.drawBoard();
	}
}
