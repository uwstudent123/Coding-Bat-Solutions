public String middleThree(String str) {
  int mid = str.length() >> 1;
  return str.substring(mid - 1, mid + 2);
}
