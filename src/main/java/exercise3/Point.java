package exercise3;

public class Point {

	private int x=0;
	private int y=0;

	// Constructeurs
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public Point(Point p){
		this.x= p.getX();
		this.y=p.getY();
	}
	// Accesseurs
	public int getX(){

		return x;
	}

	public int getY(){

		return y;
	}

	@Override
	public String toString(){
		return "Point{" + "x=" + x + ", y=" + y + '}';
	}
}



