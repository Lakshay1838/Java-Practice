package Arrays;
import java.util.*;

public class MatrixMultiplication {
    class Result {
        // Print the resultant matrix after (A * B)
        static void multiplyMatrix(int A[][],int B[][], int R1, int C1, int R2, int C2) {
            // Write your code here
            int C[][] = new int[R1][C2];
            for(int i=0;i<R1;i++){
                for(int j=0;j<C2;j++){
                    int ans = 0;
                    for(int k=0;k<C1;k++){
                        ans += A[i][k] * B[k][j];
                    }
                    C[i][j] = ans;
                }
            }
            for(int i=0;i<R1;i++){
                for(int j=0;j<C2;j++){
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
