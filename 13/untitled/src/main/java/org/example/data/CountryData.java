package org.example.data;


//enum for country
public enum CountryData {
    ROSSIA("Россия"),
    USA("США");
    private String name;

    CountryData(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
