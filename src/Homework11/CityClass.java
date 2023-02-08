package Homework11;

import java.util.Arrays;

class City{
    String name = "Not defined";
    float[] geolocation = new float[2];
    String country = "Not defined";
    int population;

    City(){}

    City(String name, float[] geolocation, String country, int population ){
        this.name = name;
        this.geolocation = geolocation.length == 2?geolocation: this.geolocation;
        this.country = country;
        this.population = population;
    }
}

public class CityClass {
    public static void main(String[] args){
        City myCity = new City("Goris",new float[] {39.3028f,46.2019f},"am",20_300);

        if (myCity.name.equals("Not defined")){
            myCity.name = "Kores";
        }

        System.out.println("name: "+myCity.name
                +"\n"+ "geolocation: " + Arrays.toString(myCity.geolocation)
                +"\n"+ "country: " + myCity.country
                +"\n"+ "population: " + myCity.population
        );

    }
}
