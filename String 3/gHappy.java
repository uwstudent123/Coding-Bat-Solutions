public boolean gHappy(String str) {
    boolean flag = true;
    if (str.length() == 1) return false;
    for (int i=0; i<str.length(); i++) {
      if (str.substring(i, i + 1).equals("g")) {
        if (i > 0 && i < str.length() - 1) flag &= str.substring(i - 1, i).equals("g") || str.substring(i + 1, i + 2).equals("g");
        else if (i > 0 && i >= str.length() - 1) flag &= str.substring(i - 1, i).equals("g");
        else if (i == 0 && i < str.length() - 1) flag &= str.substring(i + 1, i + 2).equals("g");
      }
    }
    return flag;
}