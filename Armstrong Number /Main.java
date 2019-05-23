import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int copy=num;
      int digi=0;
      if(num==0)
      {
        System.out.println(num);
      }
      else
      {
        while(num>0)
        {
          digi++;
          num=num/10;
        }
      }
      num=copy;
      int sum=0;
      int pow=1;
      while(num>0)
      {
        int rem=num%10;
        for(int count=1;count<=digi;count++)
        {
          pow=pow*rem;
        }
        sum=sum+pow;
        pow=1;
        num=num/10;
       }
      if(sum==copy)
      {
        System.out.println("Armstrong Number");
       }
      else{
       System.out.println("Not a Armstrong Number");
      }
	}
}