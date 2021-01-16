package cz.jakubpatera.home.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(" insert number with 3 digits");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int sum = getSum(n);
        System.out.println(sum);
    }


    private static int getSum(int n) {
        int sum = 0;

        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }

        return sum;
    }
}
