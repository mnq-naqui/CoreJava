package com.pack;

public class ShapeService {
	private Shape shape;

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public  void drawShape(){
		shape.printShape();
	}
	
	public static void main(String[] args) {
		Shape shape=new Rectangle();
		shape.printShape();
	}
}
