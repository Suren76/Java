package Homework21;

class EarbudsWireless extends Earbuds {

    protected String bluetooth;
    protected String chargingConnector;
    protected boolean wirelessCharging;
    protected String HeadphonesBatteryCapacity;
    protected String caseBatteryCapacity;


    EarbudsWireless(int cost, int salePrice, String name, String brand, String model, String launchDate, String producedDate, String producedCountry, int weight, String housingMaterial, String housingColor, int rating, String jackConnector, boolean withMicrophone, int lineLength, boolean controlButton, boolean volumeControlButton, String bluetooth, String chargingConnector, boolean wirelessCharging, String headphonesBatteryCapacity, String caseBatteryCapacity) {
        super(cost, salePrice, name, brand, model, launchDate, producedDate, producedCountry, weight, housingMaterial, housingColor, rating, jackConnector, withMicrophone, lineLength, controlButton, volumeControlButton);
        this.bluetooth = bluetooth;
        this.chargingConnector = chargingConnector;
        this.wirelessCharging = wirelessCharging;
        HeadphonesBatteryCapacity = headphonesBatteryCapacity;
        this.caseBatteryCapacity = caseBatteryCapacity;
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

    String getHeadphonesBatteryCapacity() {
        return HeadphonesBatteryCapacity;
    }

    String getCaseBatteryCapacity() {
        return caseBatteryCapacity;
    }
}
