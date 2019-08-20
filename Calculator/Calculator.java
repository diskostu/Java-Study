import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		float   result 		= 	0;
        char    operator 	= 	'+';
		Boolean newCalc 	=	true;
		Scanner sc = new Scanner(System.in);
		
		while (newCalc) {
			System.out.println("Enter a value for A :");
			int valueA = sc.nextInt();

			System.out.println("Enter a value for B :");
			int valueB = sc.nextInt();

			System.out.println("Choose one of the following operations :");
			System.out.println("\t1 for Addition");
			System.out.println("\t2 for Subtraction :");
			System.out.println("\t3 for Multiplication");
			System.out.println("\t4 for Division");

			int optionCalc = sc.nextInt();

			switch (optionCalc) {
			case 1:
				operator = '+';
				result = valueA + valueB;
				break;
			case 2:
				operator = '-';
				result = valueA - valueB;
				break;
			case 3:
				operator = 'x';
				result = valueA * valueB;
				break;
			case 4:
				operator = '/';
				result = valueA / valueB;
				break;
			}

			System.out.println("\n\n\tThe result of " + valueA + " " + operator + " " + valueB + " = " + result);

			System.out.println("\nWould you like to do another calculation ? [Y/N]");

			if (sc.next().equals("n")){
				newCalc	=	false;
			}
			else {	newCalc	=	true;}
		}
		System.out.println("\nThanks for using Luk3's Calculator");
	}
}