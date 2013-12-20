package chess;

public class Type {
	public String name;
	public String shortName;
	public int value;
	
	public Type(){
		name = "";
		shortName = "*";
		value = 0;
	}
	
	public Type(String n){
		if(n == "P") {
			name = "Pawn";
			value = 1;
			shortName = n;
		}
		else if(n == "B") {
			name = "Bishop";
			value = 3;
			shortName = n;
		}
		else if(n == "N") {
			name = "Knight";
			value = 3;
			shortName = n;
		}
		else if(n == "R") {
			name = "Rook";
			value = 6;
			shortName = n;
		}
		else if(n == "Q") {
			name = "Queen";
			value = 10;
			shortName = n;
		}
		else if(n == "K") {
			name = "King";
			value = 0;
			shortName = n;
		}
	}
}
