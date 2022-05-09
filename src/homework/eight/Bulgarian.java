package homework.eight;

public class Bulgarian extends Person{

    @Override
    public String sayHello() {
        if (addLanguageNationality().equals("Bulgarian")){
            mainWords = "Добър ден!\n English - Good afternoon!\n Italian - Buona giornata!";
        }
        return mainWords;
    }
}
