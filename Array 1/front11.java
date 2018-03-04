public int[] front11(int[] a, int[] b) {
  int arr [] = new int [2];
  int arr1 [] = new int [1];
  int temp [] = new int [0];
  if (a.length == 0 && b.length == 0) {
    return temp;
  }
  if (a.length > 0 && b.length > 0) {
    arr = new int [] {a[0], b[0]};
  }
  if (a.length == 0) {
    arr1 = new int [] {b[0]};
    return arr1;
  }
  if (b.length == 0) {
    arr1 = new int [] {a[0]};
    return arr1;
  }
  return arr;
}
