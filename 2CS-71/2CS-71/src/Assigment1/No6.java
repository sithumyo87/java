package Assigment1;


public class No6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square = new Square(4);
		System.out.println("Perimeter of the square: " + square.getPerimeter());
        System.out.println("Area of the square: " + square.getArea());
	}
	
}

class Rectangle {
	int width, height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	
	public int getPerimeter() {
		return 2 * (width + height);
	}
	public int getArea() {
		return width * height;
	}
}

class Square extends Rectangle{
	public Square(int side) {
		super(side, side);
	}
}
