package Homework21;

abstract class BaseItem {
    protected int cost;
    protected int salePrice;

    protected String name;
    protected String brand;
    protected String model;

    protected String launchDate;
    protected String producedDate;
    protected String producedCountry;

    protected int weight;
    protected String housingMaterial;
    protected String housingColor;

    protected int rating;

    BaseItem(int cost, int salePrice, String name, String brand, String model, String launchDate, String producedDate, String producedCountry, int weight, String housingMaterial, String housingColor, int rating) {
        this.cost = cost;
        this.salePrice = salePrice;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.launchDate = launchDate;
        this.producedDate = producedDate;
        this.producedCountry = producedCountry;
        this.weight = weight;
        this.housingMaterial = housingMaterial;
        this.housingColor = housingColor;
        this.rating = rating;
    }


    String getName() {
        return this.name;
    }

    String getBrand() {
        return this.brand;
    }

    String getModel() {
        return this.model;
    }

    String getLaunchDate() {
        return this.launchDate;
    }

    String getProducedDate() {
        return this.producedDate;
    }

    String getProducedCountry() {
        return this.producedCountry;
    }

    int getWeight() {
        return this.weight;
    }

    String getHousingMaterial() {
        return this.housingMaterial;
    }

    String getHousingColor() {
        return this.housingColor;
    }

    int getRating() {
        return this.rating;
    }

    protected int getCost () {
        return this.cost;
    }

    int getSalePrice () {
        return this.salePrice;
    }
}
