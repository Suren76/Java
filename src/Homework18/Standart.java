package Homework18;

class Standart {
    private String cardholder;
    private int account = 0;

    public Standart(String cardholder) {
        this.cardholder =cardholder;
    }

    void cash(int money) {
        if (this.account >= money && money > 0) {
            this.account -= money;
        }
    }

    void add(int money) {
        if (money > 0) {
            this.account += money;
        }
    }

    int getAccount() {
        return this.account;
    }
}
