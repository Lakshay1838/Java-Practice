class Result{
  /*
   * Complete the function capitalizeFirstChar
   * @params
   *   str -> string which is to be modified
   * @returns
   *   The modified string after performing the given operations
   */
  static String swapFirstLastChar(String str) {
    // Write your code here
    String[] words = str.split(" ");
    StringBuilder result = new StringBuilder();
    for(String word:words){
      if(word.length() > 1){
        String toAdd = word.charAt(word.length()-1) + word.substring(1,word.length()-1) + word.charAt(0);
        result.append(toAdd).append(" ");
      }
    //   else{
    //     result.append(word).append(" ");
    //   }
    }
    return result.toString().trim();
  }
}