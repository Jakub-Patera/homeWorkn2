package cz.jakubpatera.home.task10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("insert your weight(kg):");
        Scanner sc = new Scanner(System.in);
        float w  = Float.parseFloat(sc.nextLine());
        System.out.println("Insert your height(cm)");
        float h = Float.parseFloat(sc.nextLine());

        float idealWeight = (h -110);

        float gain = idealWeight -  w;
        float lose = w - idealWeight;

        if(w>idealWeight){
            System.out.println(-(gain));
        }else {
            System.out.println(gain);
        }
    }
}
