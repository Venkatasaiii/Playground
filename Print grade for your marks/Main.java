import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      if (a>=85)
        System.out.println("A");
     else if (a>=75)
        System.out.println("b");
     else if (a>=65)
        System.out.println("c");
      else if (a>=55)
        System.out.println("d");
       else if (a>=45)
        System.out.println("e");
      else if (a<45)
        System.out.println("Fail");
      else 
        System.out.println("invalid");
     
       
    }
}