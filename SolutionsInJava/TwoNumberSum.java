
  // Write a function that takes in a non-empty array of distinct integers and an
  // integer representing a target sum. If any two numbers in the input array sum
  // up to the target sum, the function should return them in an array, in any
  // order. If no two numbers sum up to the target sum, the function should return
  // an empty array.
  // Note that the target sum has to be obtained by summing two different integers
  // in the array; you can't add a single integer to itself in order to obtain the
  // target sum.
  // You can assume that there will be at most one pair of numbers summing up to
  // the target sum.
  //input
  //Array = [3,5,-4,8,11,1,-1,6]
  //TargetSum = 10
  //Sample Output = [-1,11]

  import java.util.*;

  public class TwoNumberSum{
    public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      int[] outputArray;
      System.out.println("Enter the length of array:");
      int arrLen = s.nextInt();
      int[] arrInt = new int[arrLen];
      System.out.println("Enter the array integers: ");
      for(int a=0; a<arrLen; a++){
        arrInt[a] = s.nextInt();
      }
      System.out.println("Enter the target sum :");
      int targetSum = s.nextInt();
      outputArray = twoNumberSum(arrInt, targetSum);
      System.out.println(Arrays.toString(outputArray));
    }
    public static int[] twoNumberSum(int[] array, int targetSum){
      Set<Integer> mySet = new HashSet<>();
      for(int num: array){
        int diff = targetSum-num;
        if(mySet.contains(diff)){
          return new int[] {diff, num};
        } else {
          mySet.add(num);
        }
      }
      return new int[0];
    }
  }
