package Homework19;

class Standart {
    private int account = 0;
    private String cardholder;
    private String cardNumber;
    private int expirationYear;

    Standart(String cardholder, String cardNumber, int expirationYear) {
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

    protected String getCardNumber() {
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
