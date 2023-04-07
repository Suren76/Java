package Homework21;

class Notebook extends PC {

    protected boolean mobileCpu;
    protected boolean mobileGpu;

//
    protected String keyboardLang;
    protected String keyboardType;
    protected int areaOfTouchpad;
    protected boolean fingerprint;
    protected String camera;
    protected String wlan;
    protected String bluetooth;

//    Buttons
    protected boolean airplaneModeToggle;
    protected boolean power;

//    Display
    protected String displayType;
    protected String size;
    protected String resolution;

//    Power
    protected String batteryType;
    protected String batteryCapacity;
    protected boolean removableBattery;
    protected String chargingPort;


    Notebook(int cost, int salePrice, String name, String brand, String model, String launchDate, String producedDate, String producedCountry, int weight, String housingMaterial, String housingColor, int rating, String ram, String cpu, boolean integratedGPU, String gpu, String cooler, boolean ssd, boolean hdd, String osOnSsd, String osOnHdd, String powerSupplyUnit, String motherboardBrand, String motherboardModel, String motherboardChipset, int usb2PortCount, int usb3PortCount, boolean hdmi, boolean vga, boolean ethernet, String audioJack, int sata2, int sata3, int m2, boolean mobileCpu, boolean mobileGpu, String keyboardLang, String keyboardType, int areaOfTouchpad, boolean fingerprint, String camera, String wlan, String bluetooth, boolean airplaneModeToggle, boolean power, String displayType, String size, String resolution, String batteryType, String batteryCapacity, boolean removableBattery, String chargingPort) {
        super(cost, salePrice, name, brand, model, launchDate, producedDate, producedCountry, weight, housingMaterial, housingColor, rating, ram, cpu, integratedGPU, gpu, cooler, ssd, hdd, osOnSsd, osOnHdd, powerSupplyUnit, motherboardBrand, motherboardModel, motherboardChipset, usb2PortCount, usb3PortCount, hdmi, vga, ethernet, audioJack, sata2, sata3, m2);
        this.mobileCpu = mobileCpu;
        this.mobileGpu = mobileGpu;
        this.keyboardLang = keyboardLang;
        this.keyboardType = keyboardType;
        this.areaOfTouchpad = areaOfTouchpad;
        this.fingerprint = fingerprint;
        this.camera = camera;
        this.wlan = wlan;
        this.bluetooth = bluetooth;
        this.airplaneModeToggle = airplaneModeToggle;
        this.power = power;
        this.displayType = displayType;
        this.size = size;
        this.resolution = resolution;
        this.batteryType = batteryType;
        this.batteryCapacity = batteryCapacity;
        this.removableBattery = removableBattery;
        this.chargingPort = chargingPort;
    }

    boolean isMobileCpu() {
        return mobileCpu;
    }

    boolean isMobileGpu() {
        return mobileGpu;
    }

    String getKeyboardLang() {
        return keyboardLang;
    }

    String getKeyboardType() {
        return keyboardType;
    }

    int getAreaOfTouchpad() {
        return areaOfTouchpad;
    }

    boolean isFingerprint() {
        return fingerprint;
    }

    String getCamera() {
        return camera;
    }

    String getWlan() {
        return wlan;
    }

    String getBluetooth() {
        return bluetooth;
    }

    boolean isAirplaneModeToggle() {
        return airplaneModeToggle;
    }

    boolean isPower() {
        return power;
    }

    String getDisplayType() {
        return displayType;
    }

    String getSize() {
        return size;
    }

    String getResolution() {
        return resolution;
    }

    String getBatteryType() {
        return batteryType;
    }

    String getBatteryCapacity() {
        return batteryCapacity;
    }

    boolean isRemovableBattery() {
        return removableBattery;
    }

    String getChargingPort() {
        return chargingPort;
    }
}
