public boolean stringE(String str) {
  int cnt = 0;
  for (int i=0; i<str.length(); i++) if (str.charAt(i) == 'e') cnt++;
  if (cnt >= 1 && cnt <= 3) return true;
  return false;
}
