package exercise3;

public class Ellipsis {

	protected Point centre; //PROTECTED -> la classe circle hérite du point centre
	private int grandAxe=0;
	private int petitAxe=0;

	// Constructeurs
	public Ellipsis(){}
	public Ellipsis(Point c, int xAxis, int yAxis){

		centre=c;
		grandAxe = (xAxis >= yAxis) ? xAxis : yAxis;
		petitAxe = (xAxis <= yAxis) ? xAxis : yAxis;

	}

	// Méthodes
	public double perimeter(){
		return 2*Math.PI*Math.sqrt((grandAxe*grandAxe + petitAxe*petitAxe)/2);
	}

	public double area(){

		return (Math.PI * grandAxe * petitAxe);
	}

	@Override
	public String toString(){
		return "Ellipsis{" + "grand axe=" + grandAxe + ", petit axe=" + petitAxe + ", centre=" + centre + '}';
	}
}
