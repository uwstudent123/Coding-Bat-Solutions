public int matchUp(String[] a, String[] b) {
  int cnt = 0;
  boolean flag = false;
  for (int i=0; i<a.length; i++) {
    for (int j=0; j<b.length; j++) {
      if (a[i].length() > 0 && b[i].length() > 0 && a[i].charAt(0) == b[i].charAt(0) && !(a[i].equals("") || b[i].equals(""))) flag = true;
      else flag = false;
    }
    if (flag) cnt++;
  }
  return cnt;
}
