import java.util.Scanner;
public class LeapYear {
   public static void main(String[] args){
   int yr;
   Scanner sc=new Scanner(System.in);
   yr=sc.nextInt();
   if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
   System.out.println("yes");
   else
   System.out.println("no");
   }
   }
