package cz.jakubpatera.home.task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Insert your deposit:");
        Scanner sc = new Scanner(System.in);
        double deposit = Double.parseDouble(sc.nextLine());
        System.out.println("Insert your rate Walue");
        double rateWalueIn = Double.parseDouble(sc.nextLine());
        double rateWalue = rateWalueIn / 100;

        double rate = ((deposit*rateWalue)*2);

        System.out.println(rate);

    }
}
