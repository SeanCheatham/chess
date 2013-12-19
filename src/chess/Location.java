package chess;

public class Location {
	public int file;
	public int rank;
	public Piece occupant;
	
	public Location(int x, int y) {
		file = x;
		rank = y;
		occupant = null;
	}
	
	public Location(int x, int y, Piece p) {
		file = x;
		rank = y;
		occupant = p;
	}
	
	public String toString(){
		String fileValue;
		switch (file) {
		case 0:
			fileValue = "A";
			break;
		case 1:
			fileValue = "B";
			break;
		case 2:
			fileValue = "C";
			break;
		case 3:
			fileValue = "D";
			break;
		case 4:
			fileValue = "E";
			break;
		case 5:
			fileValue = "F";
			break;
		case 6:
			fileValue = "G";
			break;
		case 7:
			fileValue = "H";
			break;
		default:
			fileValue = "";
			break;
		}
		return "("+fileValue+","+rank+"); "+occupant.type.name+";"+occupant.team;
	}
}
