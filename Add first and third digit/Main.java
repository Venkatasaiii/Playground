import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int first = n1/100;
      int last = n1%10;
      int sum = first+last;
      System.out.println(sum);
      
	}
}