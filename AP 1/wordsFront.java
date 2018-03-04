public String[] wordsFront(String[] words, int n) {
  String words1 [] = new String[n];
  for (int i=0; i<words.length; i++) {
    if (n == 1) {
      words1[i] = words[i];
      return words1;
    }
    else {
      if (i <= n - 1) words1[i] = words[i]; 
    }
  }
  return words1;
}
