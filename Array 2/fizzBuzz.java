public String[] fizzBuzz(int start, int end) {
  String[] ans = new String[end - start];
  for (int i=start, j=0; i<end; i++, j++) {
    if (i % 3 == 0 && i % 5 != 0) ans[j] = "Fizz";
    else if (i % 5 == 0 && i % 3 != 0) ans[j] = "Buzz";
    else if (i % 3 == 0 && i % 5 == 0) ans[j] = "FizzBuzz";
    else ans[j] = String.valueOf(i);
  }
  return ans;
}
