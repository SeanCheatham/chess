package chess;

public class Chess {
	public static void main(String[] args) {
		Board b = new Board(8,8);
		//White's back line
		b.squares[0][0].setOccupant(new Piece(new Type("R"),0,b));
		b.squares[1][0].setOccupant(new Piece(new Type("N"),0,b));
		b.squares[2][0].setOccupant(new Piece(new Type("B"),0,b));
		b.squares[3][0].setOccupant(new Piece(new Type("Q"),0,b));
		b.squares[4][0].setOccupant(new Piece(new Type("K"),0,b));
		b.squares[5][0].setOccupant(new Piece(new Type("B"),0,b));
		b.squares[6][0].setOccupant(new Piece(new Type("N"),0,b));
		b.squares[7][0].setOccupant(new Piece(new Type("R"),0,b));

		//White's front line
        for (int i = 0; i < 8; i++) {
            b.squares[i][1].setOccupant(new Piece(new Type("P"),0,b));
        }
		//Black's front line
        for (int i = 0; i < 8; i++) {
            b.squares[i][6].setOccupant(new Piece(new Type("P"),1,b));
        }
		//Black's back line
		b.squares[0][7].setOccupant(new Piece(new Type("R"),1,b));
		b.squares[1][7].setOccupant(new Piece(new Type("N"),1,b));
		b.squares[2][7].setOccupant(new Piece(new Type("B"),1,b));
		b.squares[3][7].setOccupant(new Piece(new Type("Q"),1,b));
		b.squares[4][7].setOccupant(new Piece(new Type("K"),1,b));
		b.squares[5][7].setOccupant(new Piece(new Type("B"),1,b));
		b.squares[6][7].setOccupant(new Piece(new Type("N"),1,b));
		b.squares[7][7].setOccupant(new Piece(new Type("R"),1,b));
		b.drawBoard();
		//b.listPieces();
		
		/*b.movePiece(b.squares[0][1], 0, 2);
		b.drawBoard();*/
		
		//Location to check
		Location p1 = b.squares[1][1];
		System.out.println("Calculating possible moves for: "+p1);
		p1.occupant.calculateAttackableSquares(b.squares[1][1]);
		for(int i=0; i<=p1.occupant.calculateAttackableSquares(p1).size()-1; i++){
			System.out.println(p1.occupant.calculateAttackableSquares(p1).get(i).chessCoordinates());
		}
		
	}
}
