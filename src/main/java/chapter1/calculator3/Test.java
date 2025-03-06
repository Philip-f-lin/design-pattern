package chapter1.calculator3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double result = 0d;

        System.out.println("請輸入數字A：");
        double numberA = Double.parseDouble(sc.nextLine());
        System.out.println("請選擇運算符號(+、-、*、/)：");
        String operate = sc.nextLine();
        System.out.println("請輸入數字B：");
        double numberB = Double.parseDouble(sc.nextLine());

        Operation operation = OperationFactory.getOperation(operate);
        result = operation.getResult(numberA, numberB);

        System.out.println("结果是：" + result);
    }
}
