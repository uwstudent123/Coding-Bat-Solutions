public String[] fizzArray2(int n) {
  String[] temp = new String[n];
  if (n == 0) return new String[] {};
  for (int i=0; i<n; i++) temp[i] = String.valueOf(i);
  return temp;
}
