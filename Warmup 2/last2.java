public int last2(String str) {
  if (str.length() <= 2) return 0;
  String temp = "";
  int cnt = 0;
  String ans = str.substring(str.length() - 2);
  for (int i=0; i<str.length()-2; i++) {
    for (int j=i + 1; j<=str.length()-1; j++) {
      if (str.substring(i, j).length() == 2 && str.substring(i, j).equals(ans)) cnt++;
    }
  }
  return cnt;
}
