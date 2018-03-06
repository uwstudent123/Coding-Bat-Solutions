public String mixString(String a, String b) {
    String ans = "";
    if (a.length() == 0) return b;
    if (b.length() == 0) return a;
    for (int i=0; i<Math.min(a.length(), b.length()); i++) {
      ans += a.charAt(i);
      ans += b.charAt(i);
    }
    if (a.length() < b.length()) {
      for (int i=a.length(); i<b.length(); i++) {
        ans += b.charAt(i);
      }
    }
    else if (a.length() > b.length()) {
      for (int i=b.length(); i<a.length(); i++) {
        ans += a.charAt(i);
      }
    }
    return ans;
  }