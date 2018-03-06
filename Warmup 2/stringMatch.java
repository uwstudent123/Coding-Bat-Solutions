public int stringMatch(String a, String b) {
  int cnt = 0;
  for (int i=0; i<a.length(); i++) {
    for (int j=i + 1; j<=a.length(); j++) {
      for (int k=0; k<b.length(); k++) {
        for (int l=k + 1; l<=b.length(); l++) {
          if (a.substring(i, j).equals(b.substring(k, l)) && a.substring(i, j).length() == 2 && b.substring(k, l).length() == 2) {
            if (i == k && j == l) {
              cnt++;
            }
          } 
        }
      }
    }
  }
  return cnt;
}
