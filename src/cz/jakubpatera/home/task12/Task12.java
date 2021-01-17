package cz.jakubpatera.home.task12;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int glass = 200;
        int milk = 900;
        double correct = 0.9999;


        System.out.println("Zadejte počet prvňáků ve třídě:");

        int n = Integer.parseInt(sc.nextLine());
        double milkCount = ((double) (n * glass ) / milk);

        // Pokud 100% žáků váží váží méně než 30KG.
        int if100Milk = (int) ((milkCount * 100) /100 + correct);
        int if100Pasta = (int)(n + (n*100/100+ correct));
        System.out.println("Pokud 100% všech studentů váží méně než 30kg ...\n Bude zapotřebí " + if100Milk +" Balení mléka " + if100Pasta + " porcí těstovin.");

        //Pokud 60% žáků váží méně jak 30kg.

        int if60Milk = (int)((milkCount * 60) / 100 + correct);
        int if60Pasta = (int) ((n + ((n*60)/100+correct)));
        System.out.println("Pokud 60% všech studentů váží méně než 30kg ...\n Bude zapotřebí " + if60Milk +" Balení mléka " + if60Pasta + " porcí těstovin.");


        // Pokud 1% žáků váží méně než 30kg.

        int if1Milk = (int)((milkCount * 1) / 100 + correct);
        int if1Pasta = (int) ((n + ((n / 100+correct))));
        System.out.println("Pokud 1% všech studentů váží méně než 30kg ...\n Bude zapotřebí " + if1Milk +" Balení mléka " + if1Pasta + " porcí těstovin.");



    }
}
