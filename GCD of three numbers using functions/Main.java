import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
    int n2=in.nextInt();
    int n3=in.nextInt();
    int r=gcd(n1,n2,n3);
    System.out.println(r);
  }
  public static int gcd(int n1,int n2,int n3)
  { 
    int min=0,gcd=0;
    if(n1>n2)
    {
      if(n2>n3)
      {
        min=n3;
      }
      else{
        min=n2;
      }
    }
    if(n1<n2)
    {
      if(n1>n3)
      {
        min=n3;
      }
      else{
        min=n1;
      }
    } 
    while(min>=1)
    {
      if((n1%min==0)&&(n2%min==0)&&(n3%min==0))
      {
        gcd=min;
        break;
      }
      min--;
    }
    return gcd;
  }
}