package hit;

import java.util.Scanner;
public class ClassRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of the rectangle");
		double length = sc.nextDouble();
		System.out.println("Enter the width of the rectangle");
		double width = sc.nextDouble();
		double area = length * width;
		System.out.println("area of the rectangle = " + area);
		
		

	}

}
