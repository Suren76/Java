package Homework21;

abstract class Smartphone extends BaseItem {

//    DISPLAY
    protected String displayType;
    protected String size;
    protected String resolution;

    //    PLATFORM
    protected String os;
    protected String cpu;
    protected String gpu;
    protected String rom;
    protected String ram;

//    CAMERA
    protected String mainCameraResolution;
    protected String mainCameraDiaphragm;
    protected String mainCameraFlash;

    protected String frontCameraResolution;
    protected String frontCameraDiaphragm;
    protected String frontCameraFlash;

//    CONNS
    protected String wlan;
    protected String bluetooth;
    protected String positioning;
    protected String nfc;
    protected String radio;
    protected String network;

//    IO
    protected String microUsb;
    protected boolean otg;
    protected String headPhonesJack;
    protected String simFormat;
    protected boolean dualSim;
    protected boolean microSD;

//    SENSORS
    protected boolean fingerprint;
    protected boolean accelerometer;
    protected boolean gyro;
    protected boolean proximity;
    protected boolean compass;
    protected boolean gravity;
    protected boolean orientation;
    protected boolean barometer;
    protected boolean infrared;

//    BATTERY
    protected String batteryType;
    protected String batteryCapacity;
    protected boolean removableBattery;

//    IMEI
    protected String IMEI1;
    protected String IMEI2;

    Smartphone(int cost, int salePrice, String name, String brand, String model, String launchDate, String producedDate, String producedCountry, int weight, String housingMaterial, String housingColor, int rating, String type, String size, String resolution, String os, String cpu, String gpu, String rom, String ram, String mainCameraResolution, String mainCameraDiaphragm, String mainCameraFlash, String frontCameraResolution, String frontCameraDiaphragm, String frontCameraFlash, String wlan, String bluetooth, String positioning, String nfc, String radio, String network, String microUsb, boolean otg, String headPhonesJack, String simFormat, boolean dualSim, boolean microSD, boolean fingerprint, boolean accelerometer, boolean gyro, boolean proximity, boolean compass, boolean gravity, boolean orientation, boolean barometer, boolean infrared, String batteryType, String batteryCapacity, boolean removableBattery, String IMEI1, String IMEI2) {
        super(cost, salePrice, name, brand, model, launchDate, producedDate, producedCountry, weight, housingMaterial, housingColor, rating);
        this.displayType = type;
        this.size = size;
        this.resolution = resolution;
        this.os = os;
        this.cpu = cpu;
        this.gpu = gpu;
        this.rom = rom;
        this.ram = ram;
        this.mainCameraResolution = mainCameraResolution;
        this.mainCameraDiaphragm = mainCameraDiaphragm;
        this.mainCameraFlash = mainCameraFlash;
        this.frontCameraResolution = frontCameraResolution;
        this.frontCameraDiaphragm = frontCameraDiaphragm;
        this.frontCameraFlash = frontCameraFlash;
        this.wlan = wlan;
        this.bluetooth = bluetooth;
        this.positioning = positioning;
        this.nfc = nfc;
        this.radio = radio;
        this.network = network;
        this.microUsb = microUsb;
        this.otg = otg;
        this.headPhonesJack = headPhonesJack;
        this.simFormat = simFormat;
        this.dualSim = dualSim;
        this.microSD = microSD;
        this.fingerprint = fingerprint;
        this.accelerometer = accelerometer;
        this.gyro = gyro;
        this.proximity = proximity;
        this.compass = compass;
        this.gravity = gravity;
        this.orientation = orientation;
        this.barometer = barometer;
        this.infrared = infrared;
        this.batteryType = batteryType;
        this.batteryCapacity = batteryCapacity;
        this.removableBattery = removableBattery;
        this.IMEI1 = IMEI1;
        this.IMEI2 = IMEI2;
    }


    String getType() {
        return displayType;
    }

    String getSize() {
        return size;
    }

    String getResolution() {
        return resolution;
    }

    String getOs() {
        return os;
    }

    String getCpu() {
        return cpu;
    }

    String getGpu() {
        return gpu;
    }

    String getRom() {
        return rom;
    }

    String getRam() {
        return ram;
    }

    String getMainCameraResolution() {
        return mainCameraResolution;
    }

    String getMainCameraDiaphragm() {
        return mainCameraDiaphragm;
    }

    String getMainCameraFlash() {
        return mainCameraFlash;
    }

    String getFrontCameraResolution() {
        return frontCameraResolution;
    }

    String getFrontCameraDiaphragm() {
        return frontCameraDiaphragm;
    }

    String getFrontCameraFlash() {
        return frontCameraFlash;
    }

    String getWlan() {
        return wlan;
    }

    String getBluetooth() {
        return bluetooth;
    }

    String getPositioning() {
        return positioning;
    }

    String getNfc() {
        return nfc;
    }

    String getRadio() {
        return radio;
    }

    String getNetwork() {
        return network;
    }

    String getMicroUsb() {
        return microUsb;
    }

    boolean isOtg() {
        return otg;
    }

    String getHeadPhonesJack() {
        return headPhonesJack;
    }

    String getSimFormat() {
        return simFormat;
    }

    boolean isDualSim() {
        return dualSim;
    }

    boolean isMicroSD() {
        return microSD;
    }

    boolean isFingerprint() {
        return fingerprint;
    }

    boolean isAccelerometer() {
        return accelerometer;
    }

    boolean isGyro() {
        return gyro;
    }

    boolean isProximity() {
        return proximity;
    }

    boolean isCompass() {
        return compass;
    }

    boolean isGravity() {
        return gravity;
    }

    boolean isOrientation() {
        return orientation;
    }

    boolean isBarometer() {
        return barometer;
    }

    boolean isInfrared() {
        return infrared;
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

    String getIMEI1() {
        return IMEI1;
    }

    String getIMEI2() {
        return IMEI2;
    }
}
