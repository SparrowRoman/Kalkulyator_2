package UgadaykaCikl;

import java.util.Scanner;

public class Main {
    public static void main(String[]agrs){
        System.out.println("Ваша задача угадать число");
        Scanner scanner = new Scanner (System.in);
        int range = 20;

        int number_II = (int) (Math.random()*range);
        while (true) {
            System.out.println("Напишиете число от 0 до 20 ");
            int number = scanner.nextInt();
            if (number == number_II) {
                System.out.println("Вы угадали ! Поздравляю!");
                break;
            } else if (number < number_II) {
                System.out.println("Введенное число меньше чем у ИИ");
            } else {
                System.out.println("Введенное число больше чем у ИИ");
            }

        }
        scanner.close();

    }
}
