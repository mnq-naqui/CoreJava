package com.pack;

public class ShapeService {

	public static void printShape() {

		Rectangle rect = new Rectangle();
		Circle cir=new Circle();
		rect.drawRectangle();
	}

	public static void main(String[] args) {
		printShape();
	}
}
