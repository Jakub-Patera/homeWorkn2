package cz.jakubpatera.home.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Insert rasius of circle");
        Scanner sc = new Scanner(System.in);
        double r = Double.parseDouble(sc.nextLine());
        double pi = Math.PI;

        double area = pi*(r*r);

        System.out.println(area);
    }
}
