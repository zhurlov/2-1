public class Cars {

    public String brand, model, color, country;
    public int year;
    double engineVolume;

    Cars (String brand, String model, String color, String country, int year, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        if (color == null) {
            this.color = "белый";
        }
        this.country = country;
        this.year = year;
        if (year <= 0) {
            this.year = 2000;
        }
        this.engineVolume = engineVolume;
        if (engineVolume <= 0) {
            this.engineVolume = engineVolume + 1.5;
        }
        if (model == null) {
            this.model = "default";
        }
        if (brand == null) {
                this.brand = "default";
        }
        if (country == null) {
                this.country = "default";
        }

        }
        void carModels () {
        System.out.println(brand + " " + model + ", " + year + " года выпуска," + " сборка " + country + ", " + color + " цвет," + " объем двигателя " + engineVolume + " л.");
    }
}
