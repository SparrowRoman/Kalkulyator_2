package Kalkulyator_2;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        System.out.println("Введите номер операции:");
        System.out.println("Вычитпние ");
        System.out.println("Сложение ");
        System.out.println("Умножение ");
        System.out.println("Деление ");
        Scanner scanner = new Scanner (System.in);
        int operation = scanner.nextInt();
        System.out.println("Введите первое значение");
        int a = scanner.nextInt();
        System.out.println("Введите второе значение");
        int b = scanner.nextInt();
        int result;
        if (operation == 1) {
            result = a - b;
        } else if (operation == 2){
            result = a + b;
        } else if(operation == 3) {
            result = a * b;
        } else {
            result = a / b;
        }
        System.out.println("Результат =" + result);
    }
}
