/*
 *Circle.java
 *@author Craig Sullivan
 *30/04/17
 */

public class Circle{

	//data members
	private double radius;
	private double area;
	private double circ;
	final double PI = 3.14;

	//constructor (which will be covered later)
	public Circle(){
		radius = 0.0;
		area = 0.0;
		circ = 0.0;
	}

	//compute area method (which will be called from our App class)
	public double computeArea(double radius){
		area = PI*(radius*radius); //as per formula of area of a circle
		return area;
	}

	//compute circumference method (which will be called from our App class)
	public double computeCirc(double radius){
		circ = 2*PI*radius; //as per formula of circumference of a circle
		return circ;
	}
}

