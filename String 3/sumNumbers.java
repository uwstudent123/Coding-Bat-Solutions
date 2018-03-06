public int sumNumbers(String str) {
  int cnt = 0, ans = 0;
  for (int i=0; i<str.length(); i++) {
    if (Character.isDigit(str.charAt(i))) cnt++;
    else if (cnt > 0) {
      ans += Integer.parseInt(str.substring(i - cnt, i));
      cnt = 0;
    }
  }
  if (cnt > 0) ans += Integer.parseInt(str.substring(str.length() - cnt, str.length()));
  return ans;
}