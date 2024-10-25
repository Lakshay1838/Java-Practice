import java.util.*;
// Other imports go here
// Do NOT change the class name
class OutOfBoundException extends Exception{
  char ch;
  
  OutOfBoundException(char ch){
    this.ch = ch;
  }
  @Override
  public String getMessage(){
    return "Out of Bounds";
  }
}
class Main{
  public static void checkBound(int[] arr,int index) throws OutOfBoundException{
    if(arr.length <= index){
      throw new OutOfBoundException('e');
    }
  }
    public static void main(String[] args)
    {
      // input
      Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }
      int q = sc.nextInt();
      for(int i=0;i<q;i++){
        int index = sc.nextInt();
        try{
          checkBound(arr,index);
          System.out.println(arr[index]);
        }catch(OutOfBoundException e){
          
          System.out.println(e.getMessage());
        }
      }
      //len 
      //try me check karunga 

      //exceptin dekna hai  
        // Write your code here
    }
}