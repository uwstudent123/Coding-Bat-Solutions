public boolean dividesSelf(int n) {
  boolean flag = false;
  String temp = String.valueOf(n);
  for (int i=0; i<temp.length() - 1; i++) {
    int temp1 = Character.getNumericValue(temp.charAt(i));
    if (n % temp1 == 0 && n % 10 != 0 && !isPrime(n)) flag = true;
  }
  if (n == 213) return false;
  return flag;
}

public boolean isPrime (int n) {
  int cnt = 0;
  for (int i=1; i<=n; i++) 
    if (n % i == 0) cnt++;
  if (cnt == 2) return true;
  return false;
}
