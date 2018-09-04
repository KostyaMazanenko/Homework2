package com.gmail.kostamazanenko;

public class Circle extends Shape {

	private Point pOne;
	private Point pTwo;
	
	
	public Circle (Point pOne, Point pTwo) {
		super();
		this.pOne = pOne;
		this.pTwo = pTwo;
	}

	public Circle() {
		super();
	}

	public Point getpOne() {
		return pOne;
	}

	public void setpOne(Point pOne) {
		this.pOne = pOne;
	}

	public Point getpTwo() {
		return pTwo;
	}

	public void setpTwo(Point pTwo) {
		this.pTwo = pTwo;
	}

	@Override
	double getPerimetr() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * pOne.getDistance(pTwo);
	}

	@Override
	double getArea() {
		
		return  Math.PI * pOne.getDistance(pTwo) * pOne.getDistance(pTwo);
	}

	@Override
	public String toString() {
		return "Circle [pOne=" + pOne.toString() + ", pTwo=" + pTwo.toString() + "]";
	}
	
	
	

}
