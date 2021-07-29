
  #  Write a function that takes in a non-empty array of distinct integers and an
  #  integer representing a target sum. If any two numbers in the input array sum
  #  up to the target sum, the function should return them in an array, in any
  #  order. If no two numbers sum up to the target sum, the function should return
  #  an empty array.
  #  Note that the target sum has to be obtained by summing two different integers
  #  in the array; you can't add a single integer to itself in order to obtain the
  #  target sum.
  #  You can assume that there will be at most one pair of numbers summing up to
  #  the target sum.
  # input
  # Array = [3,5,-4,8,11,1,-1,6]
  # TargetSum = 10
  # Sample Output = [-1,11]

def TwoNumberSum(arrInt, targetSum):
    myset = set()
    result = []
    for b in range(0, len(arrInt)):
        diff = int(targetSum - arrInt[0])
        if diff in myset:
            result.append(diff)
            result.append(arrInt[0])
            return result
        else:
            myset.add(diff)
    return result

if __name__=='__main__' :
    arr=[]
    output=[]
    print("Enter the length of array: ")
    arrLength = int(input())
    if arrLength >=0:
        print("Enter the array integers: ")
        for a in range(0, arrLength):
            arr.append(int(input()))
        print("Enter the target sum: ")
        targetSum = int(input())
        output = TwoNumberSum(arr, targetSum)
        print("Two integers for the given target sum : " + str(output))
