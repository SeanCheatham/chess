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
				if(currentLocation.file+1 <= this.board.width-1
                        && currentLocation.rank+1 <= this.board.height-1
                        && (this.board.squares[currentLocation.file+1][currentLocation.rank+1].occupant == null
                        || this.board.squares[currentLocation.file+1][currentLocation.rank+1].occupant.team != 0))
                            vals.add(this.board.squares[currentLocation.file+1][currentLocation.rank+1]);

				if(currentLocation.file-1 >= 0 && currentLocation.rank+1 <= this.board.height-1
                        && (this.board.squares[currentLocation.file-1][currentLocation.rank+1].occupant == null
                        || this.board.squares[currentLocation.file-1][currentLocation.rank+1].occupant.team != 0))
                            vals.add(this.board.squares[currentLocation.file-1][currentLocation.rank+1]);
			}
			if(this.team == 1){
				if(currentLocation.file+1 <= this.board.width-1 && currentLocation.rank-1 >= 0
                        && (this.board.squares[currentLocation.file+1][currentLocation.rank-1].occupant == null
                        || this.board.squares[currentLocation.file+1][currentLocation.rank-1].occupant.team != 1))
                            vals.add(this.board.squares[currentLocation.file+1][currentLocation.rank-1]);
				if(currentLocation.file-1 >= 0 && currentLocation.rank-1 >= 0
                        && (this.board.squares[currentLocation.file-1][currentLocation.rank-1].occupant == null
                        || this.board.squares[currentLocation.file-1][currentLocation.rank-1].occupant.team != 1))
                            vals.add(this.board.squares[currentLocation.file-1][currentLocation.rank-1]);
			}
		}
		else if(this.type.getType() == eType.ROOK){
			for(int i = currentLocation.file; i <= board.width-1; i++){
				if(this.board.squares[i][currentLocation.rank].occupant == null)
                    vals.add(this.board.squares[i][currentLocation.rank]);
				else if(this.board.squares[i][currentLocation.rank].occupant.team != this.team){
					vals.add(this.board.squares[i][currentLocation.rank]);
					break;
				}
			}
			for(int i = currentLocation.file; i >= 0; i--){
				if(this.board.squares[i][currentLocation.rank].occupant == null)
                    vals.add(this.board.squares[i][currentLocation.rank]);
				else if(this.board.squares[i][currentLocation.rank].occupant.team != this.team){
					vals.add(this.board.squares[i][currentLocation.rank]);
					break;
				}
			}
			for(int i = currentLocation.rank; i <= board.height-1; i++){
				if(this.board.squares[currentLocation.file][i].occupant == null)
                    vals.add(this.board.squares[currentLocation.file][i]);
				else if(this.board.squares[currentLocation.file][i].occupant.team != this.team){
					vals.add(this.board.squares[currentLocation.file][i]);
					break;
				}
			}
			for(int i = currentLocation.rank; i >= 0; i--){
				if(this.board.squares[currentLocation.file][i].occupant == null)
                    vals.add(this.board.squares[currentLocation.file][i]);
				else if(this.board.squares[currentLocation.file][i].occupant.team != this.team){
					vals.add(this.board.squares[currentLocation.file][i]);
					break;
				}
			}
		}
		attackableSquares = vals;
	}
}
