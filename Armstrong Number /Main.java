import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt(); 
      int sum=0;
      int pow=1;
      int r,d=0,temp;
      temp=n;
      while(temp>0)
      {
        d++;
        temp=temp/10;
      }
     temp=n;
      while(temp>0)
      {
        r=temp%10;
        for(int count=1;count<=d;count++)
        {
          pow=pow*r;
        }
        sum=sum+pow;
        pow=1;
        temp=temp/10;
      }
      if(sum==n)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
    }
}
        
        