package Homework21;

class HeadphonesWireless extends Headphones {

    protected String bluetooth;
    protected String chargingConnector;
    protected boolean wirelessCharging;
    protected boolean wiredConnection;
    protected String batteryCapacity;

    HeadphonesWireless(int cost, int salePrice, String name, String brand, String model, String launchDate, String producedDate, String producedCountry, int weight, String housingMaterial, String housingColor, int rating, String jackConnector, boolean withMicrophone, int lineLength, boolean controlButton, boolean volumeControlButton, String bluetooth, String chargingConnector, boolean wirelessCharging, boolean wiredConnection, String batteryCapacity) {
        super(cost, salePrice, name, brand, model, launchDate, producedDate, producedCountry, weight, housingMaterial, housingColor, rating, jackConnector, withMicrophone, lineLength, controlButton, volumeControlButton);
        this.bluetooth = bluetooth;
        this.chargingConnector = chargingConnector;
        this.wirelessCharging = wirelessCharging;
        this.wiredConnection = wiredConnection;
        this.batteryCapacity = batteryCapacity;
    }

    String getBluetooth() {
        return bluetooth;
    }

    String getChargingConnector() {
        return chargingConnector;
    }

    boolean isWirelessCharging() {
        return wirelessCharging;
    }

    boolean isWiredConnection() {
        return wiredConnection;
    }

    String getBatteryCapacity() {
        return batteryCapacity;
    }
}