
import java.util.Scanner;

public class MenuCalculator {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        while (true){
            //Display Menu Calculator
            System.out.println("=======CALCULATOR MENU=======");
            System.out.println("1. Add");
            System.out.println("2. SUBSTRACT");
            System.out.println("3. MULTIPLY");
            System.out.println("4. DIVIDE");
            System.out.println("5. EXIT");

            //Option
            System.out.print("Input your choice: ");
            int choice = input.nextInt();

            if(choice > 4){
                System.out.print("Your choice is not available. Try Again!");
                break;
            }

            //Variable
            System.out.print("Enter the number 1: ");
            double number1 = input.nextDouble();
            System.out.print("Enter the number 2: ");
            double number2 = input.nextDouble();
            double result = 0;

            //Memanggil Class Calculator dengan object calculator
            Calculator calculator = new Calculator(number1, number2);

            switch (choice) {
                case 1:
                    result = calculator.add();
                    break;
                case 2:
                    result = calculator.subtract();
                    break;
                case 3:
                    result = calculator.multiply();
                    break;
                case 4:
                    result = calculator.divide();
                    break;
                default:
                    System.out.println("Your choice is not available");
                    continue; // Skip the rest of the loop and start over
            }

            // Display the result
            System.out.println("Result: " + result);

        }
        input.close();
    }
}