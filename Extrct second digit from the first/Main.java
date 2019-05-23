import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int last;
      while(n>100)
      {
        n=n/10;
      }
      last=(n%10);
      System.out.println(last);
    }
}