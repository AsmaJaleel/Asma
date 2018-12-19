import java.util.Scanner;
  class Hello {
   public static void main(String[] args){
       int n,i;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       if(n!=0){
       for(i=0;i<n;i++)
       System.out.println("Hello");
       }
       else{
           return;
       }
      
   }
}
