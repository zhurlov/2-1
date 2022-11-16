public class Human {

    public String name, jobTitle;
    public int yearOfBirth;
    public String town;

    Human(String name, String jobTitle, int yearOfBirth, String town) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
    }


    void men () {
        System.out.println("Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + " .Будем знакомы!");
    }
    void girls () {
        System.out.println("Привет! Меня зовут " + name + " Я из города " + town + " Я родилась в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + " .Будем знакомы!");


    }
}
