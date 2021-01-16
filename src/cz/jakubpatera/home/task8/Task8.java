package cz.jakubpatera.home.task8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("How far is Tunder?\n insert number of second from lightning:");
        Scanner sc = new Scanner(System.in);
        double sec = Double.parseDouble(sc.nextLine());
        double speed = 344;

        double tunder = (sec * speed)/1000;

        System.out.println("Tunder is " + tunder + " km away");
    }
}
