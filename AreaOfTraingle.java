package hit;

import java.util.Scanner;
public class AreaOfTraingle {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the width of the traingle");
	double base = scanner.nextDouble();
	System.out.println("Enter the Height of the traingle");
	double height= scanner.nextDouble();
	double area = (base*height)/2;
	System.out.println("Area of Triangle is : " + area);

	}

}
