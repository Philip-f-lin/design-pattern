package chapter1.calculator1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){

        System.out.println("**********************************************");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.println("請輸入數字A：");
        String A = sc.nextLine();
        System.out.println("請選擇運算符號(+、-、*、/)：");
        String B = sc.nextLine();
        System.out.println("請輸入數字B：");
        String C = sc.nextLine();
        double D = 0d;

        if (B.equals("+"))
            D = Double.parseDouble(A) + Double.parseDouble(C);
        if (B.equals("-"))
            D = Double.parseDouble(A) - Double.parseDouble(C);
        if (B.equals("*"))
            D = Double.parseDouble(A) * Double.parseDouble(C);
        if (B.equals("/"))
            D = Double.parseDouble(A) / Double.parseDouble(C);

        System.out.println("结果是："+D);

        System.out.println();

        System.out.println("**********************************************");

    }
}
