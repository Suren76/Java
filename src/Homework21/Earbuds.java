package Homework21;

class Earbuds extends BaseItem {

    protected String jackConnector;
    protected boolean withMicrophone;
    protected int lineLength;
    protected boolean controlButton;
    protected boolean volumeControlButton;


    Earbuds(int cost, int salePrice, String name, String brand, String model, String launchDate, String producedDate, String producedCountry, int weight, String housingMaterial, String housingColor, int rating, String jackConnector, boolean withMicrophone, int lineLength, boolean controlButton, boolean volumeControlButton) {
        super(cost, salePrice, name, brand, model, launchDate, producedDate, producedCountry, weight, housingMaterial, housingColor, rating);
        this.jackConnector = jackConnector;
        this.withMicrophone = withMicrophone;
        this.lineLength = lineLength;
        this.controlButton = controlButton;
        this.volumeControlButton = volumeControlButton;
    }

    String getJackConnector() {
        return jackConnector;
    }

    boolean isWithMicrophone() {
        return withMicrophone;
    }

    int getLineLength() {
        return lineLength;
    }

    boolean isControlButton() {
        return controlButton;
    }

    boolean isVolumeControlButton() {
        return volumeControlButton;
    }
}
