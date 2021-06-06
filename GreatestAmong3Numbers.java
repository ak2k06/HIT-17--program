package hit;

import java.util.Scanner;
public class GreatestAmong3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, largest, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number : ");
		a= sc.nextInt();
		System.out.println("Enter The Second Number : ");
		b= sc.nextInt();
		System.out.println("Enter The Third Number : ");
		c= sc.nextInt();
		temp = a>b ? a:b;
		largest = c > temp ? c : temp;
		System.out.println(largest  +  " The Greatest Among 3 Number ");
	}

}
