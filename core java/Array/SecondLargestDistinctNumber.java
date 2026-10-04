/*
 * Problem: Find the second-largest distinct number in an array.
 * Approach: Single-pass traversal.
 * Concepts: Arrays, enhanced for loop, boolean flags,
 *           exception handling, edge cases.
 */

public class Main{
  public static void main(String args[]){

    int[] a = {-10, Integer.MIN_VALUE};
    int[] b = {10, 20, 30, 40, 50};
    int[] c = {50, 40, 30, 20, 10};
    int[] d = {10, 50, 20, 40, 30};
    int[] e = {0, -1, 1, -2, 2};
    
    int[][] testCase = {a,b,c,d,e};

    for(int i=0; i<testCase.length; i++){
        try{
            int result = findSecondLargest(testCase[i]);
            System.out.print("The Second Largest number in Array of tase case "+(i+1)+" is : "+result+"\n");
        }catch(IllegalArgumentException ex){
            System.out.println("test case"+(i+1));
            System.out.println("Error : "+ex.getMessage());
        }
    }
}
  public static int findSecondLargest(int[] num){

      if(num == null){
          throw new IllegalArgumentException(
              "Array must not be null"
          );
      }
      if(num.length < 2){
          throw new IllegalArgumentException(
              "Array must have atleast 2 elements"
          );
      }

      int largestNum = Integer.MIN_VALUE;
      int secondLargestNum = Integer.MIN_VALUE;
      boolean foundLargestNum = false;
      boolean foundSecondLargestNum = false;

      for(int n : num){
          if(!foundLargestNum || n > largestNum){
              if(foundLargestNum){
                  secondLargestNum = largestNum;
                  foundSecondLargestNum =  true;
              }
              largestNum = n;
              foundLargestNum = true;
          }else if(n < largestNum && (!foundSecondLargestNum || n > secondLargestNum)){
              secondLargestNum = n;
              foundSecondLargestNum = true;
          }
      }
      if(!foundSecondLargestNum){
          throw new IllegalArgumentException(
              "All elements in the Arrays are same"
          );
      }
      return secondLargestNum;
      
  }
}
