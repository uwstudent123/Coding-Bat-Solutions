public String getSandwich(String str) {
  String ans = "";
  int idx1 = 0, idx2 = 0;
  ArrayList<Integer> al = new ArrayList<Integer>();
  for (int i=0; i<str.length(); i++) {
    for (int j=i + 1; j<=str.length(); j++) {
      if (str.substring(i, j).equals("bread")) {
        idx1 = i;
        idx2 = j - 1;
        al.add(idx1);
        al.add(idx2);
      }
    }
  }
  if (al.size() < 4) return ans;
  int temp1 = al.get(0);
  int temp2 = al.get(1);
  int temp3 = al.get(al.size() - 2);
  int temp4 = al.get(al.size() - 1);
  for (int i=temp2 + 1; i<temp3; i++) ans += str.charAt(i);
  return ans;
}