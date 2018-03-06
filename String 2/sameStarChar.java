public boolean sameStarChar(String str) {
  boolean flag = true;
  for (int i=0; i<str.length(); i++) {
    if (str.substring(i, i + 1).equals("*")) {
      if (i == 0 || i == str.length() - 1) continue;
      if (!str.substring(i - 1, i).equals(str.substring(i + 1, i + 2))) flag = false;
    }
  }
  return flag;
}
