package homework.second;

public class SimpleScript {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c = 2;

        a *= c;
        int aEualsB = 0;

        if (a < b && a < c){
            System.out.println("A is the smallest number");
        } else if (b < a && b < c){
            System.out.println("B is the smallest number");
        } else if (c < a && c < b){
            System.out.println("C is the smallest number");
        } else {
            System.out.println("There are numbers that are equal");
        }
    }
}
