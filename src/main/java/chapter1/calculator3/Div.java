package chapter1.calculator3;

public class Div extends Operation{
    @Override
    public double getResult(double numberA, double numberB) {
        if (numberB == 0){
            System.out.println("除數不能為 0");
            throw new ArithmeticException();
        }
        return numberA / numberB;
    }
}
