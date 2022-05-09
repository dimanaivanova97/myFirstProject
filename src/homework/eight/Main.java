package homework.eight;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println("Name: " + person.name);
        System.out.println("Sex: " + person.sex);
        System.out.println("Language spoken: " + person.languageSpoken);
        System.out.println("EGN: " + person.EGN);
        System.out.println("Religion: " + person.religion);
        System.out.println("Age: " + person.age);
        System.out.println("Country: " + person.country);
        System.out.println("Date of birth: " + person.dateOfBirth);
        System.out.println("Nationality: " + person.nationality);
        System.out.println("Job: " + person.job);
        System.out.println();
        System.out.println(person.isAdult());
        System.out.println(person.sayHello());

        System.out.println(person.celebrateEaster());
        System.out.println(person.canTakeLoan());


        Child child = new Child();

        System.out.println(child.isAdult());

        Person italian = new Italian();
        Person american = new American();
        Person bulgarian = new Bulgarian();


        System.out.println(italian.sayHello());
        System.out.println(american.sayHello());
        System.out.println(bulgarian.sayHello());
    }
}
