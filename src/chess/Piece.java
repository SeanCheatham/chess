package chess;

import java.util.*;

public class Piece {
	private Type type;
    private int team;
    private Board board;
    private ArrayList<Location> attackableSquares;
	
	public Piece(Type ty, int t, Board b) {
		type = ty;
		team = t;
		board = b;
	}
	
	public void calculateAttackableSquares(Location loc){
		ArrayList<Location> vals = new ArrayList<Location>();
		Location currentLocation = loc;

		if(this.type.getEType() == eType.PAWN){
			if(this.team == 0){
				if(currentLocation.getFile()+1 <= this.board.getWidth()-1
                        && currentLocation.getRank()+1 <= this.board.getHeight()-1
                        && (this.board.getSquares()[currentLocation.getFile()+1][currentLocation.getRank()+1].getOccupant() == null
                        || this.board.getSquares()[currentLocation.getFile()+1][currentLocation.getRank()+1].getOccupant().team != 0))
                            vals.add(this.board.getSquares()[currentLocation.getFile()+1][currentLocation.getRank()+1]);

				if(currentLocation.getFile()-1 >= 0 && currentLocation.getRank()+1 <= this.board.getHeight()-1
                        && (this.board.getSquares()[currentLocation.getFile()-1][currentLocation.getRank()+1].getOccupant() == null
                        || this.board.getSquares()[currentLocation.getFile()-1][currentLocation.getRank()+1].getOccupant().team != 0))
                            vals.add(this.board.getSquares()[currentLocation.getFile()-1][currentLocation.getRank()+1]);
			}
			if(this.team == 1){
				if(currentLocation.getFile()+1 <= this.board.getWidth()-1 && currentLocation.getRank()-1 >= 0
                        && (this.board.getSquares()[currentLocation.getFile()+1][currentLocation.getRank()-1].getOccupant() == null
                        || this.board.getSquares()[currentLocation.getFile()+1][currentLocation.getRank()-1].getOccupant().team != 1))
                            vals.add(this.board.getSquares()[currentLocation.getFile()+1][currentLocation.getRank()-1]);
				if(currentLocation.getFile()-1 >= 0 && currentLocation.getRank()-1 >= 0
                        && (this.board.getSquares()[currentLocation.getFile()-1][currentLocation.getRank()-1].getOccupant() == null
                        || this.board.getSquares()[currentLocation.getFile()-1][currentLocation.getRank()-1].getOccupant().team != 1))
                            vals.add(this.board.getSquares()[currentLocation.getFile()-1][currentLocation.getRank()-1]);
			}
		}
		else if(this.type.getEType() == eType.ROOK){

			for(int i = currentLocation.getFile(); i <= board.getWidth()-1; i++){
				if(this.board.getSquares()[i][currentLocation.getRank()].getOccupant() == null)
                    vals.add(this.board.getSquares()[i][currentLocation.getRank()]);
				else if(this.board.getSquares()[i][currentLocation.getRank()].getOccupant().team != this.team){
					vals.add(this.board.getSquares()[i][currentLocation.getRank()]);
					break;
				}
			}

			for(int i = currentLocation.getFile(); i >= 0; i--){
				if(this.board.getSquares()[i][currentLocation.getRank()].getOccupant() == null)
                    vals.add(this.board.getSquares()[i][currentLocation.getRank()]);
				else if(this.board.getSquares()[i][currentLocation.getRank()].getOccupant().team != this.team){
					vals.add(this.board.getSquares()[i][currentLocation.getRank()]);
					break;
				}
			}

			for(int i = currentLocation.getRank(); i <= board.getHeight()-1; i++){
				if(this.board.getSquares()[currentLocation.getFile()][i].getOccupant() == null)
                    vals.add(this.board.getSquares()[currentLocation.getFile()][i]);
				else if(this.board.getSquares()[currentLocation.getFile()][i].getOccupant().team != this.team){
					vals.add(this.board.getSquares()[currentLocation.getFile()][i]);
					break;
				}
			}

			for(int i = currentLocation.getRank(); i >= 0; i--){
				if(this.board.getSquares()[currentLocation.getFile()][i].getOccupant() == null)
                    vals.add(this.board.getSquares()[currentLocation.getFile()][i]);
				else if(this.board.getSquares()[currentLocation.getFile()][i].getOccupant().team != this.team){
					vals.add(this.board.getSquares()[currentLocation.getFile()][i]);
					break;
				}
			}
		}
		attackableSquares = vals;
	}

    public Type getType() {
        return type;
    }

    public int getTeam() {
        return team;
    }

    public Board getBoard() {
        return board;
    }

    public ArrayList<Location> getAttackableSquares() {
        return attackableSquares;
    }
}
