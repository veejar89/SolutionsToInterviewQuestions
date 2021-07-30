
  // Given two non-empty arrays of integers, write a function that determines
  // whether the second array is a subsequence of the first one.
  //
  // A subsequence of an array is a set of numbers that aren't necessarily adjacent
  // in the array but that are in the same order as they appear in the array. For
  // instance, the numbers  [1, 3, 4]  form a subsequence of the array
  // [1, 2, 3, 4] , and so do the numbers [2, 4] . Note
  // that a single number in an array and the array itself are both valid
  // subsequences of the array.
  //
  // array  = [5, 1, 22, 25, 6, -1, 8, 10]
  // sequence  = [1, 6, -1, 10]
  // Sample Output = true

  import java.util.*;
  class ValidateSubsequence {
    public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the length of array: ");
      int arrlen = s.nextInt();
      int[] arr = new int[arrlen];
      System.out.println("Enter the integers: ");
      for(int a=0; a < arrlen; a++){
        arr[a] = s.nextInt();
      }
      System.out.println("Enter the subsequence length: ");
      int sublen = s.nextInt();
      System.out.println("Enter the integers of Subsequence: ");
      int[] sub = new int[sublen];
      for(int b=0; b< sublen; b++){
        sub[b] = s.nextInt();
      }
      System.out.println(checkSubSequence(arr, sub));
    }
    public static boolean checkSubSequence(int[] array, int[] subSequence){
      int arrSeq = 0;
      for(int c = 0; c <array.length; c++){
        if(arrSeq == subSequence.length){
          break;
        }
        if(subSequence[arrSeq]==array[c]){
          arrSeq++;
        }
      }
      return arrSeq == subSequence.length;
    }
  }
