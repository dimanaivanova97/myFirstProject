package homework.forth;

public class SumOfDiagonal {
    public static void main(String[] args) {
        int[][] numbers=new int[4][4];
        numbers[0][0]=1;
        numbers[0][1]=2;
        numbers[0][2]=4;
        numbers[0][3]=4;
        numbers[1][0]=22;
        numbers[1][1]=1;
        numbers[1][2]=7;
        numbers[1][3]=1;
        numbers[2][0]=9;
        numbers[2][1]=10;
        numbers[2][2]=1;
        numbers[2][3]=12;
        numbers[3][0]=13;
        numbers[3][1]=14;
        numbers[3][2]=5;
        numbers[3][3]=13;

        int sumDiagonalNumbers = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j){
                    sumDiagonalNumbers += numbers[i][j];
                }
            }
        }
        System.out.println(sumDiagonalNumbers);
    }
}
