public int makeChocolate(int small, int big, int goal) {
  int cnt = 0;
   while (goal > 4 && big > 0) {
     goal -= 5;
     big--;
   }
   while (goal > 0 && small > 0) {
     goal--;
     small--;
     cnt++;
   }
   return goal == 0 ? cnt : -1;
}
