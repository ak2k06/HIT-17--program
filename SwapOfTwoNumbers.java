package hit;

public class SwapOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=100, second=150;
		System.out.println("---Before swap---");
		System.out.println("First Number is = " +first);
		System.out.println("Second Number is =" + second);
		int temporary= first;
		 first =second;
		second=temporary;
		System.out.println("----After swap---");
		System.out.println("First Number is =" + first);
		System.out.println("Second Number is = " + second);
	}

}
