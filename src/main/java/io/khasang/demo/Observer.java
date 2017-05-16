package io.khasang.demo;

import java.util.Scanner;
/**
 * Created by dinar on 15.05.2017.
 */
public class Observer {

    public static int getMinutes() {
        Scanner in = new Scanner(System.in);
        System.out.print(" Please enter the minutes:");
        return in.nextInt();
    }

    public static void show(Point point) {
        System.out.print("Now it is: ");
        switch (point) {
            case GREEN:
                System.out.println("green");
                break;
            case YELLOW:
                System.out.println("yellow");
                break;
            case RED:
                System.out.println("red");
                break;
            default:
                System.out.println("????");
        }
    }

}
