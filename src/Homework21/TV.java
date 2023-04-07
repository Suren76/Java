package Homework21;

class TV extends BaseItem {
    //    Buttons
    protected boolean power;

    //    Display
    protected String displayType;
    protected String size;
    protected String resolution;

    protected boolean smartTV;
    protected String OS;
    protected String audioSystem;
    protected String tvReceiver;

    //    IO
    protected int usb2PortCount;
    protected int hdmi;
    protected boolean ethernet;
    protected String ci;

    protected boolean camera;
    protected String wlan;
    protected String bluetooth;

    TV(int cost, int salePrice, String name, String brand, String model, String launchDate, String producedDate, String producedCountry, int weight, String housingMaterial, String housingColor, int rating, boolean power, String displayType, String size, String resolution, boolean smartTV, String OS, String audioSystem, String tvReceiver, int usb2PortCount, int hdmi, boolean ethernet, String ci, boolean camera, String wlan, String bluetooth) {
        super(cost, salePrice, name, brand, model, launchDate, producedDate, producedCountry, weight, housingMaterial, housingColor, rating);
        this.power = power;
        this.displayType = displayType;
        this.size = size;
        this.resolution = resolution;
        this.smartTV = smartTV;
        this.OS = OS;
        this.audioSystem = audioSystem;
        this.tvReceiver = tvReceiver;
        this.usb2PortCount = usb2PortCount;
        this.hdmi = hdmi;
        this.ethernet = ethernet;
        this.ci = ci;
        this.camera = camera;
        this.wlan = wlan;
        this.bluetooth = bluetooth;
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

    boolean isSmartTV() {
        return smartTV;
    }

    String getOS() {
        return OS;
    }

    String getAudioSystem() {
        return audioSystem;
    }

    String getTvReceiver() {
        return tvReceiver;
    }

    int getUsb2PortCount() {
        return usb2PortCount;
    }

    int getHdmi() {
        return hdmi;
    }

    boolean isEthernet() {
        return ethernet;
    }

    String getCi() {
        return ci;
    }

    boolean isCamera() {
        return camera;
    }

    String getWlan() {
        return wlan;
    }

    String getBluetooth() {
        return bluetooth;
    }
}
