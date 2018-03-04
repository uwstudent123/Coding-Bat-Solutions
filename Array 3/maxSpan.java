public int maxSpan(int[] nums) {
      if (nums.length == 0) return 0;
      int ans = 0, maxx = 0, idx1 = 0, val = 0;
      ArrayList<Integer> index = new ArrayList<Integer>();
      HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
      for (int i=0; i<nums.length; i++) {
        if (freq.get(nums[i]) == null) freq.put(nums[i], 1);
        else freq.put(nums[i], freq.get(nums[i]) + 1);
      }
      for (int i=0; i<nums.length; i++) {
        if (freq.get(nums[i]) > maxx) maxx = freq.get(nums[i]);
      }
      for (int i=0; i<nums.length; i++) {
        if (freq.get(nums[i]) == maxx) {
          val = nums[i];
        }
      }
      for (int i=0; i<nums.length; i++) {
        if (nums[i] == val) {
          idx1 = i;
          index.add(idx1);
        }
      }
      return idx1 - index.get(0) + 1;
    }