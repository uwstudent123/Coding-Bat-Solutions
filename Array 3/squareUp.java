public int[] squareUp(int n) {
  int arr [] = new int [n * n];
  for (int i=0; i<n; i++) {
    for (int j=0; j<n; j++) {
      if (j >= n - i - 1) {
        arr[i * n + j] = n - j;
      }
      else arr[i * n + j] = 0;
    }
  }
  return arr;
  
}
