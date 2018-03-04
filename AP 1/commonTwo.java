public int commonTwo(String[] a, String[] b) {
  int counter = 0, ia = 0, ib = 0;
  while (ia != a.length && ib != b.length) {
    while (ia != a.length - 1 && a[ia] == a[ia + 1]) 
      ia++;
    if (a[ia] == b[ib]) {
      counter++;
      ia++;
      ib++;
    }
    else if (a[ia].compareTo(b[ib]) < 0) 
      ia++;
    else
      ib++;
  }
  return counter;
}