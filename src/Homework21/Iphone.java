package Homework21;

class Iphone extends Smartphone {
    //    Software
    protected String osVersion;

    Iphone(int cost, int salePrice, String name, String brand, String model, String launchDate, String producedDate, String producedCountry, int weight, String housingMaterial, String housingColor, int rating, String displayType, String size, String resolution, String os, String cpu, String gpu, String rom, String ram, String mainCameraResolution, String mainCameraDiaphragm, String mainCameraFlash, String frontCameraResolution, String frontCameraDiaphragm, String frontCameraFlash, String wlan, String bluetooth, String positioning, String nfc, String radio, String network, String microUsb, boolean otg, String headPhonesJack, String simFormat, boolean dualSim, boolean microSD, boolean fingerprint, boolean accelerometer, boolean gyro, boolean proximity, boolean compass, boolean gravity, boolean orientation, boolean barometer, boolean infrared, String batteryType, String batteryCapacity, boolean removableBattery, String IMEI1, String IMEI2, String osName, String osVersion, String kernelName, String kernelVersion, String recovery, String isRootAccess) {
        super(cost, salePrice,
                name, brand, model, launchDate, producedDate, producedCountry,
                weight, housingMaterial, housingColor, rating, displayType, size, resolution,
                "IOS", cpu, gpu, rom, ram,
                mainCameraResolution, mainCameraDiaphragm, mainCameraFlash,
                frontCameraResolution, frontCameraDiaphragm, frontCameraFlash,
                wlan, bluetooth, positioning, nfc, radio, network,
                microUsb, otg, headPhonesJack, simFormat, dualSim, microSD,
                fingerprint, accelerometer, gyro, proximity, compass, gravity, orientation, barometer, infrared,
                batteryType, batteryCapacity, removableBattery,
                IMEI1, IMEI2);


        this.osVersion = osVersion;

    }

    String getOsVersion() {
        return osVersion;
    }
}
