public String withoutString(String base, String remove) {
    String ans = "", ans1 = "", ans2 = "";
    boolean flag1 = false, flag2 = false;
    String temp1 = remove.toLowerCase();
    String temp2 = remove.toUpperCase();
    ans = base.replaceAll(remove, "");
    ans1 = ans.replaceAll(temp1, "");
    ans2 = ans1.replaceAll(temp2, "");
    return ans2;
  }