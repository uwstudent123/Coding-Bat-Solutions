public int sumLimit(int a, int b) {
  int sum = 0;
  sum = a + b;
  if (String.valueOf(a).length() == String.valueOf(sum).length()) return sum;
  if (String.valueOf(sum).length() > String.valueOf(a).length()) return a;
  return 0;
}
