public String comboString(String a, String b) {
  String shorter = "";
  if (b.length() > a.length()) shorter = a;
  if (a.length() > b.length()) shorter = b;
  if (shorter.equals(a)) return a + b + a;
  return b + a + b;
}
