package exercise3;

public class Circle extends Ellipsis{

	private int rayon;

	// Constructeurs
	public Circle(Point c, int radius){
		centre = c;
		rayon=radius;
	}

	// Méthodes
	@Override
	public double perimeter(){
		return 2*Math.PI*rayon;
	}

	@Override
	public double area(){
		return Math.PI*rayon*rayon;
	}

	@Override
	public String toString(){
		return "Circle{" + "centre=" + centre + ", rayon=" + rayon + '}';
	}
}
