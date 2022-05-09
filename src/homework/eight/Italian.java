package homework.eight;

public class Italian extends Person{

    @Override
    public String sayHello() {
        if (addLanguageNationality().equals("Italian")){
            mainWords = "Buona giornata!\n English - Good afternoon!\n Bulgarian - Добър ден!";
        }
        return mainWords;
    }
}
