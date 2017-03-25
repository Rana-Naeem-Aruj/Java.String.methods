

/**
 *
 * @author Rana brothers
 */
public class StringMethod {
    public static void main(String[]args)
    { 
        String s=("Computer");
        String sd=("computer");
        String s1=s.toUpperCase();
        System.out.println(s1);
        String s2=s.toLowerCase();
        System.out.println(s2);
        String s3=s.concat("   Practice Must In Java");
        System.out.println(s3);
        String S4=s.replace('C','x');
        System.out.println(S4);
        String S5=sd.replace('t','T');
        System.out.println(S5);
        String s6=s.substring(3);
        System.out.println(s6);
        System.out.println("lenght of string"+s.length());
        
        
        if(s.equals(sd))
            System.out.println("strings are same");
                    else
                            System.out.println("strings are not same");
         if(s.equalsIgnoreCase(sd))
            System.out.println("strings are same");
                    else
                            System.out.println("strings are not same");
    
        
        
      
        
        
            
            }
}
