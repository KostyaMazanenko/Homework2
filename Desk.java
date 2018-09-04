package com.gmail.kostamazanenko;

public class Desk {
	private Shape[] quarterDesk = new Shape[4];

	public Desk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addFigure(Shape figure, int i) {

		if (quarterDesk[i] == null) {
			quarterDesk[i] = figure;
		} else {
			System.out.println("This quarter of the desk is occupied");
		}
	}

	public void remove(int i) {
		quarterDesk[i] = null;
	}

	public void printQuarterDeskAndArea() {
		for (int i = 0; i < quarterDesk.length; i++) {
			if (quarterDesk[i] != null) {
				System.out.println("In the " + (i + 1) + " quarter lays " + quarterDesk[i].toString());
			} else {
				System.out.println("The " + (i + 1) + " quarter is empty");
			}
		}
		double area = 0;
		for (Shape p : quarterDesk) {
			if (p != null) {
				area = area + p.getArea();
			}
		}
		System.out.println("Summary area is equal " + area);
	}

}
