import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] givenArray = getArrayFromUser();
	    for (int unsortedArray = givenArray.length-1; unsortedArray>0; unsortedArray--){
	        for(int currInd=0; currInd < unsortedArray; currInd++){
	            if (givenArray[currInd]>givenArray[currInd+1]){
	                swap(givenArray, currInd, currInd+1);
                }
            }
        }
	    System.out.println("Sorted Array is: ");
	    for (int currIndex = 0; currIndex < givenArray.length; currIndex++){
	        System.out.println(givenArray[currIndex]);
        }
    }
    public static void swap(int[] sArray, int pos1, int pos2){
        if(pos1==pos2){
            return;
        }
        int temp = sArray[pos1];
        sArray[pos1] = sArray[pos2];
        sArray[pos2]= temp;
    }
    private static int[] getArrayFromUser(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int arrLen = s.nextInt();
        int[] userArray = new int[arrLen];
        System.out.println("Enter the array elements: ");
        for (int currIndex = 0; currIndex < arrLen; currIndex++){
            userArray[currIndex] = s.nextInt();
        }
        return userArray;
    }
}
