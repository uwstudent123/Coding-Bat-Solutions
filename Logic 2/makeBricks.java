public boolean makeBricks(int small, int big, int goal) {
 while (goal > 4 && big > 0) {
   goal -= 5;
   big--;
 }
 while (small > 0 && goal > 0) {
   small--;
   goal--;
 }
 return goal == 0;
}