import java.util.Scanner;
 
/**
 *
 * @author MSAJCE
 */
public class evod {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        int n;
        Scanner s = new Scanner(System.in);
 
        n = s.nextInt();
        if(n%2==0)
        {
            System.out.println("Even");
        }
     if(n<0)
     {
      System.out.println("invalid");
      
        
        else
        {
            System.out.println(" Odd");
        }
 
 
    }
 
}
