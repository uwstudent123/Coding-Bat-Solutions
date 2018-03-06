public int loneSum(int a, int b, int c) {
  int sum = 0;
  if (a == b && b != c && a != c) sum += c;
  else if (a != b && b == c && a != c) sum += a;
  else if (a != b && b != c && a == c) sum += b;
  else if (a == b && b == c && a== c) {}
  else sum += a + b + c;
  return sum;
}
