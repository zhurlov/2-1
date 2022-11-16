public class Main {
    public static void main(String[] args) {

        Human maksim = new Human();
        maksim.name = "Максим";
        maksim.yearOfBirth = 1992;
        maksim.town = "Екатеринбург";
        maksim.jobTitle = "программист";
        maksim.men();

        Human anya = new Human();
        anya.name = "Аня";
        anya.yearOfBirth = 1985;
        anya.town = "Москва";
        anya.jobTitle = "гейм-дизайнер";
        anya.girls();

        Human katia = new Human();
        katia.name = "Катя";
        katia.yearOfBirth = 2000;
        katia.town = "Сочи";
        katia.jobTitle = "судебный секретарь";
        katia.girls();

        Human artyom = new Human();
        artyom.name = "Артем";
        artyom.yearOfBirth = 1974;
        artyom.town = "Череповец";
        artyom.jobTitle = "оператор вышки";
        artyom.men();

    }
}