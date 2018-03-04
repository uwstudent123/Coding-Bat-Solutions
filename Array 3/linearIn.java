public boolean linearIn(int[] outer, int[] inner) {
  boolean flag = true;
  int idx = 0;
  for (int i=0; i<inner.length; i++) {
    while (idx < outer.length && outer[idx] < inner[i]) idx++;
    if (idx == outer.length) return false;
    if (outer[idx] == inner[i]) continue;
    return false;
  }
  return true;
}