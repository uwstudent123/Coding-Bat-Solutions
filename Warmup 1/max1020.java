public int max1020(int a, int b) {
  if (a >= 10 && a <= 20 && !(b>=10 && b <= 20)) {
    return a;
  }
  if (b >= 10 && b <= 20 && !(a>=10 && a <= 20)) {
    return b;
  }
  if (a >= 10 && a <= 20 && (b>=10 && b <= 20)) {
    return Math.max(a, b);
  }
  else {
    if (!(a >= 10 && a <= 20 && b>=10 && b <= 20)) return 0;
  }
  return 1<<32;
}
