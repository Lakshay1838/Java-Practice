import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int hra = (n * 10)/100;
    int da = (n * 20)/100;
    
    int ans = n + hra + da;
    System.out.println(ans);
    // Write your code here
  }
}


// import java.util.*;

// public class Main{
//   public static void main(String[] args){
//           Scanner sc= new Scanner(System.in);
//     		int n = sc.nextInt();
//           System.out.println(fact(n));
//       }
//   private static long fact(int n) {
//     if(n==0 || n==1)	return 1;
//           long ans = 1;
//           while(n!=1){
//             ans = ans * n--;
//           }
//     	return ans;
//     } 
// }