package com.gmail.kostamazanenko;

public class Tetragon extends Shape {

	private Point pOne;
	private Point pTwo;
	private Point pThree;
	private Point pFour;

	public Tetragon(Point pOne, Point pTwo, Point pThree, Point pFour) {
		super();
		this.pOne = pOne;
		this.pTwo = pTwo;
		this.pThree = pThree;
		this.pFour = pFour;
	}

	public Tetragon() {
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

	public Point getpFour() {
		return pFour;
	}

	public void setpFour(Point pFour) {
		this.pFour = pFour;
	}

	@Override
	double getPerimetr() {
		// TODO Auto-generated method stub
		return pOne.getDistance(pTwo) + pTwo.getDistance(pThree) + pThree.getDistance(pFour) + pFour.getDistance(pOne);
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		Triangle trOne = new Triangle(pOne, pTwo, pThree);
		Triangle trTwo = new Triangle(pTwo, pThree, pFour);
		return trOne.getArea() + trTwo.getArea();
	}

	@Override
	public String toString() {
		return "Tetragon [pOne=" + pOne.toString() + ", pTwo=" + pTwo.toString() + ", pThree=" + pThree.toString() + ", pFour=" + pFour.toString() + "]";
	}
	
	

}
