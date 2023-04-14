package Homework19;


class Gold extends Standart {
    private int lunchAccount = 100000;

    Gold(String cardholder, String cardNumber, int expirationYear) {
        super(cardholder, cardNumber,expirationYear);
    }

    void lunch(int money) {
        if (this.lunchAccount >= money && money > 0) {
            this.lunchAccount -= money;
        }
    }

    @Override
    public void buyOnline(int money){
        cash(money-(money/10));
    }

    @Override
    public String toString() {
        return this.getCardholder()+" "+this.getCardNumber()+" "+this.getExpirationYear()+" "+this.getClass().getSimpleName();
    }
}
