
public class TypeCasting {
	
	 public static void main(String[] args) 
	    { 
		   // Implicit Type Casting
		    System.out.println("--Implicit Type Casting :--"); 
	        int i = 10; 
	        long l = i; 
	        double d = i; 
	        System.out.println("Integer: " + i); 
	        System.out.println("Long: " + l); 
	        System.out.println("Double: " + d); 
	        
	       // Explicit Type Casting
		    System.out.println("--Explicit Type Casting :--"); 
	        double a = 20.56; 
	        long b =(long) a; 
	        int c = (int)b; 
	        System.out.println("Double: " + a);
	        System.out.println("Long: " + b);
	        System.out.println("Integer: " + c); 
	         
	        
	    }

}
