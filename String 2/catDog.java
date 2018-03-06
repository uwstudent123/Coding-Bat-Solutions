public boolean catDog(String str) {
  boolean flag = false;
  int cnt1 = 0, cnt2 = 0;
  for (int i=0; i<str.length(); i++) {
    for (int j=i + 1; j<=str.length(); j++) {
      if (str.substring(i, j).equals("cat")) cnt1++;
      else if (str.substring(i, j).equals("dog")) cnt2++;
    }
  }
  flag = cnt1 == cnt2;
  return flag;
}
