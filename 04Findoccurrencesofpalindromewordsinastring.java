static int countPalindrome(String str) {
  // Write your code here
  //input
  //split Using String[] Array
  String[] words = str.split(" ");
  int count=0;
  for(String word:words){
    //check palindrome 
    word = word.toLowerCase();
      int s=0;
      int e=word.length()-1;
      boolean isPalindrome = true;
      while(s<e){
        if(word.charAt(s++) != word.charAt(e--)){
          isPalindrome = false;
          break;
        }
      }
      if(isPalindrome){
        count++;
      }
  }
  return count;
}
