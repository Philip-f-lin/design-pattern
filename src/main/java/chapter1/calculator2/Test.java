package chapter1.calculator2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double result = 0;

        System.out.println("請輸入數字A：");
        double numberA = Double.parseDouble(sc.nextLine());
        System.out.println("請選擇運算符號(+、-、*、/)：");
        String operate = sc.nextLine();
        System.out.println("請輸入數字B：");
        double numberB = Double.parseDouble(sc.nextLine());

        result = Operation.getResult(operate, numberA, numberB);


        System.out.println("结果是：" + result);
    }
}
