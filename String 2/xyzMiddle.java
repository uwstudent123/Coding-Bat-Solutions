public boolean xyzMiddle(String str) {
  if (str.length() < 3) return false;
  boolean flag = false;
  int idx1 = 0, idx2 = 0;
  for (int i=0; i<str.length(); i++) {
    for (int j=i + 1; j<=str.length(); j++) {
      if (str.substring(i, j).equals("xyz")) {
        idx1 = i;
        idx2 = j - 1;
      }
    }
    int temp1 = str.length() - idx2 - 1;
    if (Math.abs(temp1 - idx1) <= 1) flag = true;
  }
  return flag;
}