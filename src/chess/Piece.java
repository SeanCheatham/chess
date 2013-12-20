package chess;

import java.util.*;

public class Piece {
	public Type type;
	public int team;
	public Board board;
	public ArrayList<Location> attackableSquares;
	
	public Piece(Type ty, int t, Board b) {
		type = ty;
		team = t;
		board = b;
	}
	
	public void calculateAttackableSquares(Location loc){
		ArrayList<Location> vals = new ArrayList<Location>();
		Location currentLocation = loc;
		if(this.type.getType() == eType.PAWN){
			if(this.team == 0){
				if(currentLocation.file+1 <= this.board.width-1 && currentLocation.rank+1 <= this.board.height-1 && (this.board.squares[currentLocation.file+1][currentLocation.rank+1].occupant == null || this.board.squares[currentLocation.file+1][currentLocation.rank+1].occupant.team != 0)) vals.add(this.board.squares[currentLocation.file+1][currentLocation.rank+1]);
				if(currentLocation.file-1 >= 0 && currentLocation.rank+1 <= this.board.height-1 && (this.board.squares[currentLocation.file-1][currentLocation.rank+1].occupant == null || this.board.squares[currentLocation.file-1][currentLocation.rank+1].occupant.team != 0)) vals.add(this.board.squares[currentLocation.file-1][currentLocation.rank+1]);
			}
			if(this.team == 1){
				if(currentLocation.file+1 <= this.board.width-1 && currentLocation.rank-1 >= 0 && (this.board.squares[currentLocation.file+1][currentLocation.rank-1].occupant == null || this.board.squares[currentLocation.file+1][currentLocation.rank-1].occupant.team != 1)) vals.add(this.board.squares[currentLocation.file+1][currentLocation.rank-1]);
				if(currentLocation.file-1 >= 0 && currentLocation.rank-1 >= 0 && (this.board.squares[currentLocation.file-1][currentLocation.rank-1].occupant == null || this.board.squares[currentLocation.file-1][currentLocation.rank-1].occupant.team != 1)) vals.add(this.board.squares[currentLocation.file-1][currentLocation.rank-1]);
			}
			
		}
		attackableSquares = vals;
	}
}
