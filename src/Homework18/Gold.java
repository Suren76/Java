package Homework18;

class Gold extends Standart {
    private int lunchAccount = 100000;

    Gold(String cardholder) {
        super(cardholder);
    }

    void lunch(int money) {
        if (this.lunchAccount >= money && money > 0) {
            this.lunchAccount -= money;
        }
    }
}
