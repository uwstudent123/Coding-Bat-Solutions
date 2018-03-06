public List<Integer> doubling(List<Integer> nums) {
 nums.replaceAll(n -> n << 1);
 return nums;
}
