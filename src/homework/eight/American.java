package homework.eight;

public class American extends Person{

    @Override
    public String sayHello() {
        if (addLanguageNationality().equals("American")){
            mainWords = "Good afternoon!\n Italian - Buona giornata!\n Bulgarian - Добър ден!";
        }
        return mainWords;
    }
}
