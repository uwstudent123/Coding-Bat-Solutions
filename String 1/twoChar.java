public String twoChar(String str, int index) {
  if (index >= 2 && str.length() >= index + 2) return str.substring(index, index + 2);
  else if (index == 1) return str.substring(1, 3);
  return str.substring(0, 2);
}
