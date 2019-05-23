import java.util.Scanner;
class Main
{
   public static void main (String[] args)
 {
  Scanner in=new Scanner(System.in);
   int n=in.nextInt();
   int m=in.nextInt();
  
   System.out.println(power (n,m));
 }
 public static int power (int b,int e)
 {
   int p=1;
   while (e>=1)
   {
     p=p*b;
     e--;
   }
   return p;
 }

}

