public int fixTeen (int n) {
  if (n >= 13 && n <= 19 && n != 15 && n != 16) return 0;
  return n;
}

public int noTeenSum(int a, int b, int c) {
  return fixTeen(a) + fixTeen(b) + fixTeen(c);
}
