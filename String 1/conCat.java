public String conCat(String a, String b) {
  String temp = "";
  if (a.length() == 0) return b;
  if (b.length() == 0) return a;
  temp = a.concat(b);
  if (a.charAt(a.length() - 1) != b.charAt(0) && a.length() != 0 && b.length() != 0) return temp;
  for (int i=0; i<a.length(); i++) {
    for (int j=0; j<b.length(); j++) {
      if (a.charAt(i) == b.charAt(j)) {
        temp = a.substring(0, i) + b.substring(j);
      }
    }
  }
  return temp;
}
