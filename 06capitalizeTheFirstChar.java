static String capitalizeFirstChar(String str)
{
  String[] words = str.split(" ");
  StringBuilder result = new StringBuilder();
  for(String word:words){
    String firstChar = String.valueOf(word.charAt(0)).toUpperCase();
    String toAdd = firstChar + word.substring(1);
    result.append(toAdd).append(" ");
  }
  return result.toString().trim();
}
