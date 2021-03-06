package com.gmail.kostamazanenko;

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double getDistance(Point p) {
		return Math.sqrt((this.x - p.x)*(this.x - p.x) + (this.y - p.y)*(this.y - p.y));
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
