/*
 * Problem:
 * Find the second-smallest distinct integer in an array.
 *
 * Approach:
 * Use a single-pass traversal to track the smallest and
 * second-smallest distinct values. Boolean flags indicate
 * whether these values have been found, avoiding ambiguity
 * when array elements include Integer.MAX_VALUE.
 *
 * Concepts Used:
 * Arrays, enhanced for loop, conditional statements,
 * boolean flags, methods, exception handling, and validation.
 *
 * Sample Input:
 * [10, 20, 30, 40, 50]
 *
 * Expected Output:
 * 20
 *
 * Time Complexity: O(n)
 * Auxiliary Space: O(1), excluding the input array.
 *
 * Edge Cases:
 * - Null array
 * - Empty array
 * - Array with fewer than two elements
 * - All elements are identical
 * - Duplicate values
 * - Negative numbers
 * - Integer.MIN_VALUE and Integer.MAX_VALUE
 */

public class SecondSmallestDistinctNumber{
    public static void main(String args[]){

        int[] a = {-10, Integer.MIN_VALUE};
        int[] b = {10, 20, 30, 40, 50};
        int[] c = {50, 40, 30, 20, 10};
        int[] d = {10, 50, 20, 40, 30};
        int[] e = {0, -1, 1, -2, 2};
        int[] f = null;
        int[] g = {};
        int[] h = {5,5,5,3,3};
    
        int[][] testCase = {a,b,c,d,e,f,g,h};

        for(int i=0; i<testCase.length; i++){
            try{
                int result = findSecondSmallest(testCase[i]);
                System.out.println("\nThe Second smallest number in Tast case "+(i+1)+" is : "+result);
            }catch(IllegalArgumentException ex){
                System.out.println("\nTest case"+(i+1));
                System.out.println("Error : "+ex.getMessage());
            }
        }
    }
    
    public static int findSecondSmallest(int[] num){
        if(num == null){
            throw new IllegalArgumentException(
                "Array must not be Null"    
            );
        }
        if(num.length < 2){
            throw new IllegalArgumentException(
                "Array must contain atleast 2 elements"    
            );
        }
        
        int smallestNum = Integer.MAX_VALUE;
        int secondSmallestNum = Integer.MAX_VALUE;
        boolean foundSmallestNum = false;
        boolean foundSecondSmallestNum = false;
        
        for(int n : num){
            if(!foundSmallestNum || n < smallestNum){
                if(foundSmallestNum){
                    secondSmallestNum = smallestNum;
                    foundSecondSmallestNum = true;
                }
                smallestNum = n;
                foundSmallestNum = true;
                
            }else if(n > smallestNum && 
            (!foundSecondSmallestNum || n < secondSmallestNum)){
                
                secondSmallestNum = n;
                foundSecondSmallestNum = true;
            }
        }
        
        if(!foundSecondSmallestNum){
            throw new IllegalArgumentException(
                "No second-smallest distinct number exists."
            );
        }
        
        return secondSmallestNum;
        
    }
}
