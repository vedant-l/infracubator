package org.example;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String expression = "";
        System.out.println("Basic Calculator © (Type \"/exit\" to quit)");

        while (true) {
            System.out.println("Enter operand 1: ");
            expression = scan.nextLine();
            if (expression.equals("/exit")) {
                return;
            }
            Double oneOperand = Double.parseDouble(expression);

            System.out.println("Enter operand 2: ");
            expression = scan.nextLine();
            if (expression.equals("/exit")) {
                return;
            }
            Double otherOperand = Double.parseDouble(expression);

            System.out.println("Enter operation(+-*/): ");
            expression = scan.nextLine();
            if (expression.equals("/exit")) {
                return;
            }

            switch (expression) {
                case "+":
                    System.out.println("Result: " + (oneOperand + otherOperand));
                    break;
                case "-":
                    System.out.println("Result: " + (oneOperand - otherOperand));
                    break;
                case "*":
                    System.out.println("Result: " + (oneOperand * otherOperand));
                    break;
                case "/":
                    System.out.println("Result: " + (oneOperand / otherOperand));
                    break;
                default:
                    System.out.println("We don't do that here.");
            }
        }
    }
}
