package com.gmail.kostamazanenko;

public class Triangle extends Shape {
	Point pOne;
	Point pTwo;
	Point pThree;

	public Triangle(Point pOne, Point pTwo, Point pThree) {
		super();
		this.pOne = pOne;
		this.pTwo = pTwo;
		this.pThree = pThree;
	}

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
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

	public Point getpThree() {
		return pThree;
	}

	public void setpThree(Point pThree) {
		this.pThree = pThree;
	}
	
	

}
