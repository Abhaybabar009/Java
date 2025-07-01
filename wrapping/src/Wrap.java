import java.util.Scanner;

public class Wrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter number: ");
		int number = sc.nextInt();
		
		System.out.println("Given number: "+number);
		
		System.out.println("Binary Equivallent: "+Integer.toBinaryString(number));
		System.out.println("Octal Equivallent: "+Integer.toOctalString(number));
		System.out.println("HexaEquivallent: "+Integer.toHexString(number));
	}

}
