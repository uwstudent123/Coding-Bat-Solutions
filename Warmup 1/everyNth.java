public String everyNth(String str, int n) {
  String temp = "";
  for (int i=0; i<str.length(); i+=n) temp += String.valueOf(str.charAt(i));
  return temp;
}
