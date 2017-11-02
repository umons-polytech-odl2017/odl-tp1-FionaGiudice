package exercise3;

import java.util.Arrays;

public class Square extends Rectangle {        // EXTENDS = héritage

	private int cote;

	// Constructeurs
	public Square (Point vertex, int sideLength){
		sommets= new Point[4];
		sommets[0]= vertex;
		sommets[1]= new Point(vertex.getX(),vertex.getY()-sideLength);
		sommets[2]= new Point(vertex.getX()+sideLength,vertex.getY());
		sommets[3]= new Point(vertex.getX()+sideLength,vertex.getY()-sideLength);

		cote=sideLength;
	}

	// Méthodes
	@Override
	public double perimeter(){

		return 4*cote;
	}

	@Override
	public double area(){

		return cote*cote;
	}

	@Override
	public String toString(){
		return "Square{" + "cote=" + cote + ", sommets=" + Arrays.toString(sommets) + '}';
	}
}
