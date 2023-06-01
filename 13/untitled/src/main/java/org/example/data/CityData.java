package org.example.data;


//enum for city
public enum CityData {
    MOSSCOW("Москва", CountryData.ROSSIA),
    VASHINCTON("Вашинктон", CountryData.USA);

    private String name;
    private CountryData countryData;

    CityData(String name, CountryData countryData) {
        this.name = name;
        this.countryData = countryData;
    }

    public String getName() {
        return this.name;
    }

    public CountryData getCountryData() {
        return this.countryData;
    }
}
