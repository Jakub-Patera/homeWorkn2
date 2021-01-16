package cz.jakubpatera.home.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Insert two natural numbers:");
        Scanner sc = new Scanner(System.in);
       double x = Double.parseDouble(sc.next());
       double y = Double.parseDouble(sc.next());

        double a = x % y;
        double b = x / y ;

        double c = Math.pow(x,2);

        System.out.println( a +"\n"+b+"\n"+c );


    }
}
