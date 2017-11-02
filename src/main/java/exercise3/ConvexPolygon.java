package exercise3;

import java.util.Arrays;

public class ConvexPolygon {

	protected Point[] sommets;

	// Constructeurs
	public ConvexPolygon(){

	}

	public ConvexPolygon(Point vertices[]){
		sommets= new Point[vertices.length];
		for(int i=0; i< vertices.length; i++)
			sommets[i]= new Point(vertices[i]);  //Appel du deuxième constructeur de la classe Point!
	}

	// Méthodes
	public double perimeter(){
		double v = 0.0;
		for (int i = 0; i < sommets.length - 1; i++)
		{
			v += Math.sqrt((sommets[i].getX() - sommets[i + 1].getX()) * (sommets[i].getX() - sommets[i + 1].getX()) + (sommets[i].getY() - sommets[i + 1].getY()) * (sommets[i].getY() - sommets[i + 1].getY()));
		}
		v += Math.sqrt((sommets[sommets.length - 1].getX() - sommets[0].getX()) * (sommets[sommets.length - 1].getX() - sommets[0].getX()) + (sommets[sommets.length - 1].getY() - sommets[0].getY()) * (sommets[sommets.length - 1].getY() - sommets[0].getY()));
		return v;
	}

	public double area(){
		double v = 150;
		/* ? Subdiviser le polygone en triangles ? */
		return v;
	}

	@Override
	public String toString(){
		return "ConvexPolygon{" + "sommets=" + Arrays.toString(sommets) + '}';
 	}
}
