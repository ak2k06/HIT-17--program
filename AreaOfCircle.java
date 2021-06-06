package hit;

import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
	int r;
	double pi =3.14, area;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the radius of circle");
	r = s.nextInt();
	area = pi * r*r;
	System.out.println("Area of circle is :" + area);

	}

}





// area of circle - perimeter of circle = pi * radius * radius