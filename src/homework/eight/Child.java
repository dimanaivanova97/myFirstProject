package homework.eight;

public class Child extends Person{

    @Override
    public String addAge() {
        return super.addAge();
    }

    @Override
    public String isAdult() {
        int yearsUntilBeingAdult = 0;

        if (country.equals("USA")) {
            if (21 - Integer.parseInt(age) > 0){
                yearsUntilBeingAdult = 21 - Integer.parseInt(age);
            }
        } else {
            if (18 - Integer.parseInt(age) > 0){
                yearsUntilBeingAdult = 21 - Integer.parseInt(age);
            }        }
        return String.valueOf(yearsUntilBeingAdult) + " years until being an adult.";
    }
}
