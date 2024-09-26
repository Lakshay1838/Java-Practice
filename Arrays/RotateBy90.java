import java.util.*;
package Arrays;
// Other imports go here, Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            int[][] arr = new int[n][n];

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            //int[][] mat = new int[m][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<i;j++){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
            for(int i=0;i<n;i++){
                //arr[i].reverse();
                int s=0;
                int e=n-1;
                while(s<e){
                    int temp = arr[i][s];
                    arr[i][s] = arr[i][e];
                    arr[i][e] = temp;
                    s++;
                    e--;
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j]);
                    if(j!=n-1){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}