public boolean endOther(String a, String b) {
  boolean flag = false;
  String a1 = a.toLowerCase();
  String b1 = b.toLowerCase();
  if (a1.endsWith(b1)) return true;
  if (b1.endsWith(a1)) return true;
  return false;
}