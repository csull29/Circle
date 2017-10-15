/*
 *CircleApp3.java
 *@author Craig Sullivan
 *30/04/17
 */

import javax.swing.JOptionPane;

public class CircleApp3{

    public static void main(String args[]){ // Variables int raduis; double area; double circumference;

		// declare variables
		double radius;
		double area;
		double circ;
		int diameter;
		String inputDiameter; // introducing a new variable to hold the String value input by the user

		// declare objects
		Circle myCircle;

		// create opbjects
		myCircle = new Circle ();

		// input
		inputDiameter = JOptionPane.showInputDialog("Enter diameter");
		diameter = Integer.parseInt(inputDiameter);
		radius =  (double) diameter / 2;

		// process
		area = myCircle.computeArea(radius);
		circ = myCircle.computeCirc(radius);

		// output
		JOptionPane.showMessageDialog(null, "A circle of radius " + radius + " has an area of " +area + " and a circumference of " + circ);

     }
}
