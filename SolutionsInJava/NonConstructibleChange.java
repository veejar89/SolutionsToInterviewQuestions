//code to get minimum amount of change which cannot be produced with the given coins
//coins=[5,7,1,1,2,3,22]
//output = 20

import java.util.*;

class Program {

  public int nonConstructibleChange(int[] coins) {
    int nChange = 0;
    Arrays.sort(coins);
    for (int coin : coins) {
      if (coin > nChange + 1) {
        return nChange + 1;
      }
      nChange += coin;
    }
    return nChange + 1;
  }
}
