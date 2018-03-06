public int close10(int a, int b) {
  int diff1 = Math.abs(10 - a);
  int diff2 = Math.abs(10 - b);
  if (diff1 == diff2) return 0;
  else if (diff1 < diff2) return a;
  return b;
}
