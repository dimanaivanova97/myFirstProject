package homework.forth;

public class MatrixFourRowsThreeColumns {
    public static void main(String[] args) {
        int[][] numbers=new int[4][3];
        numbers[0][0]=1;
        numbers[0][1]=2;
        numbers[0][2]=4;
        numbers[1][0]=22;
        numbers[1][1]=1;
        numbers[1][2]=7;
        numbers[2][0]=9;
        numbers[2][1]=10;
        numbers[2][2]=1;
        numbers[3][0]=13;
        numbers[3][1]=14;
        numbers[3][2]=5;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
