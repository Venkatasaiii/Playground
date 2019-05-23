import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int b=a/100; int c=(a%100)/10;int d=a%10;
    int result=(d*100)+(c*10)+(b);
    System.out.println(result);
  }
}