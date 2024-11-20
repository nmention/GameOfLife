/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Thu Apr 13 10:42:12 CEST 2023
*
*/
public enum Direction {

	NORTH (0,-1),
	NORTHEAST (1,-1),
	NORTHWEST (-1,-1),
	SOUTH (0,1),
	SOUTHEAST (1,1),
	SOUTHWEST (-1,1),
	EAST (1,0),
	WEST (-1,0);


	private final int x;
	private final int y;


	private Direction(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	
	
}