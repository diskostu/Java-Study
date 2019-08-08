import java.util.Scanner;

/* 
    A quick (No knowledge) calculator made using Java , which i dont know nothing Yet
    I have some knowledge in Python , C# , C and GO , and now i want to learn Java

    EDIT : I know there are some errors , but in the essence , i quite got it right , right ?
*/
//import com.sun.java_cup.internal.runtime.Scanner;

public class Calculator {
	public static void main(String[] args) {
		float result = 0;
		char operator = '+';
		String newCalc = "y";


		while (newCalc == "y") {

			System.out.println("Enter a value for A :");
			Scanner sc = new Scanner(System.in);

			int valueA = sc.nextInt();

			System.out.println("Enter a value for B :");
			int valueB = sc.nextInt();


			System.out.println("Choose one of the following operations :");
			System.out.println("1 for Addition");
			System.out.println("2 for Subtraction :");
			System.out.println("3 for Multiplication");
			System.out.println("4 for Division");

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

			System.out.println("The result of " + valueA + " " + operator + " " + valueB + " = " + result);

			System.out.println("Would you like to do another calculation ? [Y/N]");
			newCalc = sc.next();

			if (newCalc != "y" || newCalc != "Y") {
				newCalc = "N";
			}
		}
	}
}