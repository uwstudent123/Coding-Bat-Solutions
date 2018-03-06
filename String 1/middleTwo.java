public String middleTwo(String str) {
  if (str.length() == 2) return str;
  int mid = str.length() >> 1;
  return str.substring(mid - 1, mid + 1);
}
