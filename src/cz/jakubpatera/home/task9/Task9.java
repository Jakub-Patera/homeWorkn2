package cz.jakubpatera.home.task9;

import java.util.Scanner;

import static java.lang.StrictMath.floor;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Check if number have real part:");
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        if( floor(a) == a ){
            System.out.println("number " + a + " has not real part");
        }else {
            System.out.println("number " + a + "has real part");
        }
    }
}
