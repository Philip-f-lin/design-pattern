package chapter1.calculator2;

public class Operation {

    public static double getResult(String Operate, double numberA, double numberB){
        double result = 0d;
        switch(Operate){
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                result = numberA / numberB;
                break;
        }
        return result;
    }
}
