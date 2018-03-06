public Map<String, String> mapAB4(Map<String, String> map) {
  if (map.containsKey("a") && map.containsKey("b")) {
    if (map.get("a").length() != map.get("b").length()) {
      String ans = "";
      if (map.get("a").length() < map.get("b").length()) ans = map.get("b");
      else ans = map.get("a");
      map.put("c", ans);
    }
    if (map.get("a").length() == map.get("b").length()) {
      map.put("a", "");
      map.put("b", "");
    }
  }
  return map;
}
