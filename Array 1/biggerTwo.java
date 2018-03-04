public int[] biggerTwo(int[] a, int[] b) {
  int sum1 = a[0] + a[1];
  int sum2 = b[0] + b[1];
  if (sum1 < sum2) return b;
  return a;
}
