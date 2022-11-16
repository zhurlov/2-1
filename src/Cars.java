public class Cars {

    public String brand, model, color, country;
    public int year;
    double engineVolume;

    void carModels () {
        System.out.println(brand + " " + model + ", " + year + " года выпуска," + " сборка " + country + ", " + color + " цвет," + " объем двигателя " + engineVolume + " л.");
    }
}
