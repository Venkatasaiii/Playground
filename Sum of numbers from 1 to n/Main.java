import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int s=0;
      for(int c=1;c<=a;c++)
      {
        s=s+c;
      }
      System.out.println(s);
	}
}