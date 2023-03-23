package Homework18;

import Homework18.Standart;

class Gold extends Homework19.Standart {
    private int lunchAccount = 100000;

    Gold(String cardholder) {
        super(cardholder);
        this.add(100000);
    }

    void lunch(int money) {
        if (this.lunchAccount >= money && money > 0) {
            this.lunchAccount -= money;
        }
    }
}
