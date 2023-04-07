package Homework19;

public class Standart {
    private int account = 0;
    private String cardholder;
    private String cardNumber;
    private int expirationYear;

    public Standart(String cardholder, String cardNumber, int expirationYear) {
        this.cardholder = cardholder;
        this.cardNumber = cardNumber;
        this.expirationYear = expirationYear;
    }

    public void cash(int money) {
        if (this.account >= money && money > 0) {
            this.account -= money;
        }
    }

    public void add(int money) {
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

    public void buyOnline(int money) {
        cash(money);
    }

}
