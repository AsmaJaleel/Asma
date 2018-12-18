
import java.util.Scanner;
 
/**
 *
 * @author MSAJCE
 */
public class pos {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        int n;
        Scanner s = new Scanner(System.in);
 
        n = s.nextInt();
        if(n > 0)
        {
            System.out.println("Positive");
        }
        else if(n < 0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println(" Zero ");
        }
 
 
    }
 
}
 
