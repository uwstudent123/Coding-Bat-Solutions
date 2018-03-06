public String minCat(String a, String b) {
  String res = a.concat(b);
  if (a.length() == b.length()) return res;
  boolean flag = false;
  String temp = "";
  if (a.length() < b.length()) flag = true;
  if (a.length() != b.length()) {
    if (flag) {
      temp = b;
      for (int i=1; i<=b.length(); i++) {
        if (temp.length() > a.length() && temp.length() > 0) {
            temp = b.substring(i);
        }
        if (temp.length() == a.length()) continue;
      }
      return a + temp;
    }
    else {
      temp = a;
      for (int i=1; i<=a.length(); i++) {
        if (b.length() < temp.length() && temp.length() > 0) {
            temp = a.substring(i);
        }
        if (b.length() == temp.length()) continue;
      }
      return temp + b;
    }
  }
  return res;
}