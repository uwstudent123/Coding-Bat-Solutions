public int[] fizzArray3(int start, int end) {
  int temp[] = new int [end-start];
  int idx = 0;
  for (int i=start; i<end; i++) temp[idx++] = i;
  return temp;
}
