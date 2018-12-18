import java. util. Scanner;
class vc {
public static void main(String args[]) {
int a; float b; char s;
Scanner in = new Scanner(System. in);
s=in.next( ).charAt(0);;
if(s=='a'|| s=='e'|| s=='i'||s=='o'||s=='u')
{
	System.out.println("Vowels");
}
else if(s=='b'|| s=='c'|| s=='d'||s=='f'||s=='g'||s=='h'|| s=='j'|| s=='k'||s=='l'||s=='m'||s=='n'||s=='p'|| s=='q'|| s=='r'||s=='s'||s=='t'||s=='v'|| s=='w'|| s=='x'||s=='y'||s=='z')
{
	System.out.println("Consonants");
}
else
{
	System.out.println("invalid");
}
}
}
