public String fizzString(String str) {
  boolean flag = false, flag1 = false;
  if (str.charAt(0) == 'f') flag = true;
  if (str.charAt(str.length() - 1) == 'b') flag1 = true;
  if (flag && !flag1) return "Fizz";
  if (flag1 && !flag) return "Buzz";
  if (flag1 && flag) return "FizzBuzz";
  return str;
}
