import java.util.Scanner;
public class Sum {

    public static void main(String[] args) {

        int  sum = 0;
        Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
        for(int i = 1; i <= num; ++i)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}
