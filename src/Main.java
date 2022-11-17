

public class Main {
    public static void main(String[] args) {

        Cars lG = new Cars("Lada", "Granta", null, "Россия", 2015, 1.7);
        //lG.brand = "Lada";
        //lG.model = "Granta";
        //lG.engineVolume = 1.7;
        //lG.color = "желтый";
        //lG.year = 2015;
        //lG.country = "Россия";
        lG.carModels();

        Cars audi = new Cars("Audi", "A8 50 L TDI quattro", "черный", "Германия", 2020, 3.0);
        //audi.brand = "Audi";
        //audi.model = "A8 50 L TDI quattro";
        //audi.engineVolume = 3.0;
        //audi.color = "черный";
        //audi.year = 2020;
        //audi.country = "Германия";
        audi.carModels();

        Cars bmw = new Cars("BMW", "Z8", "черный", "Германия", 2021, 3.0);
        //bmw.brand = "BMW";
        //bmw.model = "Z8";
        //bmw.engineVolume = 3.0;
        //bmw.color = "черный";
        //bmw.year = 2021;
        //bmw.country = "Германия";
        bmw.carModels();

        Cars kia = new Cars("Kia", "Sportage 4 поколения", "красный", "Южная Корея", 2018, 2.4);
        //kia.brand = "Kia";
        //kia.model = "Sportage 4 поколения";
        //kia.engineVolume = 2.4;
        //kia.color = "красный";
        //kia.year = 2018;
        //kia.country = "Южная Корея";
        kia.carModels();

        Cars hA = new Cars("Hyundai", "Avante", "оранжевый", "Южная Корея", 2016, 1.6);
        //hA.brand = "Hyundai";
        //hA.model = "Avante";
        //hA.engineVolume = 1.6;
        //hA.color = "оранжевый";
        //hA.year = 2016;
        //hA.country = "Южная Корея";
        hA.carModels();

    }
}