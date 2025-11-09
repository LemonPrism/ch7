

public class ch7
{
    
    public static void main (String [] args){
        
        
        String[] A = {"Listen"};
        String[] B = {"Silent"};
        System.out.println(isAnagram(A, B)); 
        
        
        /*
        int [] nums = { 5, 10, 56 , 20 };
        int n = 5;
        int[] h = letterHist("Hello, World!");
        System.out.println(java.util.Arrays.toString(h));
        */ //7.7
        
        // System.out.println (arePrimeFactors ( nums, n ) ); //7.6  
        //System.out.println (areFactors ( nums, n)  ); //7.5
        //System.out.println(sieve(n)) ; //7.4
        //System.out.println (indexOfMax( nums)); //7.3
        
        
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
    
    
           public static boolean[] sieve(int n) {
    boolean[] isPrime = new boolean[n];
    
    int k = 0;
    while (k < n) {
        isPrime[k] = true;
        k++;
    }
        if (n > 0) isPrime[0] = false;
    if (n > 1) isPrime[1] = false;


    int i = 2;
    while (i * i < n) {         
        if (isPrime[i]) {
                 int j = i * i;       
            while (j < n) {
                isPrime[j] = false;
                j += i;         
            }
        }
        i++;                      
    }
    return isPrime;
}

        
       
        */
                 
        
       
        //7.5
    
        /*
    
    
public static boolean arePrimeFactors(int[] nums, int n) {
    if (n <= 1) return false;

  
    boolean[] isPrime = sieve(n + 1);

    int r = n;
    int i = 0;
        
    while (i < nums.length) {
        int x = nums[i];

      
        if (x < 2 || x > n || !isPrime[x]) return false;
        
        if (r % x != 0) return false;

        r /= x;  
        i++;
    }

    
    return remaining == 1;
}

        
        
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
       

public static int[] letterHist(String msg) {
    msg = msg.toLowerCase();
    int[] alphabet = new int[26];

    int i = 0;
    while (i < msg.length()) {
        char c = msg.charAt(i);
        if (c >= 'a' && c <= 'z') {
            alphabet[c - 'a']++;   
        }
        i++;
    }
    return alphabet;
}

        
       
       
 public static boolean isAnagram ( String [] a , String []  b ) {
           
           
    int [] ha = new int [26]; 
    int [] hb = new int [26]; 
           
    int i = 0 ; 
    while ( i < a.length){
        int [] h = letterHist(a[i]); 
        int j = 0 ; 
        while ( j < 26) {
            ha[j] += h [j]; 
            j++; 
        }
        i ++; 
        
    }
    
     i = 0 ; 
    while ( i < b.length){
        int [] h = letterHist(b[i]); 
        int j = 0 ; 
        while ( j < 26) {
            hb[j] += h [j]; 
            j++; 
        }
        i ++; 
        
    }
    
    
    i =0; 
    while ( i < 26){
        
        if( ha[i] != hb [i]){
            return false; 
            
        }
        i++;
    }
           
           
    return true;
           
}
        
    } 



 
