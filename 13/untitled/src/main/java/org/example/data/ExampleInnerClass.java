package org.example.data;


// перечисления
public class ExampleInnerClass {

    private static class Cities {
        private String name;
        private Country country;

        Cities(String name, Country country) {
            this.name = name;
            this.country = country;
        }

        private void getCityName() {
            System.out.println(name);
        }
    }

    private static class Country {
        private String name;

        Country(String name) {
            this.name = name;
        }

        private void getContryName() {
            System.out.println(name);
        }
    }
}




