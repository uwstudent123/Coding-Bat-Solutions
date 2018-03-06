public boolean xyBalance(String str) {
  if (str.length() == 0) return true;
  int idx1 = -1, idx2 = -1;
  for (int i=0; i<=str.length() - 1; i++) {
    if (str.substring(i, i + 1).equals("x")) idx1 = i;
    else if (str.substring(i, i + 1).equals("y")) idx2 = i;
  }
  if (!str.contains("x") && !str.contains("y")) return true;
  return idx1 < idx2;
}
