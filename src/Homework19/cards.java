package Homework19;

import Homework18.Standart;

public class cards {
    public static void main(String[] args) {
        Standart card1 = new Standart("Smbulik");

        card1.add(-10000);

        System.out.println(card1.getAccount());
    }
}
