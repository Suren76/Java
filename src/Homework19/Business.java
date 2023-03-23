package Homework19;


class Business extends Standart {
    private boolean milion = false;
    private int bonus = 0;

    Business(String cardholder, int cardNumber, int expirationYear) {
        super(cardholder, cardNumber,expirationYear);
    }

    void getMilion() {
        if (!milion){
            this.milion = true;
            add(1000000);
        }
    }

    @Override
    void cash(int money) {
        bonus+=2;
        super.cash(money);
    }

    @Override
    public String toString() {
        return this.getCardholder()+" "+this.getCardNumber()+" "+this.getExpirationYear()+" "+this.getClass().getName();
    }
}
