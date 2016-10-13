package fcu.iecs.oop;
import java.util.Scanner;
public class PrintNumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a integer: ");
		int integer = keyboard.nextInt();
		switch (integer){
			case 1:
				System.out.println("The input integer is ONE!¡L.");
			    break;
			case 2:
				System.out.println("The input integer is two!¡L.");
			    break;
			case 3:
				System.out.println("The input integer is three!¡L.");
				break;
			case 4:
				System.out.println("The input integer is four!¡L.");
				break;
			case 5:
				System.out.println("The input integer is five!¡L.");
				break;
			case 6:
				System.out.println("The input integer is six!¡L.");
				break;
			case 7:
				System.out.println("The input integer is seven!¡L.");
				break;
			case 8:
				System.out.println("The input integer is eight!¡L.");
				break;
			case 9:
				System.out.println("The input integer is nine!¡L.");
				break;
			default:
				System.out.println("The input integer is OTHER!¡L.");
				break;
		
		
		
		
		}
				
	}
}