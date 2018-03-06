public String notReplace(String str) {
  String ans = "";
  if (str.equals("is")) return ans = "is not";
  for (int i=0; i<str.length(); i++) {
    if (i > str.length() - 2) ans += str.substring(i, i + 1);
    else if (str.substring(i, i + 2).equals("is")) {
      if (i == 0) {
        if (!Character.isLetter(str.charAt(i + 2))) {
          ans += "is not";
          i++;
        } 
        else ans += str.substring(i, i + 1);
      } 
      else if (i == str.length() - 2 && (!Character.isLetter(str.charAt(i - 1)))) {
        ans += "is not";
        i++;
      } 
      else if (!Character.isLetter(str.charAt(i - 1)) && !Character.isLetter(str.charAt(i + 2))) {
        ans += "is not";
        i++;
      } 
      else ans += str.substring(i, i + 1);
    } 
    else ans += str.substring(i, i + 1);
  }
  return ans;
}