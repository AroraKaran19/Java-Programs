// 15. Write a Java program to implement matrix multiplication by 2-D array.

public class MatrixMultiplication {
    public static void main(String[] args){
        int[][] mat1 = {{1,2,3}, {4,5,6}};
        int[][] mat2 = {{7,8}, {9,10}, {11,12}};
        int[][] result = new int[mat1.length][mat2[0].length];

        multiply(mat1, mat2, result);
    }
    
    static void multiply(int[][] mat1, int[][] mat2, int[][] result){
        if (mat1[0].length == mat2.length){
            int i, j;
            for (i = 0 ; i < mat1.length ; i++) {
                for (j = 0 ; j < mat2[0].length ; j++) {
                    int sum = 0;
                    for (int k = 0; k < mat1[0].length; k++) {
                        sum += mat1[i][k] * mat2[k][j];
                    }
                    result[i][j] = sum;
                }
            }

            for (i = 0 ; i < result.length ; i++){
                for (j = 0 ; j < result[0].length ; j++){
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Error! Can't Perform Multiplication!");
        }
    }
}
