package Homework18;

class Standart {
    private String cardholder;
    private int account = 0;

    Standart(String cardholder) {
        this.cardholder = cardholder;
    }

    void cash(int money) {
        if (this.account>= money) {
            this.account-=money;
        }
    }

    void add(int money) {
        this.account += money;
    }
}
