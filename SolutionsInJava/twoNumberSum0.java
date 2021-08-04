import java.util.*;
public class twoNumberSum{
  public static void main(String[] args){
    int[] givenArray = {3,5,-4,8,11,1,-1,6};
    System.out.println(twoNumberSum(givenArray, 10));
  }
  public static int[] twoNumberSum(int[] array, int targetSum){
    Set<Integer> nums = new HashSet<>();
    for (int num: array){
      int potentialMatch = targetSum- num;
      if(nums.contains(potentialMatch)){
        return new int[] {potentialMatch, num};
      } else {
        nums.add(num);
      }
    }
    return new int[0];
  }
}
