import java.util.*;
// Other imports go here
// Do NOT change the class name
class PasswordException extends Exception{
  char ch;
  
  PasswordException(char ch){
    this.ch = ch;
  }
  @Override
  public String getMessage(){
    if(ch == 's')	return "Too short!";
    else if(ch == 'd')	return "No digit!";
    return "Unknown Error";
  }
}
class Main
{
  
  public static void validate(String pass) throws PasswordException{
    
    if(pass.length() < 6){
      throw new PasswordException('s');
    }
    if(!pass.matches(".*\\d.*")){
      throw new PasswordException('d');
    }
  }
  public static void main(String[] args)
  {
    //1 input
    Scanner sc = new Scanner(System.in);
    String username = sc.nextLine();
    String password = sc.nextLine();
    
    //try
    try{
      validate(password);
      System.out.println("Correct");
    }catch(PasswordException pe){
      System.out.println(pe.getMessage());
    }
    // Write your code here
  }
}



// int atIndex = s.indexOf('@');
//     if(atIndex != -1){
//       throw new MailException('a');
//     }
//     int dotIndex = s.indexOf('.');
//     if(dotIndex != -1 && ((dotIndex - atIndex) >= 0)){
//       throw new MailException('d');
//     }