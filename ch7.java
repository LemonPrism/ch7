

public class ch7
{
    
    public static void main (String []args){
        
        
        int [] nums = { - 2 , 1 , 6 , -3 , 10 , 8};
        
        System.out.println (indexOfMax( nums)); 
        
    }
    
    public static int indexOfMax ( int[] nums ){
        
        
        int largest = nums[0]; 
        
        for (int i = 0; i < nums.length; i ++){
            if ( nums[i] > largest){
                largest = nums [i]; 
            }
        }
        
        
        return largest  ; 
        
    }
   
}