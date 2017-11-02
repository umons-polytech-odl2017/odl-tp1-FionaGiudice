package exercise3;

import java.util.Arrays;

public class Rectangle extends ConvexPolygon {

	private int longueur=0;
	private int largeur=0;

	// Constructeurs
	public Rectangle(){

	}
	public Rectangle(Point upperLeft, Point lowerRight){
		sommets = new Point[4];
		sommets[0]=upperLeft;
		sommets[1]= new Point(upperLeft.getX(),lowerRight.getY());
		sommets[2]=lowerRight;
		sommets[3]=new Point(lowerRight.getX(), upperLeft.getY());

		largeur = (Math.abs(lowerRight.getX() - upperLeft.getX()) <= Math.abs(lowerRight.getY() - upperLeft.getY())) ? Math.abs(lowerRight.getX() - upperLeft.getX()) : Math.abs(lowerRight.getY() - upperLeft.getY());
		longueur = (Math.abs(lowerRight.getX() - upperLeft.getX()) >= Math.abs(lowerRight.getY() - upperLeft.getY())) ? Math.abs(lowerRight.getX() - upperLeft.getX()) : Math.abs(lowerRight.getY() - upperLeft.getY());
	}

	// Méthodes
	@Override
	public double perimeter(){

		return (longueur + largeur)*2;
	}

	@Override
	public double area(){

		return (longueur*largeur);
	}

	@Override
	public String toString(){
		return "Rectangle{" + "largeur=" + largeur + ", longueur=" + longueur + ", sommets=" + Arrays.toString(sommets) + '}';
	}
}


