package com.gmail.kostamazanenko;

public class Main {

	public static void main(String[] args) {
		Circle cOne = new Circle(new Point(2, 3), new Point(1, 3));
		Circle cTwo = new Circle(new Point(10, 3), new Point(5, 7));

		Tetragon t = new Tetragon(new Point(1, 1), new Point(3, 7), new Point(10, 1), new Point(2, 11));
	
		Triangle tr = new Triangle(new Point(3, 7), new Point(1, 1), new Point(8, 6));
		
		Desk desk = new Desk();
		
		desk.addFigure(tr, 0);
		desk.addFigure(t, 1);
		desk.addFigure(cOne, 2);
		desk.addFigure(cTwo, 3);
		
		desk.printQuarterDeskAndArea();
		
		
		desk.remove(0);
		desk.remove(1);
		
		desk.printQuarterDeskAndArea();
	}
	
	

}
