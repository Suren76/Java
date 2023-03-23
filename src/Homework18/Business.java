package Homework18;

class Business extends Standart {
    private boolean milion = false;

    Business(String cardholder){
        super(cardholder);
    }

    void getMilion() {
        if (!milion){
            this.milion = true;
            add(1000000);
        }
    }
}
