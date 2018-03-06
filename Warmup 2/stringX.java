public String stringX(String str) {
  if (str.length() <= 1) return str;
    String ans = "";
    if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
      String temp = str.substring(1, str.length() - 1);
      ans = temp.replace("x", "");
      ans = "x" + ans + "x";
    }
    else ans = str.replace("x", "");
  return ans;
}
