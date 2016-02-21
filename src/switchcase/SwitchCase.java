package switchcase;

/**
 * Created by Yuriy on 21.02.2016.
 */

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        System.out.print("Enter number x: ");
        x = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
        //nested-if
        String xStr;
        if (x == 9)
            System.out.println("nine");
        if (x == 8)
            System.out.println("eight");
        if (x == 7)
            System.out.println("seven");
        if (x == 6)
            System.out.println("six");
        if (x == 5)
            System.out.println("five");
        if (x == 4)
            System.out.println("four");
        if (x == 3)
            System.out.println("three");
        if (x == 2)
            System.out.println("twoo");
        if (x == 1)
            System.out.println("one");
        if (x<1|x>9)
            System.out.println("other");
        //switch
        switch (x) {
            case 1:
                xStr = "one";
                break;
            case 2:
                xStr = "twoo";
                break;
            case 3:
                xStr = "three";
                break;
            case 4:
                xStr = "four";
                break;
            case 5:
                xStr = "five";
                break;
            case 6:
                xStr = "six";
                break;
            case 7:
                xStr = "seven";
                break;
            case 8:
                xStr = "eight";
                break;
            case 9:
                xStr = "nine";
                break;
            default:
                xStr = "other";
                break;
        }
                System.out.println(xStr);
    }
}

