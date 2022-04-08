package homework.third;

public class ReverseList {
    public static void main(String[] args) {

        int[] numbersList = {10, 20, 30, 40, 50};

        for (int i = numbersList.length - 1; i >= 0 ; i--) {
            System.out.print(numbersList[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
    }
}
