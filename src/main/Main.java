package main;

import shape.Circle;
import shape.ListNode;
import shape.Shape;
import shape.ShapeList;
import shape.Square;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(12.0);
		Shape square = new Square(13.4);
		System.out.println("Perimeter of given square is " + square.countP());
		System.out.println("Perimeter of given circle is " + circle.countP());
		
		
		Shape c1 = new Circle(12.0);
		Shape c2 = new Circle(2.0);
		Shape c3 = new Circle(12.5);
		Shape c4 = new Circle(7.6);
		Shape s1 = new Square(3.4);
		Shape s3 = new Square(6.4);
		Shape s2 = new Square(11.4);
		
		ShapeList list=  new ShapeList();
		list.addNew(s1);
		list.addNew(s2);
		list.addNew(s3);
		list.addNew(c3);
		list.addNew(c2);
		list.addNew(c1);
		
		list.print();
	}

}
