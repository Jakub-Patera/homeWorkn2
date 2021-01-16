package cz.jakubpatera.home.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(" insert height and width of rectangle:");
        Scanner sc = new Scanner(System.in);
        double h = Double.parseDouble(sc.next());
        double w = Double.parseDouble(sc.next());

        double area = h*w;
        double perimeter = 2*(h+w);
        System.out.println("Area:" + area+"\n" +"Perimeter" + perimeter);
    }
}
