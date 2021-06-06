package hit;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int first=13, second=17;
	System.out.println("---before swap---");
	System.out.println("First Number is = " + first);
	System.out.println("Second Number is = " + second);
	first = first - second;
	second = first + second;
	first = first - second;
	System.out.println("---after swap---");
	System.out.println("First Number is = " + first);
	System.out.println("Second Number is = " + second);
	
	

	}

}
