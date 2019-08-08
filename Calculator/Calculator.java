/* 
    A quick (No knowledge) calculator made using Java , which i dont know nothing Yet
    I have some knowledge in Python , C# , C and GO , and now i want to learn Java
*/
import com.sun.java_cup.internal.runtime.Scanner;

public class calculator{
    public static void main(String[] args) {
        float result;
        char operator;
        char newCalc = 'y';

        System.out.println("Enter a value for A :");
        int valueA  =   Scanner.nextInt();

        System.out.println("Enter a value for B :");
        int valueB =   Scanner.nextInt();

        while (newCalc == 'Y') {
            
            System.out.println("Choose one of the following operations :");
            System.out.println("1 for Addition");
            System.out.println("2 for Subtraction :");
            System.out.println("3 for Multiplication");
            System.out.println("4 for Division");

            int optionCalc =   Scanner.next();

            
            switch(optionCalc){
                case    1   :
                    operator    =   '+';
                    result  =   valueA  +   valueB;
                case    2   :   
                    operator    =   '-';
                    result  =   valueA  -   valueB;
                case    3   :   
                    operator    =   'x';
                    result  =   valueA  *   valueB;
                case    4   :
                    operator    =   '/';   
                    result  =   valueA  /   valueB;
            }
        
            System.out.println("The result of "+valueA+" "+operator+" "+valueB+" = "+result);
            
            System.out.println("Would you like to do another calculation ? [Y/N]");
            newCalc =   Scanner.next();

            if (newCalc != 'y' && newCalc != 'y'){
                break;
            }
        }
    }
}