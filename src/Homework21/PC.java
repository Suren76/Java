package Homework21;

class PC extends BaseItem {
    protected String ram;
    protected String cpu;
    protected boolean integratedGPU;
    protected String gpu;
    protected String cooler;
    protected boolean ssd;
    protected boolean hdd;
    protected String osOnSsd;
    protected String osOnHdd;
    protected String powerSupplyUnit;

    //    MOTHERBOARD
    protected String motherboardBrand;
    protected String motherboardModel;
    protected String motherboardChipset;

//    IO
    protected int usb2PortCount;
    protected int usb3PortCount;
    protected boolean hdmi;
    protected boolean vga;
    protected boolean ethernet;
    protected String audioJack;

    protected int sata2;
    protected int sata3;
    protected int m2;


    PC(int cost, int salePrice, String name, String brand, String model, String launchDate, String producedDate, String producedCountry, int weight, String housingMaterial, String housingColor, int rating, String ram, String cpu, boolean integratedGPU, String gpu, String cooler, boolean ssd, boolean hdd, String osOnSsd, String osOnHdd, String powerSupplyUnit, String motherboardBrand, String motherboardModel, String motherboardChipset, int usb2PortCount, int usb3PortCount, boolean hdmi, boolean vga, boolean ethernet, String audioJack, int sata2, int sata3, int m2) {
        super(cost, salePrice, name, brand, model, launchDate, producedDate, producedCountry, weight, housingMaterial, housingColor, rating);
        this.ram = ram;
        this.cpu = cpu;
        this.integratedGPU = integratedGPU;
        this.gpu = gpu;
        this.cooler = cooler;
        this.ssd = ssd;
        this.hdd = hdd;
        this.osOnSsd = osOnSsd;
        this.osOnHdd = osOnHdd;
        this.powerSupplyUnit = powerSupplyUnit;
        this.motherboardBrand = motherboardBrand;
        this.motherboardModel = motherboardModel;
        this.motherboardChipset = motherboardChipset;
        this.usb2PortCount = usb2PortCount;
        this.usb3PortCount = usb3PortCount;
        this.hdmi = hdmi;
        this.vga = vga;
        this.ethernet = ethernet;
        this.audioJack = audioJack;
        this.sata2 = sata2;
        this.sata3 = sata3;
        this.m2 = m2;
    }

    String getRam() {
        return ram;
    }

    String getCpu() {
        return cpu;
    }

    boolean isIntegratedGPU() {
        return integratedGPU;
    }

    String getGpu() {
        return gpu;
    }

    String getCooler() {
        return cooler;
    }

    boolean isSsd() {
        return ssd;
    }

    boolean isHdd() {
        return hdd;
    }

    String getOsOnSsd() {
        return osOnSsd;
    }

    String getOsOnHdd() {
        return osOnHdd;
    }

    String getPowerSupplyUnit() {
        return powerSupplyUnit;
    }

    String getMotherboardBrand() {
        return motherboardBrand;
    }

    String getMotherboardModel() {
        return motherboardModel;
    }

    String getMotherboardChipset() {
        return motherboardChipset;
    }

    int getUsb2PortCount() {
        return usb2PortCount;
    }

    int getUsb3PortCount() {
        return usb3PortCount;
    }

    boolean isHdmi() {
        return hdmi;
    }

    boolean isVga() {
        return vga;
    }

    boolean isEthernet() {
        return ethernet;
    }

    String getAudioJack() {
        return audioJack;
    }

    int getSata2() {
        return sata2;
    }

    int getSata3() {
        return sata3;
    }

    int getM2() {
        return m2;
    }
}
