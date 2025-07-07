package com.app.geometry;

public class Point2D {
	private double x;
	private double y;
	public Point2D() {
		//TODO
	}
	public Point2D(double x,double y){
		this.x = x;
		this.y = y;
		
	}
	public double getX() {
		return x;
		
	}
	public double getY() {
		return y;
		
	}
	public void setX(double x){
		this.x = x;
	}
	public void setY(double y){
		this.y = y;
	}
	public boolean isEqual(Point2D anotherPoint) {
	    return this.x == anotherPoint.x && this.y == anotherPoint.y;
	}
	public double distance(Point2D anotherPoint) {
		double dx = this.x - anotherPoint.x;
		double dy = this.y - anotherPoint.y;
	    return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}
	public String getDetails() {
		return "("+x+","+y+")";
	}
	
		
	}