package chess;
public class Board {
	public int height;
	public int width;
	public Location[][] squares;
	
	public Board(int w, int h){
		width = w;
		height = h;
		squares = new Location[width][height];
	}
	
	public void drawBoard(){
		for(int i = height-1; i >= 0; i--){
			System.out.print("["+(i+1)+"]");
			for(int j = 0; j <= width-1; j++){
				if(squares[j][i] != null) System.out.print(" "+squares[j][i].occupant.type.shortName+" ");
				else System.out.print(" _ ");
			}
			System.out.println();
		}
		System.out.println("   [A][B][C][D][E][F][G][H]");
	}
	
	public void listPieces(){
		for(int i = 0; i <= height - 1; i++){
			for(int j = 0; j <= width-1; j++){
				if(squares[i][j] != null) System.out.println(squares[i][j]);
			}
		}
	}
	
	public void movePiece(Location from, int toX, int toY){
		
		this.squares[toX][toY] = new Location(toX, toY, from.occupant);
		System.out.println(from.occupant.type.shortName+from.chessCoordinates()+" to "+squares[toX][toY].chessCoordinates());
		this.squares[from.file][from.rank] = null;
	}
}
