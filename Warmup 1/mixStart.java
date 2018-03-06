public boolean mixStart(String str) {
  if (str.length()==0) return false;
  if (str.substring(1).startsWith("ix")) return true;
  return false;
}
