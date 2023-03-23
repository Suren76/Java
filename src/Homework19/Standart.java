package Homework19;

class Standart {
    private String cardholder;
    private int cardNumber;
    private int account = 0;
    private int expirationYear;

    Standart(String cardholder, int cardNumber, int expirationYear) {
        this.cardholder = cardholder;
        this.cardNumber = cardNumber;
        this.expirationYear = expirationYear;
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

    protected int getCardNumber() {
        return this.cardNumber;
    }

    protected String getCardholder() {
        return this.cardholder;
    }

    protected int getExpirationYear() {
        return this.expirationYear;
    }

    void buyOnline(int money) {
        cash(money);
    }
}
