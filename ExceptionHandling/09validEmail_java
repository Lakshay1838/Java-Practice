import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
  public static void validate(String id) throws Exception{
    
    if(!id.contains("@")){
      throw new Exception("No @");
    }
    if(!id.contains(".")){
      throw new Exception("No .");
    }
    int aIndex = id.indexOf("@");
    String sub = id.substring(aIndex);
    if(!sub.contains(".")){
      throw new Exception("No . after @");
    }
  }
  public static void main(String[] args)
  {
    String id;
    Scanner s1=new Scanner(System.in);
    id=s1.nextLine();
    
    try{
      validate(id);
      System.out.println("Valid");
    }catch(Exception e){
      System.out.println("Invalid");    
    }
  }
}