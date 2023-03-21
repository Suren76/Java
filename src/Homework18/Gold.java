package Homework18;

class Gold extends Standart {

    Gold(String cardholder) {
        super(cardholder);
        this.add(100000);
    }

    void lunch(int money) {
        this.cash(money);
    }
}
