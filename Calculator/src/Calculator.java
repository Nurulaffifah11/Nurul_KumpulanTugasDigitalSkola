public class Calculator {

    double number1;
    double number2;

    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double add(){
        return number1 + number2;
    }

    public double subtract(){
        return number1 - number2;
    }

    public double multiply(){
        return number1 * number2;
    }

    public double divide(){
        if(number2 != 0){
            return number1 / number2;
        }
        else {
            System.out.println("Error. Numbers cannot divide by zero.");
            return 0;
        }
    }
}
