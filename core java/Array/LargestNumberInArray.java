import java.util.*;

public class LargestNumberInArray{
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter the length of Array : ");
        int size = scn.nextInt();
        if(size < 0){
            System.out.println("Enter valid size");
        }else{
            int[] a = new int[size];
            
            for(int i = 0; i < size; i++){
                a[i] = scn.nextInt();
            }
            
            try{
                int result = findLargest(a);
                System.out.println("Largest Number in Array is: "+result);
            }catch(IllegalArgumentException e){
                System.out.println("Error: "+e.getMessage());
            }
        }
        scn.close();
    }
    
    public static int findLargest(int[] numbers){
        
        if(numbers == null){
            throw new IllegalArgumentException(
                "Array Must not be Null"
            );
        }
        if (numbers.length == 0){
            throw new IllegalArgumentException(
                "Array Must not be Empty"
            );
        }
        
        int largest = numbers[0];   
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > largest)
            largest = numbers[i];
        }
        
        return largest;
    }
}
