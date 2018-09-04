package com.gmail.kostamazanenko;

public class Triangle extends Shape {
	private Point pOne;
	private Point pTwo;
	private Point pThree;

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

	@Override
	double getPerimetr() {
		// TODO Auto-generated method stub
		return pOne.getDistance(pTwo) + pTwo.getDistance(pThree) + pThree.getDistance(pOne);
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		double p = getPerimetr() / 2;
		return Math.sqrt(p*(p - pOne.getDistance(pTwo))*(p - pTwo.getDistance(pThree))*(p - pThree.getDistance(pOne)));
	}

	@Override
	public String toString() {
		return "Triangle [pOne=" + pOne.toString() + ", pTwo=" + pTwo.toString() + ", pThree=" + pThree.toString() + "]";
	}
	
	

}
