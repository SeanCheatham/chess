package chess;

import java.util.*;

public class Piece {
	public Type type;
	public int team;
	public Board board;
	public ArrayList<Location> attackbleSquares;
	
	public Piece(Type ty, int t, Board b) {
		type = ty;
		team = t;
		board = b;
	}
	
	public ArrayList<Location> calculateAttackableSquares(Location loc){
		ArrayList<Location> vals = new ArrayList<Location>();
		Location currentLocation = loc;
		if(this.type.shortName == "P"){
			if(this.team == 0){
				if(currentLocation.file+1 < this.board.width-1 && currentLocation.rank+1 < this.board.height && this.board.squares[currentLocation.file+1][currentLocation.rank+1].occupant == null) vals.add(this.board.squares[currentLocation.file+1][currentLocation.rank+1]);
				if(currentLocation.file-1 >= 0 && currentLocation.rank+1 < this.board.height && this.board.squares[currentLocation.file-1][currentLocation.rank+1].occupant == null) vals.add(this.board.squares[currentLocation.file-1][currentLocation.rank+1]);
			}
		}
		return vals;
	}
}
