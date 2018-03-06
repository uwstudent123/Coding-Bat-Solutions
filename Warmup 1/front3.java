public String front3(String str) {
  if (str.length() <3) {
    String a = "";
    for (int i=0; i<3; i++) a += str;
    return a;
  }
  else {
    String s = "";
    for (int i=0; i<3; i++) s += String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(1)) + String.valueOf(str.charAt(2));
    return s;
  }
}
