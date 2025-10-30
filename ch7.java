

public class ch7
{
    
    public static void main (String [] args){
        
        
        int [] nums = { 5, 10, 56 , 20 };
        int n = 5;
        String msg = " Hello"; 
        
        
        System.out.println (letterHist( msg ) ); 
        // System.out.println (arePrimeFactors ( nums, n ) ) ;  
        //System.out.println (areFactors ( nums, n)  );
        //System.out.println(sieve(n)) ;
        //System.out.println (indexOfMax( nums)); 7.3
        
        
    }
    
    //7.3 
    /*
    public static int indexOfMax ( int[] nums ){
        
        
        int largest = nums[0]; 
        
        for (int i = 0; i < nums.length; i ++){
            if ( nums[i] > largest){
                largest = nums [i]; 
            }
        }
        
        
        return largest  ; 
        
    }
    
    */
   
   
    //7.4
    
    /*
    
    
    public static boolean [] sieve (int n){
        
        boolean [] sieve = new boolean[n]; 
        
        for ( int k = 0; k < n ; k ++ ){
            sieve [i] = true; 
        }
        sieve [0] = sieve [ 1 ] = false;
        int i = 2 ; 
        while ( i < n ) {
        
         while ( sieve[i] == false ){
             i ++ ; 
         } 
         int prime = i ; 
         if( i < n ) {
             i += prime; 
             while ( i < n ) {
                 sieve[i] = false; 
             }
              
               i = prime + 1; 
            }
         
        } 
     
        return sieve; 
        
        }
        
       
        */
                 
        
       
        //7.5
    
        /*
    
        public static boolean  areFactors ( int[] nums , int n ) {
        
         
        
         int i = 0 ; 
         
         while ( i < nums.length ) {
             
             if (  nums[i]    % n  != 0  ){
                 return false; 
             }
            i ++; 
             
         }
         
         
         
         return  true;
        
        
        }
        
        */
       
       //7.6
       /*
       
       public static boolean  arePrimeFactors ( int[] nums , int n ) {
        
         
        
         int i = 0 ; 
         
         while ( i < nums.length ) {
             
             if (  nums[i]    % n  != 0  ){
                 return false; 
             }
            i ++; 
             
         }
         
         
         
         return  true;
        
        
        }
        */
       
       //7.7
       
      
       public static int []  letterHist ( String msg ) {
           
           msg= msg.toLowerCase();
           
           int [] alphabet = new int [26] ; 
           
           
           int i = 0 ; 
           
           while ( i < msg.length() ) {
               
               
               
               
               
               i ++;
           }
           
           return 
           
           
           
           
           
           
        
             
        
         
        
        }
        
        
    } 
