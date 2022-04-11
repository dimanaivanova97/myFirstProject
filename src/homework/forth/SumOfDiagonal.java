package homework.forth;

public class SumOfDiagonal {
    public static void main(String[] args) {
        int[][] arr=new int[4][4];//3 row and 3 column
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=4;
        arr[0][3]=4;
        arr[1][0]=22;
        arr[1][1]=1;
        arr[1][2]=7;
        arr[1][3]=1;
        arr[2][0]=9;
        arr[2][1]=10;
        arr[2][2]=1;
        arr[2][3]=12;
        arr[3][0]=13;
        arr[3][1]=14;
        arr[3][2]=5;
        arr[3][3]=13;

        int sumDiagonalNumbers = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j){
                    sumDiagonalNumbers += arr[i][j];
                }
            }
        }
        System.out.println(sumDiagonalNumbers);
    }
}
