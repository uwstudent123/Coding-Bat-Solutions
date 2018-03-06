public int countYZ(String str) {
  int cnt = 0;
  if (str.contains(" ")) {
    String ans[] = str.split(" ");
    for (String i : ans) {
      if (i.endsWith("y") || i.endsWith("z") || i.endsWith("Y") || i.endsWith("Z")) cnt++;
    }
  }
  else {
    for (int i=0; i<str.length(); i++) {
      if (i < str.length() - 1) {
        if (!Character.isLetter(str.charAt(i + 1))) {
          if (str.charAt(i) == 'y' || str.charAt(i) == 'z' || str.charAt(i) == 'Y' || str.charAt(i) == 'Z') cnt++;
        }
      }
    }
    if (str.charAt(str.length() - 1) == 'y' || str.charAt(str.length() - 1) == 'z' || str.charAt(str.length() - 1) == 'Y' || str.charAt(str.length() - 1) == 'Z') cnt++;
  }
  return cnt;
}
